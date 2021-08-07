package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leevi
 * 日期2020-10-18  10:09
 */
@WebFilter("/*")
public class IllegalCharFilter implements Filter {
    private List<String> stringList = new ArrayList<>();
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //目标: 增强HttpServletRequest对象的getParameter()方法，让这个方法的返回值中的非法字符变成*
        HttpServletRequest request = (HttpServletRequest) req;

        //技术: 动态代理技术
        HttpServletRequest proxyRequest = (HttpServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), new Class[]{HttpServletRequest.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter()方法
                if (method.getName().equals("getParameter")) {
                    //改变: 这个方法的返回值
                    //执行它原本的方法获取返回值
                    String value = (String) method.invoke(request, args);
                    //判断返回值value中是否包含非法字符
                    for (String str : stringList) {
                        if(value.contains(str)){
                            //如果包含，则将非法字符替换成*
                            String xing = "";
                            for (int i = 0; i < str.length(); i++) {
                                xing += "*";
                            }

                            value = value.replace(str,xing);
                        }
                    }

                    return value;
                }

                //如果不是getParameter方法，则执行原来对象的方法
                return method.invoke(request,args);
            }
        });

        //如果请求参数中没有content，或者content中没有非法字符，都放行
        //放行的应该是
        chain.doFilter(proxyRequest, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        //在这进行illegal.txt文件的读取
        //读取illegal.txt文件里面的所有非法字符串
        //使用BufferReader来进行读取一行
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(IllegalCharFilter.class.getClassLoader().getResourceAsStream("illegal.txt"), "UTF-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                //每次循环得到的str，就是一个非法字符串
                stringList.add(str);
            }
        } catch (Exception e) {
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.itheima.demo8_动态代理加强;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 11:23
 */
//@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        /*
            对Collection接口进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素
            (比如集合中有多个“abc”,调用remove(“abc”)后只会删除一个元素)。
            代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】
         */
        // 创建ArrayList集合
        Collection<String> col = new ArrayList<>();
        // 添加元素
        col.add("abc");
        col.add("abc");
        col.add("bac");
        col.add("abc");
        col.add("abc");
        col.add("abc");
        System.out.println("删除前:" + col);// 删除前:[abc, abc, bac, abc, abc, abc]

        // 动态代理增强remove方法
        Collection<String> proxy = (Collection<String>) Proxy.newProxyInstance(col.getClass().getClassLoader(), col.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*
                    invoke方法:
                        参数1proxy:表示生成的代理对象,一般不用
                        参数2method:表示代理对象调用的方法
                        参数3args:表示代理对象调用方法传入的实际参数
                        返回值:表示代理对象调用方法的返回值
                 */
                // 代理对象调用方法就会来到这里,所以增强方法的代码就写在这,就可以了
                // 被代理对象执行一次代理对象调用的方法,来确定返回值  删除一个

                Object res = method.invoke(col, args);// col.remove("abc")  col.toArray();


                if (method.getName().equals("remove")) {
                    // 删除剩余的
                    // 获取col集合对象的迭代器
                    Iterator<String> it = col.iterator();
                    // 使用迭代器进行遍历
                    while (it.hasNext()) {
                        // 在循环中,判断遍历出来的元素是否是要删除的元素
                        String e = it.next();
                        if (e.equals(args[0])) {
                            // 如果是,就删除
                            it.remove();
                        }
                    }
                }

                if (method.getName().equals("toArray")) {
                    System.out.println("增强toArray方法...");

                }

                return res;

            }
        });

        // 代理对象删除元素
        boolean res = proxy.remove("abc");
        System.out.println(res);//true
        System.out.println("删除后:" + col);// 删除后:[bac]


        Object[] arr = proxy.toArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));


       /*
        // 集合对象删除元素
        boolean res = col.remove("abc");
        System.out.println(res);// true
        System.out.println("删除后:"+col);// 删除后:[abc, bac, abc, abc, abc]*/

    }
}

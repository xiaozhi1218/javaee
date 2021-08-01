package com.itheima.demo21_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 16:35
 */
public class Test {
    public static void main(String[] args) {
        /*
            概述 : 动态代理就是直接通过反射生成一个代理对象,代理对象所属的类是不需要存在的
            动态代理的获取:
                jdk提供一个Proxy类可以直接给实现接口类的对象直接生成代理对象
                例如:使用Proxy直接给JinLian生成一个代理对象,该对象所属的类不知道
            api:
                Java.lang.reflect.Proxy类可以直接生成一个代理对象
                    - public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)生成一个代理对象
                    - 参数1:ClassLoader loader 被代理对象的类加载器
                    - 参数2:Class<?>[] interfaces 被代理对象的要实现的接口
                    - 参数3:InvocationHandler h (接口)执行处理类
                    - 返回值: 代理对象
                    - 前2个参数是为了帮助在jvm内部生成被代理对象的代理对象,第3个参数,用来监听代理对象调用方法,帮助我们调用方法

            - InvocationHandler中的Object invoke(Object proxy, Method method, Object[] args)方法：调用代理类的任何方法，此方法都会执行
                  - 参数1:代理对象(慎用)
                  - 参数2:当前执行的方法
                  - 参数3:当前执行的方法运行时传递过来的参数
                  - 返回值:当前方法执行的返回值


         */
        // 创建金莲对象
        JinLian jl = new JinLian();

        // 动态获取jl的代理对象
        Happy proxy = (Happy) Proxy.newProxyInstance(JinLian.class.getClassLoader(), JinLian.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("happy")){
                    System.out.println("王婆以做头发的名义把金莲和西门约到房间...");
                    // 通过反射来调用被代理对象的方法
                    method.invoke(jl);
                    System.out.println("王婆打扫战场...");
                }
                return null;
            }
        });

        // 代理对象调用代理的方法
        proxy.happy();

    }
}

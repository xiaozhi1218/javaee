package com.itheima.demo19_完成注解的MyTest案例;

import java.lang.reflect.Method;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 16:03
 */
public class MainTest {
    public static void main(String[] args) throws Exception{
        // 在main方法中,让TestDemo类中含有@MyTest方法执行
        // 1.获取TestDemo类的字节码对象
        Class<TestDemo> c = TestDemo.class;
        TestDemo testDemo = c.newInstance();

        // 2.获取该字节码对象中的所有方法
        Method[] arr = c.getMethods();

        // 3.循环遍历所有方法
        for (Method m : arr) {
            // 4.判断遍历出来的方法是否有@MyTest注解,如果有,就让该方法执行
            if (m.isAnnotationPresent(MyTest.class)){
                m.invoke(testDemo);
            }
        }
    }
}

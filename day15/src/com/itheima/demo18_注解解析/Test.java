package com.itheima.demo18_注解解析;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 15:25
 */
@MyAnnotation(names={"张三"},age=18)
public class Test {
    public static void main(String[] args)throws Exception {
        /*
            注解解析:
                java.lang.reflect.AnnotatedElement接口: Class、Method、Field、Constructor等实现了该接口
                    - T getAnnotation(Class<T> annotationType):得到指定类型的注解引用。没有返回null。
                    - boolean isAnnotationPresent(Class<?extends Annotation> annotationType)：
                        判断指定的注解有没有。
        */
        // 需求:获取Test类上的注解对象,并且获取该注解的属性值
        // 1.获取Test类的Class对象
        Class<Test> c = Test.class;

        // 2.获取该Class对象上的注解对象
        MyAnnotation myAnnotation = c.getAnnotation(MyAnnotation.class);


        // 3.根据注解对象获取该注解的属性值
        String[] names = myAnnotation.names();
        System.out.println(Arrays.toString(names));// [张三]

        int age = myAnnotation.age();
        System.out.println(age);// 18

        System.out.println("======================================");
        // 需求:获取show1方法上的注解对象,并且获取该注解的属性值
        // 1.获取show1方法的Method对象
        Method m = c.getDeclaredMethod("show1");

        // 2.获取该方法上的注解对象
        MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

        // 3.根据注解对象获取该注解的属性值
        System.out.println(Arrays.toString(annotation.names()));// ["李四"]
        System.out.println(annotation.age());// 19

        System.out.println("======================================");

        // 需求3:判断Test类中的方法是否包含MyAnnotation注解
        // 1.获取show2方法的Method对象
        Method m2 = c.getDeclaredMethod("show2");

        // 判断show1方法是否包含MyAnnotation注解
        System.out.println(m.isAnnotationPresent(MyAnnotation.class));// true

        // 判断show2方法是否包含MyAnnotation注解
        System.out.println(m2.isAnnotationPresent(MyAnnotation.class));// false
    }

    @MyAnnotation(names="李四",age=19)
    public void show1(){

    }


    public void show2(){

    }
}

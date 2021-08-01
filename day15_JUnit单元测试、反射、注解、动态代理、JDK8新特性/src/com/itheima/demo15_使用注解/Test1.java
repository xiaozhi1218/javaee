package com.itheima.demo15_使用注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 14:49
 */
@MyAnnotation1
@MyAnnotation2(name="张三",age=18,arr={"itheima","itcast"})
public class Test1 {
    @MyAnnotation1
    String str;

    @MyAnnotation1
    @MyAnnotation2(name="张三",age=18,arr={"itheima","itcast"})
    public static void main(String[] args) {
        /*
            注解使用:
                不带属性的注解:@注解名
                带属性的注解: @注解名(属性名=属性值,属性名=属性值,...)

            注意:带有属性的注解在使用的时候一定要给属性赋值,并且所有属性都要赋值
         */
        @MyAnnotation1
        @MyAnnotation2(name="张三",age=18,arr={"itheima","itcast"})
        int num = 10;
    }
}

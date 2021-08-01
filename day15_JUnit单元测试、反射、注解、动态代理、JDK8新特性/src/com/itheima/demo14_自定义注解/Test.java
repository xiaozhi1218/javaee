package com.itheima.demo14_自定义注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 12:22
 */
@MyAnnotation1
public class Test {
    @MyAnnotation1
    public static void main(String[] args) {
        /*
            自定义注解:
                格式:
                    public @interface 接口名{
                        属性
                    }
                注解属性:
                    数据类型 属性名();
                属性类型:
                    1.基本类型
                    2.String
                    3.Class类型
                    4.注解类型
                    5. 枚举类型
                    6.以上类型的一维数组类型
         */
        @MyAnnotation1
        int num;
    }
}

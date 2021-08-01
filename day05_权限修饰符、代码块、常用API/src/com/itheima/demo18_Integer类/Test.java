package com.itheima.demo18_Integer类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 16:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            Integer类:
                概述:包装一个对象中的原始类型 int 的值
                构造方法:
                      public Integer(int   value)            	根据 int 值创建 Integer 对象(过时)
                      public Integer(String s)               	根据 String 值创建 Integer 对象(过时)

                成员方法:
                      public static Integer valueOf(int i)   	返回表示指定的 int 值的 Integer   实例
                      public static Integer valueOf(String s)	返回保存指定String值的 Integer 对象
                      public  int intValue()  返回Integer表示的整数
         */
        // int--->Integer
        Integer i1 = new Integer(10);// i1对象表示的整数就是10
        Integer i2 = Integer.valueOf(10);//    i2对象表示的整数就是10

        // String--->Integer
        Integer i3 = new Integer("100");// i3对象表示的整数就是100
        Integer i4 = Integer.valueOf("100");// i4对象表示的整数就是100

        // Integer--->int
        int num1 = i1.intValue();
        int num2 = i2.intValue();
        int num3 = i3.intValue();
        int num4 = i4.intValue();
    }
}

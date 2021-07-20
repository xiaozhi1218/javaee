package com.itheima.demo1_String类的构造方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 8:44
 * 构造方法通过new来调用
 * 成员方法:
 *      非静态成员方法:通过对象名来调用
 *      静态成员方法:通过类名来调用
 * 方法:
 *      无返回值:直接调用
 *      有返回值:
 *          直接调用
 *          赋值调用
 *          输出调用
 */
public class Test {
    public static void main(String[] args) {
        /*
            public   String() 创建一个空白字符串对象，不含有任何内容
            public   String(char[] chs) 根据字符数组的内容，来创建字符串对象
            public   String(char[] value, int offset, int count) 根据指定字符数组范围的内容，来创建字符串对象
            public   String(byte[] bys) 根据字节数组的内容，来创建字符串对象
            public   String(byte[] bytes, int offset, int length)根据指定字节数组范围的内容，来创建字符串对象
            String s =   “abc”;直接赋值的方式创建字符串对象，内容就是abc
         */
        // 创建空白字符串对象
        String str1 = new String();// str1字符串内容: ""
        System.out.println("="+str1+"=");// ==

        // 根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c','d'};
        String str2 = new String(chs);// str2字符串内容:"abcd"
        System.out.println(str2);// abcd

        // 根据指定字符数组范围的内容，来创建字符串对象
        String str3 = new String(chs, 0, 3);// str3字符串内容:"abc"
        System.out.println(str3);// abc

        // 根据字节数组的内容，来创建字符串对象
        byte[] bys = {97,98,99,100,101,102};
        String str4 = new String(bys);// str4字符串内容:"abcdef"
        System.out.println(str4);// abcdef

        // 根据指定字节数组范围的内容，来创建字符串对象
        String str5 = new String(bys, 2, 3);// str5字符串内容:"cde"
        System.out.println(str5);// cde

        // 直接赋值的方式创建字符串对象
        String str6 = "abc";// str6字符串内容:"abc"
        System.out.println(str6);

    }
}

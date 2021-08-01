package com.itheima.demo3_字符串的比较;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 9:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            == 号的比较:
                如果是基本数据类型,比较的是数值
                如果是引用数据类型,比较的是地址值
            String类的equals方法:
                public boolean equals(Object s)     比较两个字符串内容是否相同、区分大小写
            String类的equalsIgnoreCase方法:
                public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小写。
         */
        // == 号的比较:
        //  如果是基本数据类型,比较的是数值
        int num1 = 10;
        int num2 = 10;
        int num3 = 20;
        System.out.println(num1 == num2);// true
        System.out.println(num1 == num3);// false

        System.out.println("====================================");

        // 如果是引用数据类型,比较的是地址值
        char[] chs = {'a','b','c'};
        String str1 = new String(chs);// str1字符串的内容是:abc
        String str2 = "abc";// str2字符串的内容是:abc
        System.out.println(str1 == str2);// 比较str1和str2对象的地址值:false

        System.out.println("====================================");

        // 比较str1和str2中的字符串内容是否相等
        System.out.println(str1.equals(str2));//  true

        // 比较str1和str3中的字符串内容是否相等,区分大小写
        String str3 = "Abc";// str3字符串的内容是:Abc
        System.out.println(str1.equals(str3));// false

        // 比较str2和str3中的字符串内容是否相等,区分大小写
        System.out.println(str2.equals(str3));// false

        System.out.println("====================================");

        // 比较str1和str3中的字符串内容是否相等,忽略大小写
        System.out.println(str1.equalsIgnoreCase(str3));// true

        // 比较str2和str3中的字符串内容是否相等,忽略大小写
        System.out.println(str2.equalsIgnoreCase(str3));// true

        // api: 怎么调用   方法名(idea大哥)   方法的功能(干什么用)

    }
}

package com.itheima.demo4_String类获取功能的方法;

import java.nio.channels.AsynchronousServerSocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 9:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            String类获取功能的方法:
            - public int length () ：返回此字符串的长度。
            - public String concat (String str) ：将指定的字符串连接到该字符串的末尾。拼接
            - public char charAt (int index) ：返回指定索引处的 char值。
            - public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
            - public int indexOf(String str, int fromIndex)  返回从指定索引位置查找,该子字符串第一次出现在该字符串内的索引。
            - public int lastIndexOf(String str) 返回指定子字符串最后一次出现在该字符串内的索引。
            - public int lastIndexOf(String str, int fromIndex) 返回从指定索引位置查找,,该子字符串最后一次出现在该字符串内的索引。
            - public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
            - public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
         */
        // 创建字符串对象
        String str = "hello-world!";

        // 获取字符串的长度(字符串的字符个数)
        int len = str.length();
        System.out.println("str的字符串长度是:"+len);// 12

        // str字符串末尾拼接上hello-itheima
        String newStr = str.concat("hello-itheima");
        System.out.println("拼接后的字符串:"+newStr);// hello-world!hello-itheima

        // 获取str中索引为1的字符
        char ch = str.charAt(1);
        System.out.println("索引为1的字符:"+ch);// e

        System.out.println("========================================================");
        // 创建字符串对象
        String str1 = "hello-world-hello-itheima-hello-java-hello-itcast";

        // 查找hello第一次出现的索引位置
        int index1 = str1.indexOf("hello");
        System.out.println("hello第一次出现的索引位置:"+index1);// 0

        // 查找hello第二次出现的索引位置
        int index2 = str1.indexOf("hello", index1+1);
        System.out.println("hello第二次出现的索引位置:"+index2);// 12

        // 查找hello第三次出现的索引位置
        int index3 = str1.indexOf("hello", index2+1);
        System.out.println("hello第三次出现的索引位置:"+index3);// 26

        System.out.println("========================================================");

        // 查找hello最后一次出现的索引位置
        int lastIndex1 = str1.lastIndexOf("hello");
        System.out.println("hello最后一次出现的索引位置:"+lastIndex1);// 37

        // 查找hello倒数第二次出现的索引位置
        int lastIndex2 = str1.lastIndexOf("hello", lastIndex1 - 1);
        System.out.println("hello倒数第二次出现的索引位置:"+lastIndex2);// 26

        System.out.println("========================================================");
        String str3 = "hello-world-hello-itheima";

        // 获取world-hello-itheima子字符串
        String subStr1 = str3.substring(6);
        System.out.println("subStr1:"+subStr1);// world-hello-itheima

        // 获取world-hello子字符串
        String subStr2 = str3.substring(6, 17);
        System.out.println("subStr2:"+subStr2);// world-hello

    }
}

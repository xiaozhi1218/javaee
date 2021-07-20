package com.itheima.demo10_扩展String类的方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 11:44
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            判断功能的方法
            ★boolean isEmpty(); //判断字符串是否为空(长度为0返回true，不为0返回false)
            ★boolean contains(CharSequence s);    //判断字符串中是否包含 给定的字符串。
            boolean endsWith(String s); //判断字符串是否以 给定的字符串 结尾。
            boolean startsWith(String s); //判断字符串是否以 给定的字符串 开头。

            ★replace(); //用新内容替代旧内容，返回新的字符串
            toLowerCase();  //把字母都转成其对应的小写形式。
            toUpperCase();  //把字母都转成其对应的大写形式。
            toCharArray() // 把字符串转换为数组
            getBytes() // 把字符串转换为字节数组
            ★trim();            //移除首尾空格。
            ★split();   //根据给定的内容，切割字符串，返回字符串数组

            注意:null不能调用方法,如果调用了就会报空指针异常NullPointerException
         */
        // 判断字符串是否为空
        String str1 = "";// 空字符串
        String str2 = "a";// 非空字符串
        System.out.println(str1.isEmpty());// true
        System.out.println(str2.isEmpty());// false

        System.out.println("=====================================");
        String str3 = "hello-world-hello-heima";
        // 判断str3字符串是否包含指定的子字符串
        System.out.println(str3.contains("heima"));// true
        System.out.println(str3.contains("itcast"));// false

        System.out.println("=====================================");
        // 判断str3字符串是否以hel开头
        System.out.println(str3.startsWith("hel"));// true
        // 判断str3字符串是否以hea开头
        System.out.println(str3.startsWith("hea"));// false

        // 判断str3字符串是否以ma结尾
        System.out.println(str3.endsWith("ma"));// true
        // 判断str3字符串是否以mab结尾
        System.out.println(str3.endsWith("mab"));// false
        // Hello.java   hb.jpg
        // 开发中,判断文件类型
        String fileName = "Hello.java";
        System.out.println("判断上传的文件是否是java文件:"+fileName.endsWith(".java"));// true

    }
}

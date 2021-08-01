package com.itheima.demo10_扩展String类的方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 11:57
 */
public class Test2 {
    public static void main(String[] args) {
        /*
             ★String replace(char oldChar,char newChar); //用新内容替代旧内容，返回新的字符串
             ★String replace(CharSequence oldStr,CharSequence newStr); //用新内容替代旧内容，返回新的字符串
            String toLowerCase();  //把字母都转成其对应的小写形式。
            String toUpperCase();  //把字母都转成其对应的大写形式。
            Char[] toCharArray() // 把字符串转换为数组
            byte[] getBytes() // 把字符串转换为字节数组
            ★String trim();            //移除首尾空格。
            ★String[] split(String regex);   //根据给定的内容，切割字符串，返回字符串数组
                    参数regex: 分割的规则(普通的字符串,也可以是特殊的字符串(正则表达式))
         */
        // 创建字符串对象
        String str = "hello-world-hello-heima";

        // 把hello替换为hi
        String replaceStr = str.replace("hello", "hi");
        System.out.println("替换后的字符串内容:"+replaceStr);// hi-world-hi-heima
        System.out.println("替换前的字符串内容:"+str);// hello-world-hello-heima

        System.out.println("=================================");
        String str1 = "Hello-World-Hello-Heima";
        // 把str1中的字母全部转换为大写字母
        String s1 = str1.toUpperCase();
        System.out.println(s1);// HELLO-WORLD-HELLO-HEIMA

        // 把str1中的字母全部转换为大写字母
        String s2 = str1.toLowerCase();
        System.out.println(s2);// hello-world-hello-heima

        System.out.println("=================================");
        // 把str1字符串转换为字符数组
        char[] arr1 = str1.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");// H e l l o - W o r l d - H e l l o - H e i m a
        }
        System.out.println();// 换行

        // 把str1字符串转换为字节数组
        byte[] arr2 = str1.getBytes();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");// 72 101 108 108 111 45 87 111 114 108 100 45 72 101 108 108 111 45 72 101 105 109 97
        }
        System.out.println();// 换行

        System.out.println("=================================");
        // 移除首尾空格
        String username = "            admin ";
        String trimStr = username.trim();
        System.out.println("="+trimStr+"=");// =admin=

        System.out.println("=================================");
        String str2 = "Hello-World-Hello-Heima";
        // 以-对str2进行分割
        String[] arr = str2.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("=================================");
        String str3 = "Hello.World.Hello.Heima";
        // 以.对str3进行分割
        String[] arr3 = str3.split("\\.");// .特殊字符串(正则表达式),而在正则表达式中点表示任意字符
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}

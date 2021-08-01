package com.itheima.demo5_String中正则表达式的使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 17:13
 */
public class Test {
    public static void main(String[] args) {
        /*
            String中正则表达式的使用:
                - String的split方法中使用正则表达式
                    public String[] split(String regex)
                    可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
                    参数regex就是一个正则表达式。

                - String类的replaceAll方法中使用正则表达式
                    public String replaceAll(String regex,String newStr)
                    可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。
                    参数regex就是一个正则表达式
         */
        String str = "18  4 567       99     56";
        // 需求:以空格进行切割
        String[] arr = str.split(" +");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("===========================");
        String str1 = "他妈的,我草,我草,...";
        String s = str1.replaceAll("[妈|草|操]", "*");
        System.out.println(s);

        System.out.println("========================");
        //将下面字符串中的"数字"替换为"*"
        String str2 = "jfdk432jfdk2jk24354j47jk5l31324";
        //String s2 = str2.replaceAll("\\d", "*");
        String s2 = str2.replaceAll("\\d+", "*");
        System.out.println(s2);

    }
}

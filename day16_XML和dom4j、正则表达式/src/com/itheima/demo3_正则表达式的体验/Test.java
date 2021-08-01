package com.itheima.demo3_正则表达式的体验;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 15:35
 */
public class Test {
    public static void main(String[] args) {
        /*
            先看一个不使用正则表达式验证的例子：下面的程序让用户输入一个QQ号码，我们要验证：
            - QQ号码必须是5--15位长度
            - 而且必须全部是数字
            - 而且首位不能为0
           知识:
            概述: 正则表达式其实就是一个匹配规则,用来替换之前复杂的if结构判断
            String类的: boolean matches(String regex)  告知此字符串是否匹配给定的正则表达式。
         */
        System.out.println(checkQQ1("123"));
        System.out.println(checkQQ1("12a45678"));
        System.out.println(checkQQ1("02345678"));
        System.out.println(checkQQ1("12345678"));// true

        System.out.println(checkQQ2("123"));
        System.out.println(checkQQ2("12a45678"));
        System.out.println(checkQQ2("02345678"));
        System.out.println(checkQQ2("12345678"));// true
    }

    /**
     * 校验qq是否符合规则
     *
     * @param qq
     * @return
     */
    public static boolean checkQQ2(String qq) {
        return qq.matches("[1-9]\\d{4,14}");
    }

    /**
     * 校验qq是否符合规则
     *
     * @param qq
     * @return
     */
    public static boolean checkQQ1(String qq) {
        // 不能为null
        if (qq == null) {
            return false;
        }

        // QQ号码必须是5--15位长度
        if (qq.length() < 5 || qq.length() > 15) {
            return false;
        }
        // 而且必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            // 获取每一个字符
            char c = qq.charAt(i);
            // 判断该字符
            if (c < '0' || c > '9') {
                return false;
            }
        }

        // 而且首位不能为0
        if (qq.charAt(0) == '0') {
            return false;
        }

        return true;
    }
}

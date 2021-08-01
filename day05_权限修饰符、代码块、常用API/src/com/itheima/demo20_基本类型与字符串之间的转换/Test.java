package com.itheima.demo20_基本类型与字符串之间的转换;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 17:06
 */
public class Test {
    public static void main(String[] args) {
        /*
            基本类型与字符串之间的转换:
                基本类型--->字符串:
                        - 方式一：直接在数字后加一个空字符串
                        - 方式二：通过String类静态方法valueOf()

                字符串--->基本类型:
                除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：
                    - public static byte parseByte(String s)：将字符串参数转换为对应的byte基本类型。
                    - public static short parseShort(String s)：将字符串参数转换为对应的short基本类型。
                    - public static int parseInt(String s)：将字符串参数转换为对应的int基本类型。
                    - public static long parseLong(String s)：将字符串参数转换为对应的long基本类型。
                    - public static float parseFloat(String s)：将字符串参数转换为对应的float基本类型。
                    - public static double parseDouble(String s)：将字符串参数转换为对应的double基本类型。
                    - public static boolean parseBoolean(String s)：将字符串参数转换为对应的boolean基本类型。

         */
        // 基本类型--->字符串:
        String str1 = 100 + "";// str1字符串的内容:"100"
        String str2 = String.valueOf(100);// str2字符串的内容: "100"

        // 字符串--->基本类型:
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        System.out.println(num1+num2);// 200

    }
}

package com.itheima.demo4_正则表达式的基本使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 15:56
 */
public class Test1_字符类 {
    public static void main(String[] args) {
        /*
            语法示例：[] 表示匹配单个字符   ^ 取反    - 范围
                1. [abc]：代表a或者b，或者c字符中的一个。
                2. [^abc]：代表除a,b,c以外的任何字符。
                3. [a-z]：代表a-z的所有小写字符中的一个。 左右包含
                4. [A-Z]：代表A-Z的所有大写字符中的一个。
                5. [0-9]：代表0-9之间的某一个数字字符。
                6. [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
                7. [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符。
         */
        String str = "ead";
        //1.验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        System.out.println(str.matches("h[aeiou]d"));// false
        System.out.println("had".matches("h[aeiou]d"));// true
        System.out.println("hzd".matches("h[aeiou]d"));// false
        System.out.println("haed".matches("h[aeiou]d"));// false
        System.out.println("================================================");

        //2.验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        System.out.println(str.matches("h[^aeiou]d"));// false
        System.out.println("had".matches("h[^aeiou]d"));// false
        System.out.println("hzd".matches("h[^aeiou]d"));// true
        System.out.println("haed".matches("h[^aeiou]d"));// false
        System.out.println("================================================");

        //3.验证str是否a-z的任何一个小写字符开头，后跟ad
        System.out.println(str.matches("[a-z]ad"));//true
        System.out.println("Aad".matches("[a-z]ad"));// false
        System.out.println("================================================");


        //4.验证str是否以a-d或者m-p之间某个字符开头，后跟ad
        System.out.println(str.matches("[a-dm-p]ad"));// false
        System.out.println("bad".matches("[a-dm-p]ad"));// true
    }
}

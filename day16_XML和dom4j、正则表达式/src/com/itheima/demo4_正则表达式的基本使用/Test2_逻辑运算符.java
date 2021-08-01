package com.itheima.demo4_正则表达式的基本使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 16:07
 */
public class Test2_逻辑运算符 {
    public static void main(String[] args) {
        /*
             正则表达式-逻辑运算符:
                语法示例：
                    1. &&：并且
                    2. |    ：或者
         */
        String str = "had";
        //1.要求字符串是小写辅音字符开头，后跟ad  除了a,e,i,o,u之外,其他的都是辅音字母
        System.out.println(str.matches("[a-z&&[^aeiou]]ad"));// true
        System.out.println("aad".matches("[a-z&&[^aeiou]]ad"));// false
        System.out.println("3ad".matches("[a-z&&[^aeiou]]ad"));// false

        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println(str.matches("[a|e|i|o|u]ad"));// false
        System.out.println("aad".matches("[a|e|i|o|u]ad"));// true
    }
}

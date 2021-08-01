package com.itheima.demo4_正则表达式的基本使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 16:56
 */
public class Test5_分组括号 {
    public static void main(String[] args) {
        /*
            正则表达式-分组括号( )
         */
        String str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        // 分成5组: 前面4组的规则是一样的 后面一组单独规则
        System.out.println(str.matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));// true

        // 扩展:正则表达式匹配叠词
        // 哈哈,呵呵,嘿嘿,XX  (.)表示第一组,\\1表示第一组
        System.out.println("哈哈".matches("(.)\\1"));//true
        System.out.println("呵呵".matches("(.)\\1"));//true
        System.out.println("嘿嘿".matches("(.)\\1"));//true
        System.out.println("嘿哈".matches("(.)\\1"));// false
        // (.)表示第一组,\\1表示第一组,{3}表示\\1出现3次
        System.out.println("哈哈哈哈".matches("(.)\\1{3}"));//true
        System.out.println("呵呵呵呵".matches("(.)\\1{3}"));//true
        System.out.println("嘿嘿嘿嘿".matches("(.)\\1{3}"));//true
        System.out.println("===================================");

        // 高高兴兴,逼逼赖赖,XXYY
        // \\1表示第一组,\\2表示第二组,\\3表示第三组....
        System.out.println("高高兴兴".matches("(.)\\1(.)\\2"));//true
        System.out.println("逼逼赖赖".matches("(.)\\1(.)\\2"));//true
        System.out.println("===================================");

        // 快乐快乐,哔哩哔哩,XYXY
        System.out.println("快乐快乐".matches("(..)\\1"));//true
        System.out.println("哔哩哔哩".matches("(..)\\1"));//true
    }
}

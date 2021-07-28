package com.itheima.demo4_正则表达式的基本使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 16:47
 */
public class Test4_数量词 {
    public static void main(String[] args) {
        /*
             正则表达式-数量词
                - 语法示例：
                  1. X? : 0次或1次
                  2. X* : 0次到多次
                  3. X+ : 1次或多次
                  4. X{n} : 恰好n次
                  5. X{n,} : 至少n次
                  6. X{n,m}: n到m次(n和m都是包含的)
         */
        //1.验证str是否是三位数字
        System.out.println("123".matches("\\d{3}"));// true
        System.out.println("1234".matches("\\d{3}"));// false
        System.out.println("13".matches("\\d{3}"));// false
        System.out.println("==========================");

        //2.验证str是否是多位数字
        System.out.println("123".matches("\\d+"));// true
        System.out.println("1234".matches("\\d+"));// true
        System.out.println("13".matches("\\d+"));// true
        System.out.println("1".matches("\\d+"));// true
        System.out.println("".matches("\\d+"));// false
        System.out.println("==========================");

        //3.验证str是否是手机号：1).第一位为1 2).第二位是3,5,8 3).后面9位都是数字
        System.out.println("13738682233".matches("1[358]\\d{9}"));// true
        System.out.println("12738682233".matches("1[358]\\d{9}"));// false
        System.out.println("22738682233".matches("1[358]\\d{9}"));// false
        System.out.println("1378682233".matches("1[358]\\d{9}"));// false
        System.out.println("==========================");

        //4.验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0
        System.out.println("12345678".matches("[1-9]\\d{4,14}"));// true
        System.out.println("1234".matches("[1-9]\\d{4,14}"));// false
        System.out.println("1234567a8".matches("[1-9]\\d{4,14}"));// false

    }
}

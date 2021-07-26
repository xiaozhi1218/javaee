package com.itheima.demo13_StringBuilder和String相互转换;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 15:12
 */
public class Test {
    public static void main(String[] args) {
        /*
            StringBuilder和String相互转换:
                String--->StringBuilder:  public StringBuilder(String str)
                StringBuilder-->String :  public String toString()
         */
        //String--->StringBuilder:  public StringBuilder(String str)
        String str = "hello-world";
        StringBuilder sb = new StringBuilder(str);

        //StringBuilder-->String :  public String toString()
        String s = sb.toString();
        System.out.println(sb);// hello-world  可变字符串
        System.out.println(s);//  hello-world  不可变的字符串
    }
}

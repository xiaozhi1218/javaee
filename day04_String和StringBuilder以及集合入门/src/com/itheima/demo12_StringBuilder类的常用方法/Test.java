package com.itheima.demo12_StringBuilder类的常用方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 14:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            public StringBuilder append(任意类型) 拼接数据，并返回对象本身
            public StringBuilder insert(int offset, 任意类型) 在指定位置插入数据,并返回对象本身
            public StringBuilder reverse()  反转字符串,并返回对象本身
         */
        // 创建可变字符串对象
        StringBuilder sb1 = new StringBuilder("hello");

        // sb1字符串末尾拼接上"-world"
        StringBuilder sb2 = sb1.append("-world");
        System.out.println(sb1);// hello-world
        System.out.println(sb2);// hello-world
        System.out.println(sb1==sb2);// sb1和sb2的地址值是一样的,true

        System.out.println("=======================================");

        // 把-java插入到sb1可变字符串中,使得sb1为:hello-java-world
        sb1.insert(5,"-java");
        System.out.println(sb1);// hello-java-world

        System.out.println("=======================================");
        // 把sb1中的字符串内容进行反转
        StringBuilder sb3 = sb1.reverse();
        System.out.println(sb1);// dlrow-avaj-olleh
        System.out.println(sb3);// dlrow-avaj-olleh
        System.out.println(sb1==sb3);// true

    }
}

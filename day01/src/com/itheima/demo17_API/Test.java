package com.itheima.demo17_API;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 17:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            api的使用步骤:
                1.打开api文档
                2.点击显示
                3.点击索引,在输入框中,输入要查找的类\接口
                4.查看类的包  如果在java.lang包就不需要导包,其余都需要导包
                5.查看类的解释说明
                6.查看类的构造方法
                7.查看类的成员方法

            举例: Scanner类
                1.查看类的包         java.util  导包
                2.查看类的解释说明    是一个文本扫描器,可以扫描基本类型的数据和字符串
                3.查看类的构造方法    Scanner(InputStream source)
                4.查看类的成员方法
                     byte nextByte()
                     short nextShort()
                     short nextInt()
                     Long nextLong()
                    boolean nextBoolean()
                     double nextDouble()
                    float nextFloat()

                     String nextLine()  可以获取一行字符串   空格,回车,tab键都可以获取
                     String next()      可以获取单个字符串   空格,回车,tab键都不可以获取

         */
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        System.out.println(num);*/

       /* System.out.println("请输入一个小数:");
        double numD = sc.nextDouble();
        System.out.println(numD);*/

        //System.out.println("请输入一个字符串:");
       /* String str = sc.nextLine();
        System.out.println(str);*/

        /*String str = sc.next();
        System.out.println(str);*/

        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("年龄:"+age);// 18

        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("姓名:"+name);

        //String name = sc.nextLine();
        //System.out.println("姓名:"+name);
    }
}

package com.itheima.demo18_内部类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 15:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            - 什么是内部类:将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，外面的那个B类则称为外部类。
            - 成员内部类的格式:
                 public class 外部类{
                     public class 内部类{

                    }
                 }
            - 成员内部类的访问特点:
                在其他类中,访问内部类的成员,得先创建内部类对象:
                    外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
                在外部类中,访问内部类的成员,得先创建内部类对象:
                    外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
                    内部类名 对象名 = new 内部类名();

                在内部类中,可以直接访问外部类的一切成员(包含私有的):

         */
        // 创建内部类的对象
        Body.Heart bh = new Body().new Heart();
        System.out.println(bh.numN);// 10
        bh.methodN1();// 内部类的成员方法 methodN1

        System.out.println("=======================");
        // 创建外部类对象
        Body b = new Body();
        b.methodW1();

        System.out.println("=======================");
        bh.methodN2();// 100    外部类的成员方法 methodW2

    }
}

package com.itheima.demo2_匿名对象;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 9:04
 */
public class Test {
    public static void main(String[] args) {
        /*
            匿名对象:
                概述:没有名字的对象
                特点:匿名对象只能使用一次
                使用场景:当某个类的对象只需要使用一次的时候,就可以使用该类的匿名对象
                        例如:方法的参数,方法的返回值
         */
        // 创建对象
        Student stu1 = new Student("热巴",18);// 有名字的对象
        stu1.show();
        stu1.show();

        System.out.println("==================================");
        //匿名对象
        new Student("热巴",18).show();// 没有名字的对象
        new Student("热巴",18).show();// 没有名字的对象

        System.out.println("==================================");
        // 调用method1方法
        Student stu2 = new Student("热巴",18);// 0x11901
        method1(stu2);// 有名字的对象传参
        method1(new Student("热巴",18));// 匿名对象的方式传参数

        System.out.println("==================================");
        Student stu3 = method2();// 0x11908
        stu3.show();// 丽颖,18

    }

    public static void method1(Student stu){// 0x11901
        stu.show();
    }


    public static Student method2(){
        //Student stu = new Student("丽颖",18);// 0x11908
        //return stu;// 0x11908

        return new Student("丽颖",18);
    }


}

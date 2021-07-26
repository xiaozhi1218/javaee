package com.itheima.demo7_定义和使用含有泛型的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 10:45
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义含有泛型的类:
                public class 类名<泛型变量>{

                }
                泛型变量的位置: 写任意字母,例如:A,B,C,D,E,...a,b,c,...一般会写E

            使用含有泛型的类: 创建该类对象的时候,确定该类泛型的具体数据类型

            什么时候定义泛型的类:
                当类中的成员变量或者成员方法的形参类型\返回值类型不确定的时候,就可以把该类定义为含有泛型的类
         */
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.e = "itheima";
        String res1 = list1.method("itcast");
        System.out.println("res1:"+res1);// itcast

        System.out.println("=======================================");

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.e = 100;
        Integer res2 = list2.method(10);
        System.out.println("res2:"+res2);// 10

    }
}

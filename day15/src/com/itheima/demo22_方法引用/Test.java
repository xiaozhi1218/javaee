package com.itheima.demo22_方法引用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:03
 */
public class Test {

    public static void show(){
        System.out.println("线程执行了");
    }

    public static void main(String[] args) {
        /*
            方法引用:
                概述:方法引用使用一对冒号 :: , 方法引用就是用来在一定的情况下,替换Lambda表达式
                使用场景:
                    1.如果Lambda表达式的大括号中的代码和另一个方法的方法体一模一样,那么就可以使用方法引用把该方法
                       直接引过来,从而替换Lambda表达式
                    2.如果Lambda表达式的大括号中的代码就是调用另一个方法,那么就可以使用方法引用把该方法
                       直接引过来,从而替换Lambda表达式
         */
        // 创建并启动线程
        new Thread(()->{
            System.out.println("线程执行了");
        }).start();

        // 发现上述的Lambda表达式大括号中的内容和Test类的show方法的方法体一模一样,符合方法引用替换Lambda表达式的场景
        new Thread(Test::show).start();

        System.out.println("=========================================");

        new Thread(()->{
            Test.show();
        }).start();

        // 发现上述的Lambda表达式大括号中的内容就是调用Test类的show方法,符合方法引用替换Lambda表达式的场景
        new Thread(Test::show).start();
    }
}

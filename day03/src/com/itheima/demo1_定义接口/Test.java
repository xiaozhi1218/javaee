package com.itheima.demo1_定义接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:04
 */
public class Test {
    public static void main(String[] args) {
        /*
            格式:
                public interface 接口名{
                    常量(jdk7及其以前)
                    抽象方法(jdk7及其以前)
                    默认方法(jdk8)
                    静态方法(jdk8)
                    私有方法(jdk9)
                }
         */
        System.out.println(IA.NUM1);// 10
        System.out.println(IA.NUM2);// 20
        //IA.NUM2 = 200;// 编译报错,因为常量只能赋值一次
    }
}

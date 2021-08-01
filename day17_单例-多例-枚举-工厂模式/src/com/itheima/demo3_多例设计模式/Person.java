package com.itheima.demo3_多例设计模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 9:02
 */
// 多例设计模式: 只能产生3个该类的对象
public class Person {
    // 1.将构造方法私有化,防止外界通过new调用构造方法来创建该类的对象
    private Person(){

    }

    // 2.在该类的内部创建固定数量的该类对象
    // 2.1 定义一个ArrayList集合,用来存储该类的对象
    private static ArrayList<Person> list = new ArrayList<>();

    // 2.2 在静态代码块中,创建该类的对象,并添加到集合中
    static {
        for (int i = 0; i < 3; i++) {
            Person p = new Person();
            list.add(p);
        }
    }

    // 3.提供一个静态方法用来随机获取该类的对象
    public static Person getInstance(){
        // 创建Random对象
        Random r = new Random();

        // 生成一个随机数,随机数的范围[0,集合的长度)
        int index = r.nextInt(list.size());

        // 根据随机数获取对象
        Person p = list.get(index);

        // 返回
        return p;
    }

}

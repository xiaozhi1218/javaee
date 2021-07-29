package com.itheima.demo4_枚举;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 9:57
 */
class Person {
    private String name;
    private Sex sex;

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person("张三1", Sex.boy);
        Person p2 = new Person("张三2", Sex.girl);
        Person p3 = new Person("张三3", Sex.yao);
        Person p4 = new Person("张三4", Sex.boy);
    }
}

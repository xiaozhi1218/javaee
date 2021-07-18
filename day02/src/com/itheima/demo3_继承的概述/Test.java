package com.itheima.demo3_继承的概述;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 9:48
 */
public class Test {
    public static void main(String[] args) {
        /*
            继承的格式:
                public class 父类名{
                }

                public class 子类名 extends 父类名{

                }
            注意: 不要为了继承而继承,一定要满足is a的关系
                  例如:学生 is a Person   可以
                       狗  is a Person    不可以
         */
        Student stu = new Student();
        stu.setName("热巴");
        stu.setAge(18);
        System.out.println(stu.getName()+","+stu.getAge());
        stu.eat();
        stu.sleep();
        stu.drink();

        System.out.println("============================");
        Teacher t1 = new Teacher();
        t1.eat();

        System.out.println("============================");
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.drink();
    }
}

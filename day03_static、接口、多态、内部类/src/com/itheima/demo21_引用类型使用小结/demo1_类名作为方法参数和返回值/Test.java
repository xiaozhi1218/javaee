package com.itheima.demo21_引用类型使用小结.demo1_类名作为方法参数和返回值;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:21
 */
class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            类名作为方法参数和返回值:
         */
        // 创建Person
        Person p = new Person("冰冰",18);
        method1(p);
        System.out.println("=========================================");
        // 调用method2;
        Person person = method2(p);
        person.show();// 冰冰,20
    }

    // 类作为方法的参数类型
    public static void method1(Person p){
        p.show();// 冰冰,18
    }

    // 类作为方法的参数类型和返回值类型
    public static Person method2(Person p){
        p.age = 20;// 把age改为20
        return p;
    }
}

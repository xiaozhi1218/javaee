package com.itheima.demo16_标准类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 17:10
 */
public class Student {
    // 成员变量--private
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    // 空参构造方法  alt+insert--->Constructor
    public Student() {
    }

    // 满参构造方法(建议)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // set\get方法 alt+insert---> setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 成员方法
    public void show(){
        System.out.println(name+","+age);
    }

}

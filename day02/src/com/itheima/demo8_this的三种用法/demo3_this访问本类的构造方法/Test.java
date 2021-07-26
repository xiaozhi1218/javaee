package com.itheima.demo8_this的三种用法.demo3_this访问本类的构造方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:18
 */
class Student{
    String name;
    int age;

    public Student(){
        // 调用有参构造方法
        //this("热巴",18);
        System.out.println("空参构造方法");
    }

    public Student(String name,int age){
        // 调用空参构造方法
        this();
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }

    public void show(){
        //this();// 编译报错
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            this访问本类的构造方法:
                访问本类的空参构造方法: this();
                访问本类的有参构造方法: this(有参);
                    注意:
                        1.在构造方法中调用其他构造方法,必须放在构造方法的第一行
                        2.使用this访问本类的构造方法,只能在本类的构造方法中使用
                        3.本类构造方法之间不能同时相互调用
         */
        // 通过空参构造方法创建对象
        //Student stu1 = new Student();

        // 通过空参构造方法创建对象
        Student stu2 = new Student("赵丽颖",18);
    }
}

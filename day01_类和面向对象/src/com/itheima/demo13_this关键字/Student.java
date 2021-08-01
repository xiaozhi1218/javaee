package com.itheima.demo13_this关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:16
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
     private int age;

     // 提供给成员变量赋值的方法-set方法
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0 || age > 150){
            this.age = -1;
            System.out.println("您的数据不合法!");
        }else{
            this.age = age;
        }
    }
     // 提供获取成员变量值的方法-get方法
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

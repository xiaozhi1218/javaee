package com.itheima.demo12_set和get方法;

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
    public void setName(String s){
        name = s;
    }

    public void setAge(int a){
        if (a < 0 || a > 150){
            age = -1;
            System.out.println("您的数据不合法!");
        }else{
            age = a;
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

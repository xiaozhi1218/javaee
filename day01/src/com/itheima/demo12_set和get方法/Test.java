package com.itheima.demo12_set和get方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:36
 */
public class Test {
    public static void main(String[] args) {
        /*
            通过对象名直接访问成员变量的方式来对属性赋值,会存在数据安全隐患,应该怎么解决呢?
            解决方式: 使用private修饰,并提供公共的访问方法
         */
        // 创建Student对象
        Student stu1 = new Student();

        // 访问成员变量
        // 隐藏属性后的方式
        stu1.setName("冰冰");
        stu1.setAge(-18);
        System.out.println(stu1.getName()+","+stu1.getAge());// 冰冰,-1

        // 没有隐藏属性之前的方式
        //stu1.name = "冰冰";
        //stu1.age = -18;
        //System.out.println(stu1.name + "," + stu1.age);// 冰冰,-18
    }
}

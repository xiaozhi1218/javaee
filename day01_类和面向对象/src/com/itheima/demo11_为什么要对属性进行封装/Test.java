package com.itheima.demo11_为什么要对属性进行封装;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:16
 */
public class Test {
    public static void main(String[] args) {
        /*
            为什么要对属性进行封装:
                通过对象名直接访问成员变量的方式来对属性赋值,会存在数据安全隐患,应该怎么解决呢?
                解决方式: 不让外界直接访问成员变量(也就是要对属性进行封装\隐藏)
            对成员变量隐藏的步骤:
                1.使用private关键字修饰成员变量
                2.提供公共的访问方法:
                    给成员变量赋值的公共方法(set方法)
                    获取成员变量值的公共方法(get方法)
         */
        // 创建Student对象
        Student stu1 = new Student();

        // 访问成员变量
        stu1.name = "冰冰";
        // 通过对象名直接访问成员变量的方式来对属性赋值,会存在数据安全隐患,应该怎么解决呢?
        stu1.age = -18;
        System.out.println(stu1.name + "," + stu1.age);// 冰冰,-18

    }
}

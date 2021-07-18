package com.itheima.demo18_static关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:21
 */
public class ChinesePeople {
    // 非静态成员变量
    String name;// 姓名
    // 静态成员变量
    static String country;// 国籍

    public ChinesePeople() {
    }

    public ChinesePeople(String name, String country) {
        this.name = name;
        this.country = country;
    }
}

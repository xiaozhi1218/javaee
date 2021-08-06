package com.itheima.pojo;

import java.io.Serializable;

/**
 * 包名:com.itheima.pojo
 * @author Leevi
 * 日期2020-10-16  08:58
 * 包装类型:
 * 1. 初始值为null
 * 2. 包装类型可以进行序列化
 */
public class User implements Serializable{
    private Integer age;
    private String name;
    private String address;

    public User() {
    }

    public User(Integer age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

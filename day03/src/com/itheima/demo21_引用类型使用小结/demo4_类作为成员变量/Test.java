package com.itheima.demo21_引用类型使用小结.demo4_类作为成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:47
 */
class Person{
    String name;// 引用数据类型定义成员变量  String类
    int age;// 基本类型定义成员变量
    IdCard idCard;

    public Person(String name, int age, IdCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }
    // ...
}
class IdCard{
    String idNum;// 身份证号码
    String address;// 地址

    public IdCard(String idNum, String address) {
        this.idNum = idNum;
        this.address = address;
    }
    // ....
}
public class Test {
    public static void main(String[] args) {
        // 创建IdCard对象
        IdCard idCard = new IdCard("440330200010101919","广东省深圳市宝安区公安局");
        // 创建Person对象
        Person p = new Person("张三",18,idCard);
        System.out.println(p.name+","+p.age+","+p.idCard.idNum+","+p.idCard.address);// java支持链式编程
    }
}

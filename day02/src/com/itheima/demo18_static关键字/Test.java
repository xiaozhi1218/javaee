package com.itheima.demo18_static关键字;

import com.itheima.demo3_继承的概述.Person;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:20
 */
public class Test {
    public static void main(String[] args) {
        /*
            static关键字:
                概述:是一个静态修饰符关键字，表示静态的意思,可以修饰成员变量和成员方法以及代码块。
                使用:
                    修饰成员变量: static 数据类型 变量名;
                    特点:被static修饰的成员变量是属于类的(静态成变量\类变量),会被该类的所有对象共享
                    访问:
                        对象名.静态成员变量名    不推荐
                        类名.静态成员变量名      推荐
         */
        // 使用static修饰country成员变量
        // 创建ChinesePeople对象
        ChinesePeople p1 = new ChinesePeople("冰冰","中国");
        // 姓名:冰冰,国籍:中国
        System.out.println("姓名:"+p1.name+",国籍:"+p1.country);

        ChinesePeople p2 = new ChinesePeople();
        // 姓名:null,国籍:中国
        System.out.println("姓名:"+p2.name+",国籍:"+p2.country);

        p2.country = "中华人民共和国";
        // 中华人民共和国,中华人民共和国
        System.out.println(p1.country+","+p2.country);

        // 通过类名访问
        System.out.println(ChinesePeople.country);// 中华人民共和国


        System.out.println("=========================================");
        // 没有static修饰成员变量,成员变量是直接属于对象的
       /* // 创建ChinesePeople对象
        ChinesePeople p1 = new ChinesePeople("冰冰","中国");
        // 姓名:冰冰,国籍:中国
        System.out.println("姓名:"+p1.name+",国籍:"+p1.country);

        ChinesePeople p2 = new ChinesePeople();
        // 姓名:null,国籍:null
        System.out.println("姓名:"+p2.name+",国籍:"+p2.country);*/

    }
}

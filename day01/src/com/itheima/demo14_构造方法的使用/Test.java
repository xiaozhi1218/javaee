package com.itheima.demo14_构造方法的使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 16:44
 */
public class Test {
    public static void main(String[] args) {
        /*
            构造方法:
                概述:构造方法是一个特殊的方法,主要用来创建对象并给属性赋值.
                定义:
                    无参构造方法:
                        权限修饰符 类名(){
                        }
                    有参构造方法:
                        权限修饰符 类名(形参列表){
                            给属性赋值
                        }
                特点:
                    1.构造方法没有返回值类型,连void不能写
                    2.构造方法的名字就是类名
                    3.通过new来调用构造方法
                使用: 通过new来调用
         */
        // 通过调用空参构造方法创建对象
        Student stu1 = new Student();
        System.out.println(stu1.getName()+","+stu1.getAge());// null,0

        // 通过调用有参构造方法创建对象
        Student stu2 = new Student("冰冰",18);
        System.out.println(stu2.getName()+","+stu2.getAge());// 冰冰,18

    }
}

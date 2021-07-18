package com.itheima.demo15_构造方法的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 16:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            构造方法的注意事项:
                1.构造方法没有返回值,连void都不能写
                2.构造方法名和类名一致
                3.如果一个类没有定义构造方法,系统会自动生成一个空参构造方法
                4.如果一个类定义了构造方法,系统就不会自动生成一个空参构造方法
                5.构造方法可以重载
                6.构造方法只能给属性赋值一次,而set方法可以给属性赋值无数次
                  因为调用构造方法,就会创建一个新的对象

         */
         //调用空参构造方法创建对象
        Student stu1 = new Student();

        // 通过有参构造方法创建对象
        Student stu2 = new Student("冰冰",18);
        Student stu3 = new Student("冰冰",18);

        System.out.println(stu2.getAge());// 18
        // 通过set方法给属性赋值
        stu2.setAge(19);
        System.out.println(stu2.getAge());// 19
        stu2.setAge(20);
        System.out.println(stu2.getAge());// 20

    }
}

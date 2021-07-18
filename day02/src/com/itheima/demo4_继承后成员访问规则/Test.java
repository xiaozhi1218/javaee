package com.itheima.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 10:02
 */
public class Test {
    public static void main(String[] args) {
        /*
            继承后成员访问规则:
                继承后构造方法的访问规则:父类的构造方法子类无法继承
                继承后私有成员的访问规则:子类是可以继承,但无法直接访问
                继承后非私有成员的访问规则:子类是可以继承,优先访问子类的,如果子类没有就去父类中找,找到就使用,找不到就报错
         */
        // 验证构造方法
        //Zi zi = new Zi(10);// 编译报错,因为子类没有有参构造方法

        //System.out.println("===================================");
        // 验证私有成员
        //Zi zi = new Zi();
        //System.out.println(zi.name);// 编译报错
        //zi.method1();// 编译报错

        //System.out.println("===================================");

        // 验证非私有成员
        Zi zi = new Zi();
        System.out.println(zi.sex);
        zi.method2();
    }
}

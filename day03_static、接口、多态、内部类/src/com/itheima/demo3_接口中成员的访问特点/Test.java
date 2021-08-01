package com.itheima.demo3_接口中成员的访问特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:37
 */
public class Test {
    public static void main(String[] args) {
        /*
            接口中成员的访问特点:
                常量:主要是供接口名直接访问
                抽象方法:就是供实现类重写
                默认方法:就是供实现类重写或者实现类对象直接调用
                静态方法: 只供接口名直接调用
                私有方法: 只能在本接口中调用

         */
        // 访问接口常量
        System.out.println(IA.NUM);// 10  推荐
        //System.out.println(Imp.NUM);// 10 不推荐 常量被实现类继承了

        // 创建实现类对象调用方法
        Imp imp = new Imp();

        // 访问抽象方法
        imp.method1();

        // 访问默认方法
        imp.method2();

        // 接口名访问静态方法
        IA.method3();
        //Imp.method3();// 编译报错,没有继承
    }
}

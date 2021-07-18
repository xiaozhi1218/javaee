package com.itheima.demo19_static修饰成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:32
 */
public class Test {
    public static void main(String[] args) {
        /*
            概述: 被static修饰的方法就是静态方法,否则就是非静态方法
            static修饰成员方法: 在方法的返回值类型前面加上static
            访问静态方法:
                对象名.静态方法名(参数);  不推荐
                类名.静态方法名(参数);    推荐
            注意事项:
                1.静态方法中只能直接访问静态成员变量和静态成员方法
                2.静态方法中不能直接访问非静态成员变量和非静态成员方法
                3.非静态方法中可以直接访问一切成员变量和成员方法
                4.静态方法中不能出现this关键字
         */
        ChinesePeople.method3();

        //ChinesePeople p = new ChinesePeople();
        //p.method2();

        /*// 对象名.静态方法名(参数);  不推荐
        ChinesePeople p1 = new ChinesePeople();
        p1.method3();
        p1.method4();

        // 类名.静态方法名(参数);    推荐
        ChinesePeople.method3();
        ChinesePeople.method4();*/
    }

}

package com.itheima.demo3_对象的创建和使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 10:50
 */
public class Test {
    public static void main(String[] args) {
        /*
            对象的创建和使用:
                对象的创建:
                    对象创建格式: 类名 对象名 = new 类名();
                    结论: 类其实也是一种数据类型,是引用数据类型
                对象的使用:
                    访问成员变量:
                        给成员变量赋值:  对象名.成员变量名 = 值;
                        获取成员变量的值: 对象名.成员变量名

                    访问成员方法:
                        调用方法: 有返回值的方法,无返回值的方法
                        无返回值的方法:
                               直接调用: 对象名.方法名(实参);
                        有返回值的方法:
                               直接调用: 对象名.方法名(实参);
                               赋值调用: 数据类型 变量名 = 对象名.方法名(实参);
                               输出调用: System.out.println(对象名.方法名(实参));
         */
        // 创建Phone类的对象
        Phone p1 = new Phone();
        // 给p1对象的brand成员变量赋值
        p1.brand = "华为";
        // 给p1对象的price成员变量赋值
        p1.price = 999.8;

        // 获取p1对象的brand成员变量的值
        System.out.println(p1.brand);
        // 获取p1对象的price成员变量的值
        System.out.println(p1.price);

        // 无返回值的成员方法
        // 使用p1对象调用call方法
        p1.call("10086");
        // 使用p1对象调用sendMessage方法
        p1.sendMessage("10086","请问一下联通的客服电话号码是多少?");

        System.out.println("==============================");
        // 有返回值的方法
        // 直接调用
        p1.show("itheima");

        // 赋值调用
        int res = p1.show("itcast");// 100
        System.out.println("res:"+res);// 100

        // 输出调用
       System.out.println(p1.show("java"));// 100

        /*
        之前访问变量
        int num;
        num = 10;
        System.out.println(num);*/
        /*
        之前访问访问
            方法分类: 无参数无返回值,有参数无返回值,有参数有返回值,无参数有返回值
            调用方法: 有返回值的方法,无返回值的方法
                无返回值的方法:
                       直接调用: 方法名(实参);
                有返回值的方法:
                       直接调用: 方法名(实参);
                       赋值调用: 数据类型 变量名 = 方法名(实参);
                       输出调用: System.out.println(方法名(实参));
        */
    }
}

package com.itheima.demo6_实现类继承父类又实现接口时的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:42
 */
public class Test {
    public static void main(String[] args) {
        /*
            实现类继承父类又实现接口时的冲突:
                - 公有静态常量的冲突:子类无法继承有冲突的常量
                - 公有抽象方法的冲突:子类必须重写一次有冲突的抽象方法
                - 公有默认方法的冲突:优先访问父类的
                - 公有静态方法的冲突:只会访问父类的静态方法
                - 私有方法的冲突: 不存在冲突

         */
    }
}

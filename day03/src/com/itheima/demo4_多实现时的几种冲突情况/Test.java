package com.itheima.demo4_多实现时的几种冲突情况;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:54
 */
public class Test {
    public static void main(String[] args) {
        /*
            多实现时的几种冲突情况:
                - 公有静态常量的冲突:实现类不继承冲突的常量
                - 公有抽象方法的冲突:实现类只需要重写一个
                - 公有默认方法的冲突:实现类必须重写一次最终版本
                - 公有静态方法的冲突:静态方法是直接属于接口的,不能被继承,所以不存在冲突
                - 私有方法的冲突:私有方法只能在本接口中直接使用,不存在冲突

         */
    }
}

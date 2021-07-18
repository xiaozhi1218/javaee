package com.itheima.demo5_接口和接口的关系;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:11
 */
interface A{}
interface B{}
interface C1 extends A{}   // 单继承
interface C2 extends A,B{} // 多继承
interface C3 extends C2{}  // 多层继承
public class Test {
    public static void main(String[] args) {
        /*
            - 接口与接口之间的关系: 继承关系
                    单继承: A接口继承B接口
                    多继承: A接口同时继承B接口,C接口,...
                    多层继承: A接口继承B接口,B接口,继承C接口
                    格式:
                        public interface 接口名 extends 接口名1,接口名2,...{}

            - 接口多继承时的冲突情况
              - 公有静态常量的冲突:子接口无法继承父接口中冲突的常量
              - 公有抽象方法的冲突:子接口只会继承一个有冲突的抽象方法
              - 公有默认方法的冲突:子接口中必须重写一次有冲突的默认方法(注意要加default)
              - 公有静态方法和私有方法的冲突:
                不冲突,因为静态方法是直接属于接口的,只能使用本接口直接访问,而私有方法只能在接口中访问,也没有冲突


               面试题:
                实现类重写接口中的默认方法,不需要加default
                子接口重写父接口中的默认方法,必须加default

         */
    }
}

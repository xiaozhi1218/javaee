package com.itheima.demo9_定义和使用含有泛型的接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:16
 */
// 实现类实现接口的时候不确定接口泛型的具体数据类型,
// 而是创建实现类对象的时候确定接口泛型的具体数据类型
public class Imp2<E> implements IA<E> {
    @Override
    public void method1(E e) {
        System.out.println("实现类 method1");
    }

    @Override
    public E method2(E e) {
        return e;
    }
}

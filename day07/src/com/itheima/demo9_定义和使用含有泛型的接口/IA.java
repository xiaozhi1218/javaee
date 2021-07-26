package com.itheima.demo9_定义和使用含有泛型的接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:12
 */
public interface IA<E> {

    public abstract void method1(E e);

    public default E method2(E e){
        return e;
    }
}

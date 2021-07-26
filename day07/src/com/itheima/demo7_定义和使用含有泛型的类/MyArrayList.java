package com.itheima.demo7_定义和使用含有泛型的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 10:47
 */
public class MyArrayList<E> {

    E e;

    public E method(E e){
        return e;
    }
    public E method2(E e){
        return e;
    }

    public <T> T method3(T t){
        return t;
    }

}

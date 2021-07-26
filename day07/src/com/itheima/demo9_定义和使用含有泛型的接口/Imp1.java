package com.itheima.demo9_定义和使用含有泛型的接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:15
 */
// 通过实现类的方式确定接口泛型的具体数据类型
public class Imp1 implements IA<String> {
    @Override
    public void method1(String s) {

    }

    @Override
    public String method2(String s) {
        return null;
    }
}

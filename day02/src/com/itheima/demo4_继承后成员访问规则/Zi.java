package com.itheima.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 10:03
 */
public class Zi extends Fu{
    // 非私有成员变量
    String sex = "女";
    // 非私有成员方法
    public void method2(){
        System.out.println("Zi method2");
    }
}

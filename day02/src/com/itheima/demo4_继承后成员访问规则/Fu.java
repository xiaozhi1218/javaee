package com.itheima.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 10:03
 */
public class Fu {

    int num;
    // 构造方法
    public Fu(){

    }

    public Fu(int num){
        this.num = num;
    }

    // 私有成员变量
    private String name;
    // 私有成员方法
    private void method1(){
        System.out.println("Fu method1");
    }

    // 非私有成员变量
    String sex = "男";
    // 非私有成员方法
    public void method2(){
        System.out.println("Fu method2");
    }
}

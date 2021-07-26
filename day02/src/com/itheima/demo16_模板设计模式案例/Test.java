package com.itheima.demo16_模板设计模式案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:30
 */
public class Test {

    public static void main(String[] args) {
        // 创建新司机对象
        NewDriver d1 = new NewDriver();
        d1.driveCar();

        // 创建老司机对象
        OldDriver d2 = new OldDriver();
        d2.driveCar();
    }

}

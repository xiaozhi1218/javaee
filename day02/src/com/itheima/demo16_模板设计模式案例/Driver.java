package com.itheima.demo16_模板设计模式案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:30
 */
// 父类
public abstract class Driver {
    // 开车方法 通用模板
    public void driveCar(){
        System.out.println("开门");
        System.out.println("点火");
        // 姿势??
        ziShi();
        System.out.println("刹车");
        System.out.println("熄火");
    }

    // 姿势方法  填充模板
    public abstract void ziShi();
}

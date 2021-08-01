package com.itheima.demo6_工厂设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:12
 */
public class Test {
    public static void main(String[] args) {
        // 创建法拉利对象
        Falali fll = new Falali();

        // 创建奔驰对象
        Benchi bc = new Benchi();

        // 创建宝马对象
        Baoma bmw = new Baoma();

        fll.run();
        bc.run();
        bmw.run();

        System.out.println("===========================");

        Car car1 = CarFactory.createCar("Falali");
        Car car2 = CarFactory.createCar("Benchi");
        Car car3 = CarFactory.createCar("Baoma");

        car1.run();
        car2.run();
        car3.run();


    }
}

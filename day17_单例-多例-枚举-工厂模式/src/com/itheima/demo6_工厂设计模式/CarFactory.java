package com.itheima.demo6_工厂设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:28
 */
public class CarFactory {
    /**
     * 创建汽车对象
     *
     * @param carType 汽车的品牌
     * @return 汽车对象
     */
    public static Car createCar(String carType) {
        if (carType.equals("Falali")) {
            return new Falali();
        } else if (carType.equals("Benchi")) {
            return new Benchi();
        } else if (carType.equals("Baoma")) {
            return new Baoma();
        } else {
            return null;
        }
    }
}

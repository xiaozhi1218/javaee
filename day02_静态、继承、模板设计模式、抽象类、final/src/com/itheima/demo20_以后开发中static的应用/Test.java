package com.itheima.demo20_以后开发中static的应用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:58
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Utils.PI);
        System.out.println(Utils.WIDTH);
        System.out.println(Utils.HEIGHT);

        int[] arr = {10,23,454,43,32};
        System.out.println(Utils.getArrayMax(arr));
    }
}

package com.itheima.demo20_以后开发中static的应用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 17:00
 */
public class Utils {// 工具类
    // π的值
    public static final double PI = 3.14;
    // 宽
    public static final int WIDTH = 800;
    // 高
    public static final int HEIGHT = 800;

    // 找int数组中的最大值
    public static int getArrayMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

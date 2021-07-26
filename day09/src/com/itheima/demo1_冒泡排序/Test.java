package com.itheima.demo1_冒泡排序;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 9:05
 */
public class Test {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {7, 6, 18, 5, 4, 3};
        System.out.println("排序前：" + Arrays.toString(arr));

        // 冒泡排序
        // 外层循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制比较的次数
            for (int j = 0;j<arr.length-1-i;j++){
                // 比较判断 arr[j]与arr[j+1]
                if (arr[j] > arr[j+1]){
                    // 交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println("排序后：" + Arrays.toString(arr));
    }
}

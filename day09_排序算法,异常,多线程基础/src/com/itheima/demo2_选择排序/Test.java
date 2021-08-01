package com.itheima.demo2_选择排序;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 9:33
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {45, 25, 35, 55, 15};
        System.out.println("排序前：" + Arrays.toString(arr));

        // 选择排序
        // 外层循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制比较的次数
            for (int j = i + 1; j < arr.length; j++) {
                // 比较判断: arr[i]vsarr[j]
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("排序后：" + Arrays.toString(arr));
    }
}

package com.itheima.demo3_二分查找;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 10:15
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 14, 21, 38, 45, 47, 53, 81, 87, 99};

        // 0.定义要查找的元素
        System.out.println(binarySearch(arr, 38));// 3
        System.out.println(binarySearch(arr, 87));// 8
        System.out.println(binarySearch(arr, 50));// -1


    }

    public static int binarySearch(int[] arr, int num) {
        // 1.定义一个变量,记录左边元素的索引,初始值为0
        int left = 0;

        // 2.定义一个变量,记录右边元素的索引,初始值为arr.length-1
        int right = arr.length - 1;

        // 3.while循环查找,循环的条件: 记录左边元素的索引 <= 记录右边元素的索引
        while (left <= right) {
            // 4.计算中间元素的索引
            int mid = (left + right) / 2;
            // 5.判断中间索引对应的元素与要查找的元素进行比较判断:
            if (arr[mid] == num) {
                // 6.如果中间索引对应的元素等于要查找的元素,那么就直接输出打印
                return mid;
            } else if (arr[mid] < num) {
                // 6.如果中间索引对应的元素小于要查找的元素,说明要查找的元素在右边,那么记录左边元素的索引就为中间索引+1
                left = mid + 1;
            } else {
                // 6.如果中间索引对应的元素大于要查找的元素,说明要查找的元素在左边,那么记录右边元素的索引就为中间索引-1
                right = mid - 1;
            }
        }

        return -1;
    }
}

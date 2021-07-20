package com.itheima.demo17_Arrays类;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 16:45
 */
public class Test {
    public static void main(String[] args) {
        /*
            Arrays类:
                概述:java.util.Arrays类：该类包含用于操作数组的各种方法（如排序和搜索）,包含了很多的静态方法
                常用方法:
                    - public static void sort(int[] a)：按照数字顺序排列指定的数组
                    - public static String toString(int[] a)：返回指定数组的内容的字符串表示形式

         */
        int[] arr = {12,334,53,543,43,32};
        System.out.println("排序之前的数组:"+Arrays.toString(arr));
        // 对arr数组中的元素进行升序排序
        Arrays.sort(arr);
        System.out.println("排序之后的数组:"+Arrays.toString(arr));

    }
}

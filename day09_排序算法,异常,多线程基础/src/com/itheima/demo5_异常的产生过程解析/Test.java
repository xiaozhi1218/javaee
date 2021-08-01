package com.itheima.demo5_异常的产生过程解析;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 11:23
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        method(arr,4);
    }

    /**
     * 查找指定索引位置的元素
     * @param arr
     * @param index
     */
    public static void method(int[] arr,int index){
        int num = arr[index];
        System.out.println(num);
    }
}

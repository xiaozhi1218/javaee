package com.itheima.demo8_递归累和;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 11:14
 */
public class Test {
    public static void main(String[] args) {
        /*
            递归:
                规律:为了清楚什么时候递归
                出口:为了结束递归
         */
        // 需求:使用递归计算1 ~ n的累加和
        /*
            1的累加和 = 1
            2的累加和 = 1 + 2
            3的累加和 = 1 + 2 + 3
            4的累加和 = 1 + 2 + 3 + 4
            5的累加和 = 1 + 2 + 3 + 4 + 5
            ...
            n的累加和 = n + (n-1)的累加和
         */
        System.out.println(getSum(5));// 15
    }

    /**
     * 计算一个数的累加和
     * @param n
     * @return 累加和
     */
    public static int getSum(int n){
        // 出口
        if (n == 1){
            return 1;
        }
        return n + getSum(n-1);
    }
}

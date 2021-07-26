package com.itheima.demo9_递归求阶乘;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 11:29
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求: 使用递归计算n的阶乘
            分析:
                阶乘:所有小于及等于该数的正整数的积。
                例如:n!= n * (n-1) * ...* 1
                1! = 1
                2! = 1 * 2
                3! = 1 * 2 * 3
                4! = 1 * 2 * 3 * 4
                5! = 1 * 2 * 3 * 4 * 5
                ...
                n! = n * (n-1)!
         */
        System.out.println(jieCheng(5));// 120
    }

    /**
     * 计算一个数的阶乘
     *
     * @param n
     * @return 阶乘
     */
    public static int jieCheng(int n) {
        // 出口
        if (n == 1){
            return 1;
        }
        return n * jieCheng(n - 1);
    }
}

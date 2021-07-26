package com.itheima.demo3_代码块.demo3_局部代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:52
 */
public class Test {
    public static void main(String[] args) {
        /*
            局部代码块:
                格式: {}
                位置: 方法中
                执行: 调用方法,执行到了局部代码块的时候执行
                使用场景: 节省内存空间,没有太多意义
         */
        System.out.println("开始");
        {
            int num1 = 10;
            System.out.println("局部代码块");
        }// 把局部代码块中的变量占用的空间会释放

        System.out.println("结束");
    }
}

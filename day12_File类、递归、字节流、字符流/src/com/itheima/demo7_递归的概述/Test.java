package com.itheima.demo7_递归的概述;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 11:07
 */
public class Test {
    static int count = 0;
    public static void main(String[] args) {
        /*
            程序中的递归: 指在当前方法内调用自己的这种现象
            注意事项:
                1.递归一定要有出口,否则会报栈内存溢出错误StackOverflowError
                2.递归出口太晚了,还是会报栈内存溢出错误StackOverflowError
         */
        method();
    }

    public static void method(){
        count++;
        if (count == 70000){
            return;
        }
        System.out.println("method 方法执行了...");
        method();
    }
}

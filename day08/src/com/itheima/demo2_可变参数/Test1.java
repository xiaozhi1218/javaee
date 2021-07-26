package com.itheima.demo2_可变参数;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 9:46
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            可变参数:
                概述:在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化.
                格式:
                    修饰符 返回值类型 方法名(数据类型... 变量名){}

         */
       /* method1(10,20,30,40,50);

        int[] arr = {10,20,30,40,50};
        method2(arr);*/

        /*method3();
        method3(10,20,30,40);*/
        method3(10,20,30,40,50);

       /* int[] arr = {10,20,30,40,50};
        method3(arr);*/
    }

    // 定义一个方法,可以接收5个int类型的数
    public static void method3(int... nums){
        // 使用:把nums可变参数当成数组使用
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // 定义一个方法,可以接收5个int类型的数
    public static void method2(int[] arr){// 接收数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 定义一个方法,可以接收5个int类型的数
    public static void method1(int num1,int num2,int num3,int num4,int num5){// 接收5个具体的数

    }

}

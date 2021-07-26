package com.itheima.demo13_System类;

import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 15:26
 */

public class Test {
    public static void main(String[] args) {
        /*
            System类:
                System类的概述: java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作。
                System类的方法:
                    public static void exit(int status) 终止当前运行的Java虚拟机，非零表示异常终止
                    public static long currentTimeMillis() 返回当前时间距离标准基准时间的毫秒值(以毫秒为单位)
                    额外增加:
                    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 拷贝数组中的元素到另一个数组
                          参数1src: 源数组
                          参数2srcPos:源数组要拷贝的元素的起始索引(从哪个索引位置开始拷贝)
                          参数3dest: 目标数组
                          参数4destPos:目标数组接收拷贝元素的起始索引(从哪个索引位置开始接收)
                          参数5length:需要拷贝多少个元素(拷贝多少个)
         */
        System.out.println("开始");
        System.out.println("执行");
        //System.exit(0);// 程序正常退出
        //System.exit(-1);// 程序非正常退出

        // 获取当前时间距离标准基准时间的毫秒值
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        // 拷贝数组元素到另一个数组中
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {10,20,30,40,50,60,70,80};
        // 需求:把arr1中的3,4,5,6,7元素拷贝到arr2数组中,使得arr2数组变成{10,3,4,5,6,7,70,80};
        System.arraycopy(arr1,2,arr2,1,5);

        // 遍历arr2数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("结束");


    }


}

package com.itheima.demo1_面向对象编程思想;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 9:29
 */
public class Test {
    public static void main(String[] args) {
        // 需求:打印数组中所有的元素,打印格式为: [元素1，元素2，元素3，元素，...，元素n]
        // 1 定义一个数组,并且初始化数组中的元素
        int[] arr = {10, 20, 30, 40, 50};

        // 面向过程:
        // 1.循环遍历数组  数组名.fori 回车
        for (int i = 0; i < arr.length; i++) {
            // 2.在循环中,获取数组元素
            int e = arr[i];

            // 3.在循环中,判断数组元素:
            if (i == 0) {
                // 4.如果元素是第一个元素,那么打印格式为: [ + 元素 + 逗号空格   不换行
                System.out.print("["+e+", ");
            } else if (i == arr.length - 1) {
                // 4.如果元素是最后一个元素,那么打印格式为: 元素 + ]            换行\不换行
                System.out.println(e+"]");
            } else {
                // 4.如果元素是中间元素,那么打印格式为: 元素 + 逗号空格         不换行
                System.out.print(e+", ");
            }
        }

        // 面向对象:
        // jdk中提供了一个Arrays类,toString()方法可以帮助我们按照这种格式打印数组中的所有元素
        System.out.println(Arrays.toString(arr));
    }
}

package com.itheima.demo14_字符串拼接升级版案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 15:11
 */
public class Test {
    public static void main(String[] args) {
        /*
            	定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
            	并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

         */
        int[] arr = {1,2,3};
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        // 1.创建可变的空白字符串对象
        StringBuilder sb = new StringBuilder();

        // 2.循环遍历传入的数组元素
        for (int i = 0; i < arr.length; i++) {
            // 3.在循环中,获取遍历出来的元素
            int e = arr[i];
            // 4.在循环中,判断该元素:
            if (i == 0) {
                // 5.如果遍历出来的元素是第一个元素,那么拼接的格式为: [ + 元素 + 逗号空格
                sb.append("[").append(e).append(", ");
            } else if (i == arr.length - 1) {
                // 5.如果遍历出来的元素是最后一个元素,那么拼接的格式为: 元素 + ]
                sb.append(e).append("]");
            } else {
                // 5.如果遍历出来的元素是中间元素,那么拼接的格式为: 元素 + 逗号空格
                sb.append(e).append(", ");
            }

        }
        // 6.返回字符串
        return sb.toString();
    }
}

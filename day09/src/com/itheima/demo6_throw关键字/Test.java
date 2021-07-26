package com.itheima.demo6_throw关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 11:49
 */
public class Test {
    public static void main(String[] args) {
        /*
            throw关键字:
                作用:throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。
                格式: throw 异常对象;
         */
        int[] arr = {10,20,30,40};
        method(arr,4);
    }

    /**
     * 查找指定索引位置的元素
     * @param arr
     * @param index
     */
    public static void method(int[] arr,int index){
        if (index < 0 || index > arr.length-1){
            // 索引不存在-->产生一个异常
            throw new ArrayIndexOutOfBoundsException(index+"");
        }else{
            int num = arr[index];
            System.out.println(num);
        }
    }
}

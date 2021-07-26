package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:33
 */
public class Test6_clear和flip {
    public static void main(String[] args) {

        /*
            - public Buffer clear()：还原缓冲区的状态。
              - 将限制limit设置为容量capacity；
              - 将position设置为：0
              - 丢弃标记mark。

            - public Buffer flip()：缩小limit的范围。
              - 将limit设置为当前position位置；
              - 将当前position位置设置为0；
              - 丢弃标记。
         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 容量:10,限制:10,位置:0
        System.out.println("容量:" + b.capacity() + ",限制:" + b.limit() + ",位置:" + b.position());

        // 往b添加数据
        b.put((byte) 10);
        b.put((byte) 20);
        b.put((byte) 30);

        // 容量:10,限制:10,位置:3
        System.out.println("容量:" + b.capacity() + ",限制:" + b.limit() + ",位置:" + b.position());
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]


        /*// 调用clear
        b.clear();
        // 容量:10,限制:10,位置:0
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit()+",位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
        */

        // 调用flip()
        b.flip();
        // 容量:10,限制:3,位置:0
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit()+",位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]

    }
}

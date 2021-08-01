package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:26
 */
public class Test5_标记mark {
    public static void main(String[] args) {
        /*
            标记-mark:
                标记mark是指：当调用缓冲区的reset()方法时，会将缓冲区的position位置重置为该索引。
                - public Buffer mark()：设置此缓冲区的标记为当前的position位置。
                - public Buffer reset() : 将此缓冲区的位置重置为以前标记的位置。
         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 往b中添加数据
        b.put((byte)10);

        // position:1,limit:10
        System.out.println("position:"+b.position()+",limit:"+b.limit());

        // mark标记一下
        b.mark();// 标记当前position位置为1

        // 往b中添加数据
        b.put((byte)20);
        b.put((byte)30);
        b.put((byte)40);
        b.put((byte)50);

        // position:5,limit:10
        System.out.println("position:"+b.position()+",limit:"+b.limit());

        // 重置一下
        b.reset();// position重置为1
        b.put((byte)2);// 把1这个位置设置为了2
        // position:2,limit:10
        System.out.println("position:"+b.position()+",limit:"+b.limit());
        System.out.println(Arrays.toString(b.array()));// [10, 2, 30, 40, 50, 0, 0, 0, 0, 0]

    }
}

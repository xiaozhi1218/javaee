package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:19
 */
public class Test4_位置position {
    public static void main(String[] args) {
        /*
            位置position是指：当前可写入的索引。位置不能小于0，并且不能大于"限制"。
            - public int position()：获取当前可写入位置索引。
            - public Buffer position(int p)：更改当前可写入位置索引。

            注意: 字节缓冲数组能操作的范围就是position位置到limit位置:[position,limit)
         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 容量:10,限制:10,位置:0
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit()+",位置:"+b.position());

        // 往b添加数据
        b.put((byte)10);
        b.put((byte)20);
        b.put((byte)30);
        // 容量:10,限制:10,位置:3
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit()+",位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]

        // 修改当前位置为6
        b.position(6);
        b.put((byte)40);
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 40, 0, 0, 0]

    }
}

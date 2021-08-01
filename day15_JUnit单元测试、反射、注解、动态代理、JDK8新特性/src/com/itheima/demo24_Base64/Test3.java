package com.itheima.demo24_Base64;

import java.util.Base64;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:37
 */
public class Test3 {
    public static void main(String[] args) {

        // 1.获取基本型的编码器
        Base64.Encoder encoder = Base64.getMimeEncoder();

        // 2.对数据进行编码
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += i+"";
        }
        String encodeStr = encoder.encodeToString(str.getBytes());
        System.out.println("编码后的:"+encodeStr);

        // 3.获取解码器
        Base64.Decoder decoder = Base64.getMimeDecoder();

        // 4.对数据进行解码
        byte[] bys = decoder.decode(encodeStr);
        System.out.println("解码后的:"+new String(bys));

    }
}

package com.itheima.demo24_Base64;

import java.util.Base64;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:37
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            概述:Base64是jdk8提出的一个新特性,可以用来进行按照一定规则编码和解码
            使用:
                编码:
                    1.获取编码器
                    2.对数据进行编码
                解码:
                    1.获取解码器
                    2.对数据进行解码
            api:
                static Base64.Decoder getDecoder() 基本型 base64 解码器。
                static Base64.Encoder getEncoder() 基本型 base64 编码器。

                static Base64.Decoder getUrlDecoder() Url型 base64 解码器。
                static Base64.Encoder getUrlEncoder() Url型 base64 编码器。

                static Base64.Decoder getMimeDecoder() Mime型 base64 解码器。
                static Base64.Encoder getMimeEncoder() Mime型 base64 编码器。

                Encoder编码器:  encodeToString(byte[] bys)编码
                Decoder解码器:  decode(String str) 解码

         */
        // 1.获取基本型的编码器
        Base64.Encoder encoder = Base64.getEncoder();

        // 2.对数据进行编码
        String str = "name=中国?password=123456";
        String encodeStr = encoder.encodeToString(str.getBytes());
        System.out.println("编码后的:"+encodeStr);

        // 3.获取解码器
        Base64.Decoder decoder = Base64.getDecoder();

        // 4.对数据进行解码
        byte[] bys = decoder.decode(encodeStr);
        System.out.println("解码后的:"+new String(bys));

    }
}

package com.itheima.demo3_服务器回写字符串数据给客户端;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 10:30
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 客户端:
        // 1.创建Socket对象,指定要连接的服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",6666);
        //System.out.println(socket);// 封装了服务器的ip地址和端口号

        while (true) {
            // 2.通过Socket对象获得输出流
            OutputStream os = socket.getOutputStream();

            // 获取客户端输入的字符串
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            // 3.写出数据到服务器
            os.write(str.getBytes());

            //4.通过Socket对象获得输入流
            InputStream is = socket.getInputStream();

            //5.读取服务器写过来的数据
            byte[] bys = new byte[8192];
            int len = is.read(bys);
            System.out.println(new String(bys,0,len));
        }

        // 6.关闭流,释放资源
        //socket.close();

    }
}

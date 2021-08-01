package com.itheima.demo8_线程优化并发操作;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 11:02
 */
public class Client {
    public static void main(String[] args) throws Exception{
       // 客户端:
       // 1.创建Socket对象,指定要连接的服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",6666);

       // 2.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day14\\aaa\\hbCopy1.jpg");

       // 3.通过Socket获取输出流
        OutputStream os = socket.getOutputStream();

        // 4.定义一个字节数组,用来存储读取到的字节数据
        byte[] bys = new byte[8192];

       // 4.定义一个int变量,用来存储读取到的字节个数
        int len;

       // 5.循环读取数据
        while ((len = fis.read(bys)) != -1) {
            // 6.在循环中,写出数据
            os.write(bys, 0, len);
        }

        // os.write("");
        // - 在文件上传时，客户端从文件中读不到数据，就会停止发送。
        // 但是服务器端不知道客户端停止了写数据，所以会一直等待接收客户端写过来的数据。
        // 解决办法：在客户端调用s.shutdownOutput();通知服务器端发送结束了。
        socket.shutdownOutput();

        System.out.println("=======开始接收服务器回写的数据=======");
        //7.通过Socket获得输入流
        InputStream is = socket.getInputStream();

        //8.读取服务器回写的字符串数据
        int read = is.read(bys);// 卡死
        System.out.println(new String(bys,0,read));

        // 9.关闭流,释放资源
        fis.close();
        socket.close();

    }
}

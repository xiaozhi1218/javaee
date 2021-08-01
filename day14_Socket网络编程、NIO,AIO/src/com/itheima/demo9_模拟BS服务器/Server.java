package com.itheima.demo9_模拟BS服务器;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 11:56
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 服务器:
        // 1.创建ServerSocket对象,指定端口号(6666)
        ServerSocket ss = new ServerSocket(6666);

        while (true) {
            // 2.调用accept()方法,获得请求,得到Socket对象
            Socket socket = ss.accept();

            // 连接建立,开辟线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 3.通过返回的Socket对象,获得输入流
                        InputStream is = socket.getInputStream();

                        // 4.通过输入流,去连接通道中获取数据,进行筛选,筛选出浏览器需要访问的页面路径
                        // 4.1 把字节输入流转换为字符输入流
                        InputStreamReader isr = new InputStreamReader(is);
                        //  4.2 读取第一行数据
                        BufferedReader br = new BufferedReader(isr);
                        String line = br.readLine();
                        System.out.println(line);// GET /day14/web/index.html HTTP/1.1
                        // 4.3 截取浏览器需要访问的页面路径
                        String path = line.split(" ")[1].substring(1);
                        System.out.println(path);// day14/web/index.html


                        // 5.创建字节输入流对象,关联要访问的页面路径
                        FileInputStream fis = new FileInputStream(path);

                        // 6.通过Socket对象获得输出流
                        OutputStream os = socket.getOutputStream();

                        // 7.定义一个byte数组,用来存储读取到的字节数据
                        byte[] bys = new byte[8192];

                        // 7.定义一个int变量,用来存储读取到的字节个数
                        int len;

                        // 响应页面的时候需要同时把以下响应过去给浏览器
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        // 8.循环读取数据
                        while ((len = fis.read(bys)) != -1) {
                            // 9.在循环中写出数据
                            os.write(bys, 0, len);
                        }
                        // 10.关闭流,释放资源
                        fis.close();
                        socket.close();
                        //ss.close();
                    } catch (Exception e) {

                    }
                }
            }).start();
        }

    }
}

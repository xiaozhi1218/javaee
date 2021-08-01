package com.itheima.demo14_序列化的注意事项;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:01
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        // 需求:把b.txt文件中的Student对象,重构出来
        // 1.创建反序列化流对象,关联目的地文件路径
        FileInputStream fis = new FileInputStream("day13\\ccc\\b.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2.读取\重构对象
        Student stu = (Student) ois.readObject();
        System.out.println(stu);

        // 3.关闭流,释放资源
        ois.close();
    }
}

package com.itheima.demo15_反序列化的注意事项;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:58
 */
public class Test1_序列化 {
    public static void main(String[] args) throws Exception{

        // 需求: 把Student对象写出到指定文件中
        // 1.创建Student对象
        Student stu = new Student("张三",18);

        // 2.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\ccc\\c.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3.写出对象
        oos.writeObject(stu);

        // 4.关闭流,释放资源
        oos.close();
    }
}

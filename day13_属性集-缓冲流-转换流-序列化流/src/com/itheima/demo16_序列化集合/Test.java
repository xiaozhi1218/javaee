package com.itheima.demo16_序列化集合;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:15
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            序列化集合:
                需求
                    1. 将存有多个自定义对象的集合序列化操作，保存到list.txt文件中。
                    2. 反序列化list.txt ，并遍历集合，打印对象信息。
         */
        // 创建反序列化流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\ccc\\list.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 读取对象
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();

        // 关闭流,释放资源
        ois.close();

        // 遍历输出集合中的元素
        for (Student stu : list) {
            System.out.println(stu);
        }
    }

    private static void method01() throws IOException {
        // 1.创建多个Student对象
        Student stu1 = new Student("张三1",18);
        Student stu2 = new Student("张三2",18);
        Student stu3 = new Student("张三3",18);
        Student stu4 = new Student("张三4",18);

        // 2.创建ArrayList集合,用来存储Student对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        // 3.创建序列化对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\ccc\\list.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 4.写出集合对象
        oos.writeObject(list);

        // 5.关闭流,释放资源'
        oos.close();
    }
}

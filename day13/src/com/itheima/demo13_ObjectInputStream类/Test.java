package com.itheima.demo13_ObjectInputStream类;

import com.itheima.demo12_ObjectOutputStream类.Student;
import com.itheima.demo12_ObjectOutputStream类.Animal;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:50
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            ObjectInputStream类的使用:
                概述:java.io.ObjectInputStream 类,是InputStream类的子类.
                特点: 可以将文件中对象的字节数据重构成一个对象
                构造方法:
                    public ObjectInputStream(InputStream in)： 创建一个指定InputStream的ObjectInputStream。
                成员方法:
                    public final Object readObject () : 重构对象
         */
        // 需求:把a.txt文件中的Student对象,重构出来
        // 1.创建反序列化流对象,关联目的地文件路径
        FileInputStream fis = new FileInputStream("day13\\ccc\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2.读取\重构对象
        Student stu = (Student) ois.readObject();
        System.out.println(stu);

        // 3.关闭流,释放资源
        ois.close();
    }
}

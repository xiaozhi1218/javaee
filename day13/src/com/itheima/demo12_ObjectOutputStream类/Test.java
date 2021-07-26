package com.itheima.demo12_ObjectOutputStream类;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:38
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            ObjectOutputStream类:
                概述:java.io.ObjectOutputStream 类,是OutputStream类的子类.
                特点: 可以将java对象以字节的形式存储到文件中,实现对象的持久保存
                构造方法:
                    public ObjectOutputStream(OutputStream out)： 创建一个指定OutputStream的ObjectOutputStream。
                成员方法:
                    public final void writeObject (Object obj) : 将指定的对象写出。

                要求:
                    1.需要序列化的对象所属的类必须实现序列化接口Serializable
                    2.该类的所有属性必须是可序列化的。
         */
        // 需求: 把Student对象写出到指定文件中
        // 1.创建Student对象
        Student stu = new Student("张三",18);
        stu.anl = new Animal();

        // 2.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\ccc\\a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3.写出对象
        oos.writeObject(stu);

        // 4.关闭流,释放资源
        oos.close();
    }
}

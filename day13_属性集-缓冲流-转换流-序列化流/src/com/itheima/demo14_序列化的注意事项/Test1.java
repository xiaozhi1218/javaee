package com.itheima.demo14_序列化的注意事项;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:58
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        /*
            序列化的注意事项:
                1.该类必须实现java.io.Serializable 接口，Serializable 是一个标记接口，
                  不实现此接口的类将不会使任何状态序列化或反序列化，会抛出NotSerializableException 。
                2.该类的所有属性必须是可序列化的。
                3.如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用 transient 关键字修饰。
         */
        // 需求: 把Student对象写出到指定文件中
        // 1.创建Student对象
        Student stu = new Student("张三",18);

        // 2.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\ccc\\b.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3.写出对象
        oos.writeObject(stu);

        // 4.关闭流,释放资源
        oos.close();
    }
}

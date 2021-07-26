package com.itheima.demo15_反序列化的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            反序列化的注意事项:
                1.对于JVM可以反序列化对象，它必须是能够找到class文件的类。
                   如果找不到该类的class文件，则抛出一个 ClassNotFoundException 异常。
                2.当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，
                   那么反序列化操作也会失败，抛出一个InvalidClassException异常。
                   解决:在类中加入一个版本号:static final long serialVersionUID = 42L;
         */
    }
}

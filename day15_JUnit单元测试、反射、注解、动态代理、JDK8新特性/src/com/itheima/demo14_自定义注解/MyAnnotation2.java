package com.itheima.demo14_自定义注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 12:26
 */
public @interface MyAnnotation2 {
    // 1.基本类型
    byte b();
    short s();
    int i();
    long l();
    char c();
    double d();
    float f();
    boolean flag();

	// 2.String
    String str();

	// 3.Class类型
   Class z();

	// 4.注解类型
    MyAnnotation1 myA();

	// 5. 枚举类型
    Sex sex();

	// 6.以上类型的一维数组类型
    byte[] arr1();
    short[] arr2();
    String[] arr3();
    Class[] arr4();
    MyAnnotation1[] arr5();
    Sex[] arr6();
}

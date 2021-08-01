package com.itheima.demo12_继承的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 14:33
 */
class A{ }
class B{ }
class C1 extends A{}
// java只支持单继承,不支持多继承
/*class C2 extends A ,B{}*/

// java可以多层继承
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}

// 一个类只能有一个父类,但可以有多个子类
class Person{}
class Student extends Person{}
class Teacher extends Person{}

public class Test {

}

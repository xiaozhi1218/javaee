package com.itheima.demo12_异常注意事项;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 15:49
 */
class Fu {
    public void show() throws ParseException, FileNotFoundException {
        // ...
    }

    public void run() {

    }
}

class Zi extends Fu {
    // 2.如果父类的方法抛出了多个异常,子类覆盖(重写)父类方法时,只能抛出相同的异常或者是他的子集。
   /* @Override
    public void show() throws ParseException, FileNotFoundException, IOException {

    }*/

   // 3.父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常,只能捕获处理
    @Override
    public void run() {
        try {
            throw new FileNotFoundException("");
        }catch (FileNotFoundException e){

        }
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            异常注意事项:
                1.运行时异常被抛出可以不处理。即不捕获也不声明抛出。
                2.如果父类的方法抛出了多个异常,子类覆盖(重写)父类方法时,只能抛出相同的异常或者是他的子集。
                3.父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
                4.声明处理多个异常,可以直接声明这多个异常的父类异常
                5.在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收。
                6.多个异常使用捕获又该如何处理呢？
                    1. 多个异常分别处理。
                    2. 多个异常一次捕获，多次处理。
                    3. 多个异常一次捕获一次处理。
                7.当多异常分别处理时，捕获处理，前边的类不能是后边类的父类
         */
    }

    // 1.运行时异常被抛出可以不处理。即不捕获也不声明抛出。
    public static void show1() {
        System.out.println(1 / 0);
    }

    // 4.声明处理多个异常,可以直接声明这多个异常的父类异常
    public static void show2(int num) throws Exception{
        if (num == 1){
            throw new FileNotFoundException("");
        }else{
            throw new ParseException("",1);
        }
    }

    // 多个异常使用捕获又该如何处理呢？
    // 1. 多个异常分别处理。
    public static void show3(int num) {
        if (num == 1){
            try {
                throw new FileNotFoundException("");
            } catch (FileNotFoundException e) {

            }
        }else{
            try {
                throw new ParseException("",1);
            } catch (ParseException e) {

            }
        }
    }
    // 2. 多个异常一次捕获，多次处理。
    public static void show4(int num) {
        try {
            if (num == 1){
                throw new FileNotFoundException("");
            }else{
                throw new ParseException("",1);
            }
        }catch (FileNotFoundException e){

        }catch (ParseException e){

        }
    }
    // 3. 多个异常一次捕获一次处理。
    public static void show5(int num) {
        try {
            if (num == 1){
                throw new FileNotFoundException("");
            }else{
                throw new ParseException("",1);
            }
        }catch (Exception e){

        }
    }
    // 7.当多异常分别处理时，捕获处理，前边的类不能是后边类的父类
    public static void show6(int num) {
        try {
            if (num == 1){
                throw new FileNotFoundException("");
            }else{
                throw new ParseException("",1);
            }
        }catch (Exception e){

        }/*catch (ParseException e){

        }*/
    }
}

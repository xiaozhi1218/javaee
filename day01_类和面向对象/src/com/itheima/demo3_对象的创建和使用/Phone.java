package com.itheima.demo3_对象的创建和使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 10:27
 */
public class Phone {
    //属性(成员变量): 数据类型 变量名;
    /**
     * 品牌
     */
    String brand;
    /**
     * 价格
     */
    double price;

    //行为(成员方法): 去掉static

    /**
     * 打电话的功能
     * @param phoneNum 电话号码
     */
    public void call(String phoneNum){
        System.out.println("正在给"+phoneNum+"打电话...");
    }

    /**
     * 发短信的功能
     * @param phoneNum 电话号码
     * @param message  短信内容
     */
    public void sendMessage(String phoneNum,String message){
        System.out.println("正在给"+phoneNum+"发送短信,短信内容是:"+message);
    }

    // 为了演示有返回值的方法调用
    public int show(String str){
        System.out.println("有参数有返回值的方法:"+str);
        return 100;
    }
}

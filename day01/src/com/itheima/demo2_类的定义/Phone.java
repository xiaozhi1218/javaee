package com.itheima.demo2_类的定义;

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
        System.out.println("正则给"+phoneNum+"打电话...");
    }

    /**
     * 发短信的功能
     * @param phoneNum 电话号码
     * @param message  短信内容
     */
    public void sendMessage(String phoneNum,String message){
        System.out.println("正在给"+phoneNum+"发送短信,短信内容是:"+message);
    }
}

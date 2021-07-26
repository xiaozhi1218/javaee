package com.itheima.demo3_Properties类的使用;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 9:46
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Properties类的使用:
                概述:java.util.Properties 继承于Hashtable ，来表示一个持久的属性集
                特点:
                    1.Properties当成Map集合使用,键和值的类型为Object类型
                    2.Properties当成属性集使用,键和值的类型为String类型
                构造方法:
                    public Properties() :创建一个空的属性列表。
                成员方法:
                    - public Object setProperty(String key, String value) ： 保存一对属性。
                    - public Set<String> stringPropertyNames() ：所有键的名称的集合。
                    - public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
                    - public void load(InputStream inStream)： 从字节输入流中读取键值对。
                注意:文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔。
         */
        // 创建Properties对象
        Properties pro = new Properties();

        // 存储键值对
        pro.setProperty("k1", "v1");
        pro.setProperty("k2", "v2");
        pro.setProperty("k3", "v3");
        pro.setProperty("k4", "v4");
        System.out.println(pro);

        // 获取所有的键
        Set<String> keys = pro.stringPropertyNames();
        System.out.println(keys);

        // 根据键找值
        for (String key : keys) {
            String value = pro.getProperty(key);
            System.out.println(key+","+value);
        }

        // 需求:把day13\aaa\a.txt文件中的数据加载到pro对象中
        // 创建输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\a.txt");
        // 加载文件中的数据
        pro.load(fis);
        // 关闭流
        fis.close();
        System.out.println(pro);
    }
}

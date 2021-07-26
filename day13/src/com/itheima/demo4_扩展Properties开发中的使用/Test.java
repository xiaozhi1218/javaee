package com.itheima.demo4_扩展Properties开发中的使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 10:03
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            扩展--Properties开发中的使用:
                1.开发中的配置文件一般是后缀为.properties的文件
                2.开发中的配置文件一般放在src目录下
                3.开发中,配置文件中的内容一般不出现中文
                4.开发中,一般只会去配置文件中读取数据


                public void store(OutputStream out, String comments):把Properties对象中的键值对写回配置文件中
                public void store(Writer w, String comments):把Properties对象中的键值对写回配置文件中
                public void load(Reader reader)
         */
        // 创建Properties对象
        Properties pro = new Properties();

        // 调用load方法加载配置文件
        //pro.load(new FileInputStream("day13\\src\\db.properties"));

        // 了解:直接获取一个流,该流的默认路径就是已经到了src
        InputStream is = Test.class.getClassLoader().getResourceAsStream("db.properties");
        pro.load(is);

        // 获取数据,打印
        // 获取pro对象的所有键
        Set<String> keys = pro.stringPropertyNames();
        // 循环遍历所有的键
        for (String key : keys) {
            // 根据键找值
            String value = pro.getProperty(key);
            System.out.println(key+","+value);
        }

        System.out.println("===============扩展:添加一个键值对到配置文件中===============");
        // 往pro对象中添加一个键值对: k=v
        pro.setProperty("k", "v");

        // 把pro对象中所有的键值对重新写回db.properties文件中
        pro.store(new FileOutputStream("day13\\src\\db.properties"), "itheima");

        System.out.println("===============扩展:修改配置文件中的键值对数据===============");
        pro.setProperty("password", "654321");
        pro.store(new FileOutputStream("day13\\src\\db.properties"), "itcast");


    }
}

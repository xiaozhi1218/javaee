package com.itheima.demo10_LinkedHashMap;

import java.util.LinkedHashMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:25
 */
public class Test {
    public static void main(String[] args) {
        /*
            LinkedHashMap: 元素存取有序,键唯一,值可重复
                - 通过链表结构可以保证元素的存取顺序一致；
                - 通过哈希表结构可以保证的键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。
         */
        // 创建LinkedHashMap集合,限制键的类型为Integer,值的类型为String
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 往map集合中添加键值对
        map.put(300, "深圳");
        map.put(100, "北京");
        map.put(200, "广州");
        map.put(500, "上海");
        map.put(400, "武汉");
        map.put(400, "深圳");
        System.out.println(map);
    }
}

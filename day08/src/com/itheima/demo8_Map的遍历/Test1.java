package com.itheima.demo8_Map的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:04
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            Map的遍历:
                方式一:根据键找值
                1.获取Map集合所有的键
                2.循环遍历Map集合所有的键
                3.在循环中,根据键找值
         */
        // 创建Map集合,限制键的类型为String,值的类型为String
        Map<String, String> map = new HashMap<>();

        // 往map集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");

        // 方式一:根据键找值
        // 1.获取Map集合所有的键
        Set<String> keys = map.keySet();

        // 2.循环遍历Map集合所有的键
        for (String key : keys) {
            // 3.在循环中,根据键找值
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}

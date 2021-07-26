package com.itheima.demo8_Map的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:07
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            Entry<K,V>接口:简称Entry项,表示键值对对象,用来封装Map集合中的键值对
            Entry<K,V>接口:是Map接口中的内部接口,在外部使用的时候是这样表示: Map.Entry<K,V>
            Entry<K,V>接口的api:
                K getKey(); 获取键值对对象包装的键
                V getValue();获取键值对对象包装的值

            Map的遍历:
                方式二: 键值对对象的形式
                 1.获取Map集合中的所有键值对 对应的 键值对对象  entrySet()方法
                 2.循环遍历所有的键值对对象
                 3.根据键值对对象获取键和值
         */
        // 创建Map集合,限制键的类型为String,值的类型为String
        Map<String, String> map = new HashMap<>();

        // 往map集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");

        // 方式二: 键值对对象的形式
        // 1.获取Map集合中的所有键值对 对应的 键值对对象  entrySet()方法
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // 2.循环遍历所有的键值对对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 3.根据键值对对象获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }


    }
}

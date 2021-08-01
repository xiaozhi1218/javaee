package com.itheima.demo7_Map的常用方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 12:09
 */
public class Test {
    public static void main(String[] args) {
        /*
             Map<K,V>的常用方法:
                - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
                - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
                - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。

                - public boolean containsKey(Object key):判断该集合中是否有此键
                - public boolean containsValue(Object value):判断该集合中是否有此值

                - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
                - public Collection<V> values(): 获取Map集合中所有的值，存储到Collection集合中。

                - public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
                    Map.Entry<K,V>:表示键值对对象---把键值对包装成一个对象,该对象的类型就是Entry类型
         */
        // 创建Map集合,限制键的类型为String,值的类型为String
        Map<String, String> map = new HashMap<>();

        // 往map集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");
        System.out.println(map);// {文章=马伊琍, 谢霆锋=王菲, 黄晓明=杨颖}

        // Map集合键唯一,如果键重复了,值会覆盖
        String v1 = map.put("文章", "姚笛");
        System.out.println("v1:"+v1);// 马伊琍
        System.out.println(map);// {文章=姚笛, 谢霆锋=王菲, 黄晓明=杨颖}

        // Map集合值可以重复
        String v2 = map.put("李亚鹏", "王菲");
        System.out.println("v2:"+v2);// null
        System.out.println(map);// {文章=姚笛, 谢霆锋=王菲, 李亚鹏=王菲, 黄晓明=杨颖}

        // 删除文章这个键对应的键值对
        String v3 = map.remove("文章");
        System.out.println("被删除键值对的值:"+v3);// 姚笛
        System.out.println(map);// {谢霆锋=王菲, 李亚鹏=王菲, 黄晓明=杨颖}

        // 获取黄晓明这个键对应的值
        String value = map.get("黄晓明");
        System.out.println("value:"+value);// 杨颖

        // 判断是否包含指定的键
        System.out.println(map.containsKey("黄晓明"));// true
        System.out.println(map.containsKey("文章"));// false

        // 判断是否包含指定的值
        System.out.println(map.containsValue("杨颖"));// true
        System.out.println(map.containsValue("马伊琍"));// false

        // 获取所有的键
        Set<String> keys = map.keySet();
        System.out.println("keys:"+keys);// [谢霆锋, 李亚鹏, 黄晓明]

        // 获取所有的值
        Collection<String> values = map.values();
        System.out.println("values:"+values);// [王菲, 王菲, 杨颖]

        // 获取Map集合中所有键值对对象
        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println(set);// [谢霆锋=王菲, 李亚鹏=王菲, 黄晓明=杨颖]

    }
}

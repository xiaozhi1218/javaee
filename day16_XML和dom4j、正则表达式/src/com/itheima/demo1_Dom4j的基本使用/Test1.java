package com.itheima.demo1_Dom4j的基本使用;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 12:11
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        /*
            Dom4j的基本使用:
                使用步骤:
                    1.下载Dom4j的jar包
                    2.把jar包导入到模块的lib文件夹中,并添加到classpath路径下
                    3.创建解析器对象
                    4.使用解析器读取xml文档,生成Document对象
                    5.根据Document对象获取根元素
                    6.根据根元素获取下面的子元素\属性...
                常用的方法:
                   创建解析器对象：
                        SAXReader sr = new SAXReader();
                    解析器读取文件方法：
                        Document doc = sr.read(String fileName);
                    Document的方法：
                        Element getRootElement()			: 获取根元素

                    Element的方法：
                        elements()     				: 获取当前元素的子元素
                        getName()					: 获取元素的元素名
                        attributeValue(String name)	: 获取当前元素下某个属性的值
                        getText()					: 获取当前元素的文本值

                        element(String name)		: 根据元素名获取指定子元素(如果有多个就获取到第一个)
                        elementText(String name)	: 获取指定子元素的文本值,参数是子元素名称
         */
        // 1.创建解析器对象
        SAXReader sr = new SAXReader();
        // 2.使用解析器读取xml文档,生成Document对象
        Document document = sr.read("day16\\src\\book.xml");
        // 3.根据Document对象获取根元素
        Element rootE = document.getRootElement();
        System.out.println("根元素的名称:" + rootE.getName());// books

        // 4.获取根元素下的所有子元素
        List<Element> list1 = rootE.elements();
        // 5.循环遍历根元素的所有的子元素
        for (Element e1 : list1) {
            System.out.println("根元素的子元素的名称:" + e1.getName());// book book
            System.out.println("根元素的子元素的id属性值:" + e1.attributeValue("id"));// 0001 0002
            // 获取e1元素下的所有子元素
            List<Element> list2 = e1.elements();
            // 循环遍历list2
            for (Element e2 : list2) {
                System.out.println("book下的子元素名:" + e2.getName());// name  author sale
                System.out.println("book下的子元素中的文本:" + e2.getText());// name  author sale

            }
            System.out.println("==================================");

        }

        // 5.获取根元素下的book子元素(就获取第一个)
        Element bookE = rootE.element("book");
        System.out.println(bookE.getName());// book
        System.out.println(bookE.attributeValue("id"));// 0001

        // 6.获取bookE元素下的author子元素的文本
        String text = bookE.elementText("author");
        System.out.println(text);// 张孝祥

    }
}

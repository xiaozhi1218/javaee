package com.itheima.demo2_Dom4J结合XPath解析XML;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 14:44
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Dom4J结合XPath解析XML:
                概述:XPath其实就是一个路径表达式
                XPath使用步骤:
                    1.导入jar包(dom4j和jaxen-1.1-beta-6.jar)
                    2.通过dom4j的SaxReader解析器对象,获取Document对象
                    3.利用Xpath提供的api,结合xpaht的语法完成选取XML文档元素节点进行解析操作。
                document\Element常用的api
                    - document.selectSingleNode("xpath语法");   获得一个节点(标签,元素)
                    - document.selectNodes("xpath语法");      获得多个节点(标签,元素)
                xpath语法路径:
                    1. 绝对路径表达式方式	     例如: /元素/子元素/子子元素...
                        以/开头的路径叫做是绝对路径，绝对路径要从根元素开始写

                    2. 相对路径表达式方式          例如: 子元素/子子元素..  或者 ./子元素/子子元素..
                        相对路径就是相对当前节点元素位置继续查找节点，不以/开头, ../ 表示上一个元素, ./表示当前元素

                    3. 全文搜索路径表达式方式  例如: //子元素, //子元素/子子元素,//子元素//子子元素
                        代表不论中间有多少层,直接获取所有子元素中满足条件的元素

                    4. 谓语（条件筛选）方式      例如: //元素[@attr1=value]

         */
        // 1.创建解析器对象
        SAXReader sr = new SAXReader();

        // 2.使用解析器对象读取xml文件,生成Document对象
        Document document = sr.read("day16\\src\\tianqi.xml");

        // 绝对路径表达式方式
        // 需求:获取深圳的最高温度
        // 3.使用Document对象调用selectSingleNode()方法获取深圳的最高温度标签
        Element e1 = (Element) document.selectSingleNode("/天气预报/深圳/温度/最高温度");
        System.out.println("深圳的最高温度:"+e1.getText());// 36

        // 相对路径表达式方式
        // 需求:获取广州黄浦区的最低温度
        Element e2 = (Element) e1.selectSingleNode("../../../广州/黄浦区/温度/最低温度");
        System.out.println("广州黄浦区的最低温度:"+e2.getText());// 2

        // 全文搜索路径表达式方式
        // 需求:获取整个xml文件中的所有湿度  //湿度
        List<Element> list = document.selectNodes("//湿度");
        for (Element e : list) {
            System.out.println(e.getText());
        }

        // 谓语（条件筛选）方式
        // 需求:获取整个xml文件中所有最高温度标签的level属性值为C
        List<Element> list1 = document.selectNodes("//最高温度[@level='C']");
        for (Element e : list1) {
            System.out.println(e.getName());
            System.out.println(e.getText());
            System.out.println(e.attributeValue("level"));
        }

    }
}

<%@ page import="com.itheima.pojo.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达式中的empty运算符的使用</title>
</head>
<body>
    <%
        //往域对象中存储一个对象
        request.setAttribute("u",null);

        //往域对象中存储一个字符串
        request.setAttribute("str","");

        //往域对象中存储一个集合
        List<String> objects = new ArrayList<>();
        objects.add("hello");
        request.setAttribute("list",objects);
    %>
    域对象中存储的user对象是否为null: ${empty u}<br>
    域对象中存储的字符串str是否为空字符串: ${empty str}<br>
    域对象中存储的集合list的长度是否为0 : ${empty list}
</body>
</html>

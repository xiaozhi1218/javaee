<%@ page import="com.itheima.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用EL表达式获取存储在域对象中的POJO类型的数据</title>
</head>
<body>
    <%
        //往域对象中存储一个user对象
        User user = new User(19, "lucy", "惠州");
        request.setAttribute("u",user);
    %>
    获取存储在域对象中的user的name: ${u.name}
</body>
</html>

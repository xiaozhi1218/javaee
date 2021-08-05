<%@ page import="com.itheima.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/15
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
</head>
<%
    //从session域对象获取user的信息，jsp里面是内置session对象的
    User user = (User) session.getAttribute("user");
%>
<body>
    <h1>欢迎<%=user.getNickname()%>登录...</h1>
</body>
</html>

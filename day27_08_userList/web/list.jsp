<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户展示页面</title>
</head>
<body>
    <table align="center" border="1" cellspacing="0" width="600">
        <tr>
            <th>序号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>地址</th>
            <th>昵称</th>
            <th>性别</th>
            <th>邮箱</th>
        </tr>
        <c:forEach items="${list}" varStatus="vst" var="user">
            <tr>
                <td>${vst.count}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.address}</td>
                <td>${user.nickname}</td>
                <td>${user.gender}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

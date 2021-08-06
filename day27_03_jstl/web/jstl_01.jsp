<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>使用jstl的if标签进行判断</title>
</head>
<body>
    <%--
        jstl的使用步骤:
            1. 导入jar包
            2. 在要使用jstl的那个jsp页面中，使用taglib指令引入核心标签库
            3. 使用jstl的标签
    --%>
    <%
        //往域对象中存储一个值
        request.setAttribute("age",26);
    %>
    <%--
        目标: 判断存储在域对象中的age，根据age的不同，显示不同的页面
        if标签有一个必须的属性: test里边填写判断表达式
        其他属性(了解):
            1. var: 将判断结果存储到域对象中的key
            2. scope: 存储判断结果的域对象,默认是page表示只能在当前页面使用
    --%>
    <c:if test="${age >= 18}" var="flag" scope="page">
        已成年，可以浏览
    </c:if>

    ${flag}

    <c:if test="${age < 18}">
        未成年，请速速离开
    </c:if>
</body>
</html>

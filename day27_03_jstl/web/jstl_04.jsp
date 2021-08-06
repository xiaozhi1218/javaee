<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用forEach标签遍历集合中的数据</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        request.setAttribute("list", list);
    %>
    <%--
        取出域对象中的集合，并且遍历出每一个数据，然后进行展示
            1. begin 开始遍历的下标，如果是进行遍历则可以不写，默认是
            2. end 结束遍历的下标，如果是进行遍历则可以不写，默认是遍历到最后一个
            3. step 步长，默认是1
            4. var 将遍历结果存储到域对象时候的key
            5. items 要遍历的数据
    --%>
    <c:forEach items="${list}" var="name">
        ${name}<br/>
    </c:forEach>
</body>
</html>

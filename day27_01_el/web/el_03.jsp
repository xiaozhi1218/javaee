<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取存储在域对象中的List类型的元素</title>
</head>
<body>
    <%
        //往域对象中存储一个List
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        request.setAttribute("list", list);
    %>
    <%--
        在el中，只要是根据下标获取元素，我们都可以使用[index]
    --%>
    获取存储在域对象中的集合list中的第四个元素:${list[3]}
</body>
</html>

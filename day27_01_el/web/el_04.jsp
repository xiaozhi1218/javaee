<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/16
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用el表达式获取存储在域对象中的Map类型的数据</title>
</head>
<body>
    <%
        //往域对象中存储一个map
        Map<String,String> map = new HashMap<String,String>();
        map.put("name", "张三");
        map.put("password", "123456");
        map.put("nickname", "张三丰");

        request.setAttribute("map", map);
    %>
    <%--
        在el表达式中，只要某个属性有对应的get方法，那么我们就可以使用  .属性名来获取其属性值
    --%>
    使用EL表达式获取存储在域对象中的map中的nickname的值:${map.nickname}
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2020/10/15
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp中的java脚本</title>
</head>
<body>
    <%--
        在jsp中是由三种注释:
            1. html的注释
            2. java的注释
            3. jsp自己的注释

         jsp中编写java代码共有三种脚本
            1. <% .... %>这种脚本中编写的java代码，是运行在翻译成的servlet的service方法中的
            2. <%=值%> 向浏览器输出一个java变量的值
            3. <%! %> 这种脚本编写的java代码，是运行在翻译成的servlet的类中，方法外
               所以它里面声明的变量是成员变量
    --%>
    <%
        int num = 10;
        System.out.println("你好世界...");
    %>

    <%
        num ++;
        System.out.println(num);
        String str = "hello";

        i ++;
    %>

    <%!
        private int i = 20;
    %>

    <h1>hello world.....<%=num%></h1>
</body>
</html>

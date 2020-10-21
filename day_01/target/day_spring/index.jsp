<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/10/20
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <a href="/day/day1">开始了</a>--%>

<%--<a href="/demo/de?name=小强">数据传递</a>--%>

<%--将数据封装到 User对象中--%>
<%--    <form action="/demo/demo1" method="post">--%>
<%--        姓名:<input type="text" name="name"></br>--%>
<%--        年龄:<input type="text" name="age"></br>--%>
<%--        金钱:<input type="text" name="mony"></br>--%>
<%--        用户姓名:<input type="text" name="account.uname"></br>--%>
<%--        用户年龄:<input type="text" name="account.age"></br>--%>
<%--        <input type="submit" value="提交">--%>
<%--    </form>--%>


<%--将数据封装到集合中--%>
<%--        <form action="/demo/demo1" method="post">--%>
<%--            姓名:<input type="text" name="name"></br>--%>
<%--            年龄:<input type="text" name="age"></br>--%>
<%--            金钱:<input type="text" name="mony"></br>--%>
<%--            用户姓名:<input type="text" name="list[0].name"></br>--%>
<%--            用户年龄:<input type="text" name="list[0].age"></br>--%>

<%--            用户姓名:<input type="text" name="map['one'].name"></br>--%>
<%--            用户年龄:<input type="text" name="map['one'].age"></br>--%>
<%--            <input type="submit" value="提交">--%>
<%--        </form>--%>

<%--        自定义数据转换--%>
<form action="/demo/demo2" method="post">

    用户姓名:<input type="text" name="uname"></br>
    用户年龄:<input type="text" name="age"></br>
    用户时间<input type="text" name="date"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>

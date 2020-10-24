<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/10/24
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/finAll">开始跳</a>

<form action="/account/insert" method="post">
   姓名: <input type="text" name="name"></br>
    金钱:<input type="text" name="money"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>

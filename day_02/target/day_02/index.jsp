<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/10/21
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery.min.js"></script>

<script>
    $(function () {
        $("#btn").click(function () {
            //调用json
            $.ajax({
                url:"demo/demo2",//请求路径
                contentType:"application/json;charset=UTF-8",//定义发送请求定义格式为json字符串
                data:'{"name":"小强","age":"18","mony":18}',//发送的数据
                dataType:"json",//定义回调响应的数据格式为json字符串
                type:"post",//发送类型
                success:function (data) {
                    alert(data);
                    alert(data.name);
                    alert(data.age);
                    alert(data.mony)
                }
            })
        })
    })
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/demo/demo1">跳转</a>

<button id="btn">按钮玩玩</button>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangdi
  Date: 2021/8/24
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" >
</head>
<body>
<table class="container">
    <thead>
    <tr>
        <th>放映时间</th>
        <th>语言版本</th>
        <th>放映厅</th>
        <th>票价</th>
        <th>选座购票</th>
    </tr>
    </thead>
    <tbody>

        <c:forEach items="${list}" var="play">
        <tr>
        <th>${play.playTime}</th>
        <th>${play.lanType}</th>
        <th>${play.roomId}</th>
        <th>${play.price}</th>
        <th><a href="seat?playId=${play.playId}">点击选购座位</a></th>
        </tr>
        </c:forEach>

    </tbody>
</table>

</body>
</html>

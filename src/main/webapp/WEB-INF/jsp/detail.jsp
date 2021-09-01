<%--
  Created by IntelliJ IDEA.
  User: zhangdi
  Date: 2021/8/20
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${detail.country}
${detail.director}
${detail.film_name}
${detail.img_path}
${detail.length}
${detail.play_time}
${detail.player}
${detail.synopsis}
<strong>
    <a href="play?filmId=${detail.film_id}">点击详情</a>
</strong>
</body>
</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <c:forEach var="film" items="${list}" begin="0" end="1">
            <td>
                <img src="${pageContext.request.contextPath}${film.imgPath}">
                <p>${film.name}</p>
            </td>
        </c:forEach>
    </tr>
</table>
</body>
</html>

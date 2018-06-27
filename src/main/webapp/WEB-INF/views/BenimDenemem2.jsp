<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="eMusicStorfe" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: UlpJuan
  Date: 27.06.2018
  Time: 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<c:forEach items="${kullanicilar}" var="kullanici">

<br><br>
        <td>${kullanici.isim}</td>
        <br><br>
        <td>${kullanici.soyisim}</td>

        <br><br>
        <td>${kullanici.id}</td>
        <br><br>

            <a class="button" href="${pageContext.request.contextPath}/deleteKullanici?Kullaniciid=${kullanici.id}" Sil />

</c:forEach>


</body>
</html>

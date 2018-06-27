<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: UlpJuan
  Date: 27.06.2018
  Time: 01:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="aha" modelAttribute="k">

    İsim <form:input path="isim"></form:input>

    <br><br>
    Soyisim <form:input path="soyisim"></form:input>

    <br><br>


    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>

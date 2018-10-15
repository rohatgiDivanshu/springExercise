<%--
  Created by IntelliJ IDEA.
  User: divanshu
  Date: 15/10/18
  Time: 1:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application Form</title>
</head>
<body>

<h2>${appForm}</h2>

<form action="/springmvc/submitForm.html" method="post">

    FirstName: <input type="text" name="firstName">
    LastName: <input type="text" name="lastName">

    <%--<button type="submit" value="Submit"/>--%>
    <%--<button>submit</button>--%>
    <input type="submit" value="Submit">
</form>

</body>
</html>

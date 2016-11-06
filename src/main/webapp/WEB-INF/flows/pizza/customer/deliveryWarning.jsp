<%--
  Created by IntelliJ IDEA.
  User: Lusai
  Date: 11/6/16
  Time: 10:51 PM
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Pizza</title>
</head>
<body>

    <h2>Delivery Unavailable</h2>

    <p>THe address is outside of your delivery area. The order may still be taken for carry-out.</p>

    <a href="${flowExecutionUrl}&_eventId=accept">Accept</a>
    <a href="${flowExecutionUrl}&_eventId=cancel">Cancel</a>

</body>
</html>

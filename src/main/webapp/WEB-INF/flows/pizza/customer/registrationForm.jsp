<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lusai
  Date: 11/6/16
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Pizza</title>
</head>
<body>

    <h2>Customer Registration</h2>

    <form:form>
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
        <b>Phone number: </b><form:input path="customer.phoneNumber" /><br/>
        <b>Name: </b><form:input path="customer.name"/><br/>
        <b>Address: </b><form:input path="customer.address"/><br/>
        <b>City: </b><form:input path="customer.city"/><br/>
        <b>State: </b><form:input path="customer.state"/><br/>
        <b>Zip Code: </b><form:input path="customer.zipcode"/><br/>
        <input type="submit" name="_eventId_submit" value="Submit" />
        <input type="submit" name="_eventId_cancel" value="Cancel" />
    </form:form>

</body>
</html>

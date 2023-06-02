<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Fill the form</h1>
<%--<form:form method="post" modelAttribute="nameSurname">--%>
<%--    <form:input type="text" id="name" name="name"--%>
<%--                placeholder="Enter name" required="required" path="name"/>--%>
<%--    <form:input type="text" path="surname" required="required"/>--%>
<%--    <button>Submit</button>--%>
<%--</form:form>--%>
<form method="post">
    <label for="name">name</label>
    <input type="text" name="name" id="name">
    <label for="surname">Password</label>
    <input type="text" name="surname" id="surname">
    <input type="submit">
</form>
</body>
</html>

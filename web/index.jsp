<%--
  Created by IntelliJ IDEA.
  User: Arti
  Date: 11/13/2018
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab 6</title>
</head>
<body>
<div class="container">
    <form method="post" action="/support">
        <div class="row">
            <label>Name</label>
            <input type="text" name="name" id="name">
        </div>
        <div class="row">
            <label>Email</label>
            <input type="email" name="email">
        </div>
        <div class="row">
            <label>Problem</label>
            <input type="text" name="problem">
        </div>
        <div class="row">
            <label>Problem Detail:</label>
            <textarea rows="20" cols="70" name="detail"></textarea>
        </div>
        <div class="row">
            <input type="submit" value="Help">
        </div>
    </form>
</div>

</body>
</html>

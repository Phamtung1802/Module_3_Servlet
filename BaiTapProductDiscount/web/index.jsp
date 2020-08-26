<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 26/8/2020
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Discount Calculator</h2>

<form action="result" method="post">
  <input type="text" name="desc" placeholder="Mô tả của sản phẩm: "/>
  <input type="text" name="price" placeholder="Giá niêm yết của sản phẩm: "/>
  <input type="text" name="rebate" placeholder="Tỷ lệ chiết khấu (phần trăm): "/>

  <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page 2</title>
</head>
<body>
<h1>Hello World!!</h1>
<form action="myservlet" >
<label for="example"><span style="color: red;">*</span></label>
<input id ="example" name="username" placeholder="First Number"style=""></input>

<label for="example"><span style="color: red;">*</span></label>
<input id ="example" name="pass"  placeholder="Second Number"required></input>

<button name ="bt1" value="1" >+</button>
<button name ="bt1" value="2" >-</button>
<button name ="bt1" value="3" >*</button>
<button name ="bt1" value="4" >/</button>

</form>
<h1>Ans= <%=request.getParameter("ans") %></h1>
</body>
</html>
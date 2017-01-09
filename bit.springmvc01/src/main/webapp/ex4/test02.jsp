<%@ page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex4</title>
</head>
<body>
<h1>test02</h1>
name: ${student.name}<br>
age : ${student.age}<br>
work : ${student.work}<br>

photoPath1 : ${student.photoPath1}<br>
<img src='${student.photoPath1}'><br>

photoPath2 : ${student.photoPath2}<br>
<img src='${student.photoPath2}'><br>

</body>
</html>







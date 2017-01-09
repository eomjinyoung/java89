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
<h1>test01</h1>
name: ${requestScope.name}<br>
age : ${requestScope.age}<br>
work : ${requestScope.work}<br>

photo1_originFilename : ${requestScope.photo1_originFilename}<br>
photo1_filesize : ${requestScope.photo1_filesize}<br>

photo2_originFilename : ${requestScope.photo2_originFilename}<br>
photo2_filesize : ${requestScope.photo2_filesize}<br>
</body>
</html>







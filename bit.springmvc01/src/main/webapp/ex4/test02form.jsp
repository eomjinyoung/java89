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
<h1>test02폼</h1>
<form action="test02.do" method="post" enctype="multipart/form-data">
이름: <input type="text" name="name"><br>
나이: <input type="number" name="age"><br>
직장: <input type="checkbox" name="work" value="true"> 재직중<br>
사진1: <input type="file" name="photo1"><br>
사진2: <input type="file" name="photo2"><br>
<button>등록</button>
</form>
</body>
</html>















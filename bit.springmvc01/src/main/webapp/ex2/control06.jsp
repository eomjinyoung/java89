<%@ page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex2</title>
</head>
<body>
<h1>Accept 헤더 값 조정하여 서버에 요청하기</h1>
<h2>그냥 요청하기</h2>
<a href="accept.do">그냥 요청</a>

<h2>헤더 붙이기</h2>
<button id="btn1" type="button">application/json 결과 요망</button><br>
<button id="btn2" type="button">text/html 결과 요망</button><br>
<button id="btn3" type="button">text/plain 결과 요망</button><br>

<script>
var tag1 = document.getElementById("btn1");
tag1.onclick = function() {
  var xhr = new XMLHttpRequest();
  xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/accept.do", false);
  xhr.setRequestHeader("Accept", "application/json");
  xhr.send(null); 
  console.log(xhr.responseText);
};

var tag2 = document.getElementById("btn2");
tag2.onclick = function() {
	  var xhr = new XMLHttpRequest();
	  xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/accept.do", false);
	  xhr.setRequestHeader("Accept", "text/html");
	  xhr.send(null); 
	  console.log(xhr.responseText);
};

var tag3 = document.getElementById("btn3");
tag3.onclick = function() {
	  var xhr = new XMLHttpRequest();
    xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/accept.do", false);
    xhr.setRequestHeader("Accept", "text/plain");
    xhr.send(null); 
    console.log(xhr.responseText);
};
</script>



</body>
</html>













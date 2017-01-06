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
<h1>임의의 요청 헤더 붙여 보내기</h1>
<h2>그냥 요청하기</h2>
<a href="header.do">그냥 요청</a>

<h2>헤더 붙이기</h2>
<button id="btn1" type="button">aaa 요청 헤더 붙이기</button><br>
<button id="btn2" type="button">bbb 요청 헤더 붙이기</button><br>
<button id="btn3" type="button">aaa, bbb 요청 헤더 붙이기</button><br>

<script>
var tag1 = document.getElementById("btn1");
tag1.onclick = function() {
  //1) 서버에 요청하는 것을 도와줄 객체 준비
  var xhr = new XMLHttpRequest();
  
  //2) 서버에 연결
  xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/header.do", false);
  
  //3) 서버로 보낼 요청 헤더 추가
  xhr.setRequestHeader("aaa", "okok");
  
  //4) 서버에 요청 
  xhr.send(null); 
  
  //5) 서버가 보낸 응답 내용을 출력
  console.log(xhr.responseText);
};

var tag2 = document.getElementById("btn2");
tag2.onclick = function() {
	  var xhr = new XMLHttpRequest();
	  xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/header.do", false);
	  xhr.setRequestHeader("bbb", "nono");
	  xhr.send(null); 
	  console.log(xhr.responseText);
};

var tag3 = document.getElementById("btn3");
tag3.onclick = function() {
	  var xhr = new XMLHttpRequest();
    xhr.open("get", "http://localhost:8080/bit.springmvc01/ex2/header.do", false);
    xhr.setRequestHeader("bbb", "nono");
    xhr.setRequestHeader("aaa", "okok");
    xhr.send(null); 
    console.log(xhr.responseText);
};
</script>



</body>
</html>













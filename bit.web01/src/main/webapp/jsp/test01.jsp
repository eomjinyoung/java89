<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP의 구동 원리 
1) 컴파일
  JSP 파일 ---> [JSP 엔진] ---> 서블릿 자바 파일 생성
2) 목적
  자바 출력문을 보다 쉽게 만들기 위함.

# 주의!
  - JSP가 바로 실행되는 것은 아니다. 
  - 반드시 JSP 파일을 가지고 자바 소스 파일을 생성하고 컴파일 한 후에 실행된다.

# 자바 소스 파일의 생성 위치
  - 임시 배포 폴더/work/..../xxx.java   
--%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello, world!</h1>
</body>
</html>
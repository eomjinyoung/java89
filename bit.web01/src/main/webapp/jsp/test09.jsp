<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 액션 태그 
=> 특별한 자바 코드를 만드는 JSP 전용 태그.
--%>

<%-- 
1) jsp:include 
=> 다른 서블릿/JSP를 인클루딩 한다.
=> 다음 자바코드와 같다.
RequestDispatcher rd = request.getRequestDispatcher("...");
rd.include(request, response);
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<jsp:include page="test09_2.jsp"></jsp:include>
<h1>test09_2</h1>
<jsp:include page="test09_3.jsp"></jsp:include>
</body>
</html>

<%--
include 지시어
=> 지정한 파일을 JSP에 삽입시키는 일을 한다.

include JSP 태그
=> 실행을 위임하고 해당 JSP의 실행이 끝난 다음에 다시 리턴한다.
 --%>




    
    
    
    
    
    
    
    
    
    
    
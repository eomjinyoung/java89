<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 액션 태그 
=> 특별한 자바 코드를 만드는 JSP 전용 태그.
--%>

<%-- 
1) jsp:forward 
=> 다른 서블릿/JSP로 포워딩 한다.
=> 다음 자바코드와 같다.
RequestDispatcher rd = request.getRequestDispatcher("...");
rd.forward(request, response);
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>test08</h1>
</body>
</html>

<!-- 포워딩은 현재 서블릿/JSP의 출력은 버리고 
     실행을 다른 서블릿/JSP로 위임한다.
     따라서 이 JSP에서 출력한 것은 버려질 것이다. 
     단 이전에 출력한 데이터가 버퍼의 크기(기본 8196바이트)를 초과한다면,
     버퍼의 데이터가 자동으로 클라이언트로 출력되기 때문에
     포워딩은 무시된다.-->
<jsp:forward page="test08_2.jsp"></jsp:forward>





    
    
    
    
    
    
    
    
    
    
    
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 확장 태그(JSP Standard Tag Library; JSTL) 
=> JSP 라이브러리에 기본으로 포함되어 있지 않다.
=> JSTL 규격에 맞추어 개발된 구현체를 별도로 다운로드 받아야 한다.
   build.gradle 파일에 JSTL 라이브러리 포함
=> JSP 페이지에서 이 라이브러리를 사용하려면
   taglib 지시어를 이용하여 임포트해야 한다.
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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




    
    
    
    
    
    
    
    
    
    
    
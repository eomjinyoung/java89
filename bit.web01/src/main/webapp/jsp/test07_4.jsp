<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    trimDirectiveWhitespaces="true"%>

<%-- HttpSession에 저장된 객체를 꺼내자! --%>

<%
ArrayList originList = new ArrayList();
originList.add("오호라...");
session.setAttribute("list", originList);
%>

<jsp:useBean id="list" class="java.util.ArrayList" scope="session"/>

<%-- 자바 코드 
ArrayList list = (ArrayList)session.getAttribute("list");
if (list == null) {
  list = new ArrayList();
  session.setAttribute("list", list);
}
--%>

<% 
// 기존의 ArrayList 객체를 사용하기 때문에 다음 값을 1번 방에 들어간다. 
list.add("okok"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>test07_4</h1>
<%
// 정말 기존에 보관된 ArrayList 객체가 맞는지 확인해보자!
%>
<%=list.get(0)%><br>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
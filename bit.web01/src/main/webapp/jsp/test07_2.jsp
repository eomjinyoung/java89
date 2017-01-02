<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    trimDirectiveWhitespaces="true"%>

<%-- pageContext에 해당 이름으로 객체가 저장된 경우를 확인해보자! --%>

<%
ArrayList originList = new ArrayList();
originList.add("오호라...");
pageContext.setAttribute("list", originList);
%>

<jsp:useBean id="list" class="java.util.ArrayList"/>

<%-- 자바 코드 
ArrayList list = (ArrayList)pageContext.getAttribute("list");
if (list == null) {
  list = new ArrayList();
  pageContext.setAttribute("list", list);
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
<h1>test07_2</h1>
<%
// 정말 기존에 보관된 ArrayList 객체가 맞는지 확인해보자!
%>
<%=list.get(0)%><br>
<%=list.get(1)%><br>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    trimDirectiveWhitespaces="true"%>

<%-- class 속성을 생략한다면?
=> 변수를 생성할 때 사용할 타입 정보는 설정해야 한다.
   즉 type 속성의 값을 생략할 수 없다.
보관소에 저장된 객체가 없다면 예외 발생!
 --%>

<%
ArrayList originList = new ArrayList();
originList.add("오호라...");
application.setAttribute("list", originList);
%>

<jsp:useBean id="list" type="java.util.ArrayList"/>

<%-- 자바 코드 
ArrayList list = (ArrayList)pageContext.getAttribute("list");
if (list == null) {
  // class 속성의 값을 지정하지 않으면 객체를 만들지 않고 예외를 발생시킨다.
  throw new Exception("list라는 이름의 객체를 찾을 수 없다!");
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
<h1>test07_6</h1>
<%
// 정말 기존에 보관된 ArrayList 객체가 맞는지 확인해보자!
%>
<%=list.get(0)%><br>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
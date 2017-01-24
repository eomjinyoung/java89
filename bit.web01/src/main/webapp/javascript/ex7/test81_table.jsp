<%@page import="bitcamp.domain.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
ArrayList<Student> list = new ArrayList<>();
list.add(new Student("홍길동", "user01@test.com", "1111-1111", true));
list.add(new Student("홍길동2", "user02@test.com", "1111-1112", false));
list.add(new Student("홍길동3", "user03@test.com", "1111-1113", true));
list.add(new Student("홍길동4", "user04@test.com", "1111-1114", false));
list.add(new Student("홍길동5", "user05@test.com", "1111-1115", true));
pageContext.setAttribute("list", list);
%>
<table border='1'>
<tr>
  <th>이름</th>
  <th>이메일</th>
  <th>전화</th>
  <th>재직여부</th>
</tr>
<c:forEach items="${list}" var="student">
<tr>
  <td>${student.name}</td>
  <td>${student.email}</td>
  <td>${student.tel}</td>
  <td>${student.working}</td>
</tr>
</c:forEach>
</table>    

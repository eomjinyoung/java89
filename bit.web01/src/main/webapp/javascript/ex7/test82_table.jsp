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
// 자바스크립트가 이해할 수 있는 형식으로 데이터를 가공하여 보낸다.
// => 어떤 형식인데?
//    - JavaScript Object Notation 형식!
// => 아하! 중괄호 쓰는 거?
//    - 맞다. 근데 약간 형식에 제약이 있다.
//    - 문자열은 반드시 큰 따옴표로 표시해야 하고,
//    - 프로퍼티 이름은 반드시 문자열로 표기해야 한다.
// => 좀 더 정확한 자료는 어디에?
//    - www.json.org 사이트에 가보라!
%>
[
<c:forEach items="${list}" var="student">
{
  "name": "${student.name}",
  "email": "${student.email}",
  "tel": "${student.tel}",
  "working": "${student.working}"
},
</c:forEach>
{}
]






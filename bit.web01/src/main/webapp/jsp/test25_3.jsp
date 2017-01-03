<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:forEach 태그
=> 반복문 자바 코드를 생성한다.
=> 주요 속성
items : 배열, java.util.Colleciton 구현체, java.util.Iterator 구현체,
        java.util.Enumeration 구현체, java.util.Map 구현체, 
        콤마(,)로 구분된 문자열
var : 목록에서 한 개 꺼낸 객체를 가리키는 변수명
begin : 시작 인덱스
end : 끝 인덱스
--%>

<%-- java.util.Collection 구현체 중의 하나인 ArrayList 객체를 반복하기 --%>
<%
ArrayList<String> names = new ArrayList<>();
names.add("빅뱅");
names.add("아이유");
names.add("트와이스");
names.add("EXID");
names.add("마마무");
names.add("방탄소년단");
pageContext.setAttribute("names", names);
%>
<c:forEach var="name" items="${names}">
${name},
</c:forEach>
    
    
    
    
    
    
    
    
    
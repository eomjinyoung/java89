<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:forTokens 태그
=> 문자열을 특정 구분자로 잘라서 반복할 때 사용
=> 주요 속성
items : 특정 문자로 구분된 문자열
var : 목록에서 한 개 꺼낸 객체를 가리키는 변수명
delims : 문자열을 자를 때 사용할 구분자
--%>
<% pageContext.setAttribute("names", "홍길동;임꺽정;유관순;안중근;윤봉길");%>
<c:forTokens items="${names}" var="name" delims=";">
${name},
</c:forTokens>


    
    
    
    
    
    
    
    
    
    
    
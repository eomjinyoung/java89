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

<c:forEach var="i" begin="10" end="19">
${i}: 홍길동,
</c:forEach>


    
    
    
    
    
    
    
    
    
    
    
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:if 태그
=> 조건이 참이면 내용(시작태그와 끝태그 사이에 있는 것) 부분을 실행한다.
 --%>

<c:set var="name" value="홍길동"/> 

<c:if test="${name != null}">name이 있다</c:if>,
<c:if test="${not empty name}">name이 있다</c:if>,
<c:if test="${!empty name}">name이 있다</c:if>,
<c:if test="${empty name2}">name2가 없다</c:if>
----------------------------------------------
<%-- 실행 결과를 보관소에 저장할 수 있다 --%>
<c:if test="${name != null}" var="result1" scope="page"/>
<c:if test="${name2 != null}" var="result2" scope="page"/>

result1: ${pageScope.result1},
result2: ${pageScope.result2},







    
    
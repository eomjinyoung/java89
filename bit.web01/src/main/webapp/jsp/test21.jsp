<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:set 태그
=> 보관소에 저장할 변수 선언
=> 주요 속성
var : 변수명
value : 값
scope : 값을 저장할 보관소. 기본이 PageContext이다.
        page | request | session | application
 --%>

<c:set var="name" value="홍길동"/>    

${pageScope.name},
${requestScope.name},
${sessionScope.name},
${applicationScope.name},
----------------------------------------
<c:set var="name2" scope="request">임꺽정</c:set>    
${pageScope.name2},
${requestScope.name2},
${sessionScope.name2},
${applicationScope.name2},
    
    
    
    
    
    
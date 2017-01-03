<%@page import="java.util.Date"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%-- fmt:parseDate 태그
=> 특정 형식을 갖는 문자열을 Date 객체로 변환한다.
=> 주요 속성 
value : 날짜를 표현한 문자열
pattern : 문자열의 형식
var : 변환된 Date 객체를 보관소에 저장할 때 사용할 이름
scope : 저장할 보관소. 기본은 PageContext이다. 
--%>

<fmt:parseDate value="${param.date}" pattern="yyyy-MM-dd" var="date"/>
${pageScope.date}















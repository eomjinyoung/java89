<%@page import="java.util.Date"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%-- fmt:formatDate 태그
=> Date 객체를 특정 형식의 문자열로 변환한다.
=> 주요 속성 
value : Date 객체
pattern : 변환한 형식
--%>

<% pageContext.setAttribute("today", new Date()); %>
특정 형식으로 가공하기 전: ${today}
특정 형식으로 가공한 후: <fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/>
















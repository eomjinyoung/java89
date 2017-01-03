<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:choose 태그
=> 자바의 switch 처럼 동작한다.
 --%>

<c:choose>
  <c:when test="${param.age < 8}">유아</c:when>
  <c:when test="${param.age >= 8 && param.age < 14}">어린이</c:when>
  <c:when test="${param.age >= 14 && param.age < 20}">청소년</c:when>
  <c:when test="${param.age >= 20 && param.age < 40}">청년</c:when>
  <c:when test="${param.age >= 40 && param.age < 60}">중년</c:when>
  <c:when test="${param.age >= 60}">노인</c:when>
  <c:otherwise>나이 데이터를 보내세요</c:otherwise>
</c:choose>

    
    
    
    
    
    
    
    
    
    
    
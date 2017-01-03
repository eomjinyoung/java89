<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:redirect 태그
=> response.sendRedirect() 메서드를 호출한다.
=> 주요 속성 
url : 리다이렉트 url
--%>

<c:choose>
  <c:when test="${param.code == 'G'}">
    <c:redirect url="http://www.google.com"/>
  </c:when>
  <c:when test="${param.code == 'D'}">
    <c:redirect url="http://www.daum.net"/>
  </c:when>
  <c:otherwise>
    코드가 옳지 않습니다.
  </c:otherwise>
</c:choose>










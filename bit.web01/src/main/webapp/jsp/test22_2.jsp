<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:remove 태그의 삭제 동작 확인 --%>

<c:set var="name" value="홍길동"/> 
<c:set var="name" value="임꺽정" scope="request"/> 
<c:set var="name" value="유관순" scope="session"/> 
<c:set var="name" value="안중근" scope="application"/>    

${pageScope.name}, ${requestScope.name}, ${sessionScope.name}, ${applicationScope.name}
----------------------------------------

<%-- 특정 보관소의 값만 제거하고 싶다면, 명확히 보관소를 지정하라! --%>
<c:remove var="name" scope="request"/>

${pageScope.name}, ${requestScope.name}, ${sessionScope.name}, ${applicationScope.name}
----------------------------------------

<%-- 만약 scope을 지정하지 않는다면 모든 보관소를 뒤져 해당 이름으로 저장된 값을 제거한다. --%>
<c:remove var="name"/>

${pageScope.name}, ${requestScope.name}, ${sessionScope.name}, ${applicationScope.name}
----------------------------------------




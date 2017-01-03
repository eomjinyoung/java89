<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:remove 태그
=> 보관소에 저장된 값 제거하기
=> 주요 속성
var : 변수명
scope : 값이 저장된 보관소. 기본이 PageContext이다.
        page | request | session | application
 --%>

<c:set var="name1" value="홍길동"/> 
<c:set var="name2" value="임꺽정" scope="request"/> 
<c:set var="name3" value="유관순" scope="session"/> 
<c:set var="name4" value="안중근" scope="application"/>    

${name1}, ${name2}, ${name3}, ${name4}
----------------------------------------

<c:remove var="name1"/>
${name1}, ${name2}, ${name3}, ${name4}
----------------------------------------

<%-- scope을 지정하지 않으면, 
모든 보관소를 뒤져서 해당 이름으로 저장된 값을 찾아 제거한다. --%>
<c:remove var="name2"/> 
${name1}, ${name2}, ${name3}, ${name4}
----------------------------------------    

<c:remove var="name3"/> 
${name1}, ${name2}, ${name3}, ${name4}
----------------------------------------
    
<c:remove var="name4"/> 
${name1}, ${name2}, ${name3}, ${name4}
----------------------------------------
    
    
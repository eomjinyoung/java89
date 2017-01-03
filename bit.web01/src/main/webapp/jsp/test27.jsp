<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:url 태그
=> URL을 문자열을 만든다.
=> 주요 속성 
var : 만든 URL을 저장할 때 사용할 이름
value : 저장할 URL 값
scope : 만든 URL을 저장할 보관소. 기본은 PageContext이다.
        page | request | session | application
=> c:param 태그와 함께 사용한다.
name : 파라미터 명
value : 파라미터 값
--%>
<c:url var="googleurl" value="https://www.google.co.kr/webhp" >
  <c:param name="hl" value="ko"/>
  <c:param name="sa" value="X"/>
  <c:param name="ved" value="0ahUKEwiFgI2ToqXRAhWGNpQKHXxTAjcQPAgD#hl=ko"/>
  <c:param name="q" value="surface+studio"/>
</c:url>
${googleurl}












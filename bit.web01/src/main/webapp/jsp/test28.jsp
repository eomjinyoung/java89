<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:import 태그
=> URL로 지정한 서버에 요청하여 그 응답 결과를 리턴한다.
=> 주요 속성 
var : 서버로부터 받은 응답 결과를 저장할 때 사용할 이름
scope : 응답 결과를 저장할 보관소. 기본은 PageContext이다.
        page | request | session | application
url : 서버에 요청할 url
=> 만약 var 속성을 지정하지 않는다면,
   이 태그가 사용된 자리에 그대로 서버의 응답 결과를 출력한다.
--%>
<c:url var="googleurl" value="https://www.google.co.kr/webhp" >
  <c:param name="hl" value="ko"/>
  <c:param name="sa" value="X"/>
  <c:param name="ved" value="0ahUKEwiFgI2ToqXRAhWGNpQKHXxTAjcQPAgD#hl=ko"/>
  <c:param name="q" value="surface+studio"/>
</c:url>
----------------------------------------------------------------------
<c:import url="${googleurl}"/>
----------------------------------------------------------------------











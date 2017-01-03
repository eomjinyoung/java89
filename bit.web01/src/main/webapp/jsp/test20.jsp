<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 확장 태그(JSP Standard Tag Library; JSTL) 
=> JSP 라이브러리에 기본으로 포함되어 있지 않다.
=> JSTL 규격에 맞추어 개발된 구현체를 별도로 다운로드 받아야 한다.
   build.gradle 파일에 JSTL 라이브러리 포함
=> JSP 페이지에서 이 라이브러리를 사용하려면
   taglib 지시어를 이용하여 임포트해야 한다.
   <%@ taglib uri="JSTL 라이브러리 네임스페이스" prefix="별명" %> 
=> JSTL 라이브러리와 네임스페이스
1) Core(c): http://java.sun.com/jsp/jstl/core
   - 변수 다루기, 흐름 제어, URL 다루기, 기타
2) XML(x): http://java.sun.com/jsp/jstl/xml
   - XML 태그 다루기, 변환 기능 
3) Internationalization(fmt): http://java.sun.com/jsp/jstl/fmt
   - 로케일 메시지 다루기, 숫자 및 날짜 형식 바꾸기
4) SQL(sql): http://java.sun.com/jsp/jstl/sql
   - DBMS를 사용하는 태그
5) Functions(fn): http://java.sun.com/jsp/jstl/functions
   - 컬렉션과 문자열 다루는 태그
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- c:out 태그
=> 출력문을 만드는 태그이다.
=> value : 출력할 값
=> default : value 속성의 값이 null일 때 사용된다.
 --%>

<c:out value="홍길동" default="오호라"/>,
<c:out value="홍길동">오호라</c:out>,
<c:out value="${name}">오호라</c:out>

    
    
    
    
    
    
    
    
    
    
    
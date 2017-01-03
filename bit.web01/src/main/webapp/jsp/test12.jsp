<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- List 에서 값을 꺼내는 방법 --%>
<% 
List<String> names = new ArrayList<>();
names.add("홍길동");
names.add("임꺽정");
names.add("유관순");
names.add("안중근");
names.add("윤봉길");
pageContext.setAttribute("names", names); 
%>

<%-- PageContext에서 값을 꺼내는 방법 
=> pageScore 은 EL에서 사용하기 위해 내장된 객체이다. PageContext 객체를 가리킨다.
=> pageContext.getAttribute("이름") => ${pageScope.이름}
--%>
${pageScope.scores[0]},    
${pageScope.scores[1]},
${pageScope.scores[2]},
${pageScope.scores[3]},
${pageScope.scores[4]}    
    
    
    
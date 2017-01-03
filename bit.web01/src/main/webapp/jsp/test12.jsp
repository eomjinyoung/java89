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

<%-- 값을 꺼내는 것은 배열과 같다. --%>
${names[0]},    
${names[1]},
${names[2]},
${names[3]},
${names[4]}    
    
    
    
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- Map 에서 값을 꺼내는 방법 --%>
<% 
Map<String,String> names = new HashMap<>();
names.put("s01", "홍길동");
names.put("s02", "임꺽정");
names.put("s03", "유관순");
names.put("s0 4", "안중근");
names.put("s0 $.$;", "윤봉길");
pageContext.setAttribute("names", names); 
%>

${names.s01},    
${names["s02"]},
${names['s03']},
${names["s0 4"]},
${names['s0 $.$;']}    
    
    
    
    
    
    
    
    
    
    
    
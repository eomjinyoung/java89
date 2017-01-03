<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 배열에서 값을 꺼내는 방법 
=> EL은 로컬 변수를 사용할 수 없다.
=> 반드시 저장소에 보관되어 있어야 한다.
--%>
<% session.setAttribute("scores3", new int[]{100, 90, 80, 70, 60}); %>

<%-- HttpSession에서 값을 꺼내는 방법 
=> sessionScope 내장 객체를 사용하라!
=> session.getAttribute("이름") => ${sessionScope.이름}
--%>
${sessionScope.scores3[0]},    
${sessionScope.scores3[1]},
${sessionScope.scores3[2]},
${sessionScope.scores3[3]},
${sessionScope.scores3[4]}    
    
    
    
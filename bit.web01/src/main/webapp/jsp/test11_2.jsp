<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 배열에서 값을 꺼내는 방법 
=> EL은 로컬 변수를 사용할 수 없다.
=> 반드시 저장소에 보관되어 있어야 한다.
--%>
<% request.setAttribute("scores2", new int[]{100, 90, 80, 70, 60}); %>

<%-- ServletRequest에서 값을 꺼내는 방법 
=> requestScope 내장 객체를 사용하라!
=> request.getAttribute("이름") => ${requestScope.이름}
--%>
${requestScope.scores2[0]},    
${requestScope.scores2[1]},
${requestScope.scores2[2]},
${requestScope.scores2[3]},
${requestScope.scores2[4]}    
    
    
    
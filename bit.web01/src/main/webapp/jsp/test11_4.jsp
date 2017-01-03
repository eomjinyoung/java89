<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 배열에서 값을 꺼내는 방법 
=> EL은 로컬 변수를 사용할 수 없다.
=> 반드시 저장소에 보관되어 있어야 한다.
--%>
<% application.setAttribute("scores4", new int[]{100, 90, 80, 70, 60}); %>

<%-- ServletContext에서 값을 꺼내는 방법 
=> applicationScope 내장 객체를 사용하라!
=> application.getAttribute("이름") => ${applicationScope.이름}
--%>
${applicationScope.scores4[0]},    
${applicationScope.scores4[1]},
${applicationScope.scores4[2]},
${applicationScope.scores4[3]},
${applicationScope.scores4[4]}    
    
    
    
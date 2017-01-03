<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 배열에서 값을 꺼내는 방법 
=> EL은 로컬 변수를 사용할 수 없다.
=> 반드시 저장소에 보관되어 있어야 한다.
--%>
<% pageContext.setAttribute("scores", new int[]{100, 90, 80, 70, 60}); %>

<%-- PageContext에서 값을 꺼내는 방법 
=> pageScore 은 EL에서 사용하기 위해 내장된 객체이다. PageContext 객체를 가리킨다.
=> pageContext.getAttribute("이름") => ${pageScope.이름}
--%>
${pageScope.scores[0]},    
${pageScope.scores[1]},
${pageScope.scores[2]},
${pageScope.scores[3]},
${pageScope.scores[4]}    
    
    
    
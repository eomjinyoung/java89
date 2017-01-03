<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 배열에서 값을 꺼내는 방법 
=> EL은 로컬 변수를 사용할 수 없다.
=> 반드시 저장소에 보관되어 있어야 한다.
--%>
<% 
pageContext.setAttribute("scores5", new int[]{100, 100, 100, 100, 100});
request.setAttribute("scores5", new int[]{90, 90, 90, 90, 90});
session.setAttribute("scores5", new int[]{80, 80, 80, 80, 80});
application.setAttribute("scores5", new int[]{70, 70, 70, 70, 70}); 
%>

<%-- 만약 어느 저장소인지 지정하지 않는다면, 다음 순서로 찾는다.
PageContext ==> ServletRequest ==> HttpSession ==> ServletContext
--%>
${scores5[0]},    
${scores5[1]},
${scores5[2]},
${scores5[3]},
${scores5[4]}    
    
    
    
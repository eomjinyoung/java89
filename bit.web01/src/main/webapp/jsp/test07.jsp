<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 액션 태그 
=> 특별한 자바 코드를 만드는 JSP 전용 태그.
--%>

<%-- 
1) jsp:useBean 
=> JSP에서 특별히 제공하는 태그이기 때문에 "jsp" 네임스페이스를 따로 임포트할 필요는 없다.
=> scope 속성에 지정된 저장소에서 해당 이름으로 객체를 찾아 사용한다.
   만약 해당 이름으로 저장된 객체가 없다면,
   새로 자바 객체를 만들고 scope 속성에 지정된 저장소에 보관한다.
=> 주요 속성
scope : 객체를 찾거나 및 생성한 객체를 저장할 보관소를 지정한다.
        page        => PageContext  (기본 값)
        request     => ServletRequest
        session     => HttpSession
        application => ServletContext        

id    : 객체를 찾거나 저장할 때 사용할 이름.

class : 생성할 객체의 클래스를 지정하는 속성이다.
        패키지명을 포함한 클래스 이름을 지정하라.
        
type  : 변수의 타입을 지정하는 속성이다.
        이 속성을 지정하지 않으면 class 속성의 값이 사용된다.
        임포트 했다면 클래스명만 지정해도 된다.
        만약 임포트를 하지 않았다면, 패키지명까지 지정해야 한다.

--%>

<jsp:useBean id="list" class="java.util.ArrayList"/>

<%-- 자바 코드 
ArrayList list = (ArrayList)pageContext.getAttribute("list");
if (list == null) {
  list = new ArrayList();
  pageContext.setAttribute("list", list);
}
--%>

<% 
// PageContext 보관소에서 "list"라는 이름의 객체를 찾는다. 
// 없기 때문에 새로 생성할 것이다.
list.add("okok"); // 새로 생성된 ArrayList 객체에 값을 추가한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>test07</h1>
<%
// 정말 새로 만든 ArrayList 객체가 PageContext에 저장되었는지 확인해보자!
ArrayList list2 = (ArrayList)pageContext.getAttribute("list"); //꺼내본다.
%>
<%=list2.get(0)%><br>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
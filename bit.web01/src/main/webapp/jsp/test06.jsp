<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    trimDirectiveWhitespaces="true"%>
<%-- JSP 빌트인 객체 
=> JSP 페이지 안에서 사용할 수 있는 객체
=> _jspService() 메서드에 선언된 로컬 변수를 말한다.
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>test06</h1>
<%
//1) HttpServletRequest 객체 사용 가능
//=> _jspService() 메서드의 파라미터이다.
//=> 변수명은 JSP 규약에 정해져 있다.
request.getParameter("ok");

//2) HttpServletResponse 객체 사용 가능
//=> _jspService() 메서드의 파라미터이다.
//=> 변수명은 JSP 규약에 정해져 있다.
response.setHeader("okok", "haha");

//3) PageContext 객체 사용 가능
//=> 변수명은 JSP 규약에 정해져 있다.
pageContext.setAttribute("okok", "value...");

//4) HttpSession 객체 사용 가능
//=> 변수명은 JSP 규약에 정해져 있다.
session.setAttribute("user", "홍길동");

//5) ServletContext 객체 사용 가능
//=> 변수명은 JSP 규약에 정해져 있다.
application.setAttribute("haha", "value..");

//6) ServletConfig 객체 사용 가능
//=> 변수명은 JSP 규약에 정해져 있다.
String charset = config.getInitParameter("charset");

//7) JspWriter 객체 사용 가능
//=> 출력할 때 사용하는 스트림 객체. PrintWriter와 사용법이 유사!
//=> 변수명은 JSP 규약에 정해져 있다.
out.println("<p>okok</p>");
out.write("<p>haha</p>");

//8) Servlet 객체 자신을 가리키는 인스턴스 변수
//=> 변수명은 JSP 규약에 정해져 있다.
Object servletInstance = page;

//9) Throwable 객체 사용 가능
//=> 단 JSP 페이지가 error를 처리하는 페이지로 설정되었을 때만 이 변수가 존재한다.
//=> 설정하는 방법: <%@ page isErrorPage="true" ... 
//=> 변수명은 JSP 규약에 정해져 있다.
out.println(exception);

%>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
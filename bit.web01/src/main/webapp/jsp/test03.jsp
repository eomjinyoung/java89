<%-- JSP의 구성 요소--%>
<%-- 
6) 지시어(Directive element)
  - 각 속성은 특정 자바 코드로 바뀐다.
--%>

<%-- page 지시어
=> JSP 페이지를 제어하는 자바 코드를 생성한다.
lang    
- 스크립팅으로 사용할 언어를 지정한다. 기본이 java이고, 현재는 다른 언어 불가!
- 향후 자바가 아닌 다른 언어를 사용할 것을 대비해서 만든 속성이다.

contentType
- 페이지를 출력할 때 그 형식과 문자 집합 지정
- 결국 response.setContentType() 메서드를 생성한다.

pageEncoding
- JSP 파일의 문자 집합 지정.
- JSP 엔진에게 전달하는 정보이다. 즉 JSP 파일이 어떤 문자집합으로 인코딩 되었는지 알린다.

trimDirectiveWhitespaces 
- 지시어 태그 뒤에 붙은 공백이나 탭, 줄 바꿈 코드를 제거한다.

import 
- JSP 페이지에서 사용할 자바 클래스의 패키지 정보를 임포트한다.
- 결국 import 문장을 생성한다. 
--%>
<%@ page import="java.util.Map"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    import="java.util.ArrayList,java.net.Socket,java.sql.Date"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.HashSet,java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test03</title>
</head>
<body>
<h1>test03</h1>
</body>
</html>






    
    
    
    
    
    
    
    
    
    
    
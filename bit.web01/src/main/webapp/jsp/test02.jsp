<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- JSP의 구성 요소--%>
<%-- 
1) 주석
  - 이 부분이 JSP 주석이다.
  - 자바 소스 코드를 생성할 때 제거된다.
--%>
<!-- 이거 그냥 텍스트이다. 주석아니다. 
물론 웹 브라우저에서는 주석으로 간주하겠지만,
JSP 엔진이 볼 때는 그냥 클라이언트에게 출력해야 할 텍스트일 뿐이다. -->

<%-- 
2) 템플릿 데이터 
  - 그냥 작성하는 모든 텍스트
  - 템플릿 데이터를 가지고 자바 출력문을 생성한다.
    
--%>
그냥 이렇게 작성하는 모든 텍스트...

그냥 텍스트..

모두 그대로 출력문으로 바뀐다.


<%-- 
3) 스크립트릿(scriptlet)
  - 자바 파일의 _jspService() 메서드 안에 그대로 복사된다.
  - 현재는 자바언어만 지원한다.
  - 자바의 일부 코드 조각이라는 의미에서 script + let(작은) = scriptlet 이라 부른다.
--%>
<%
int a = 10;
%>
중간에 출력 한 번 하고
<%
int sum = a * 100;
%>

<%--
4) 표현식(expression element)
  - 실행 결과를 리턴하는 자바 코드를 출력문으로 바꾼다.
    즉 실행 결과가 있는 자바 코드를 보통 "expression(표현식)"이라 부른다.
  - 예) <%= 자바코드 %> ===> out.print(자바코드);
  - print() 메서드의 파라미터 값으로 전달되어야 하기 때문에
    반드시 그 자바코드는 리턴 값이 있어야 한다.
--%>
합계 = <%= sum > 1000 ? "크다" : "작거나 같다" %>
 
<%--
5) 선언문(Declaration element)
  - _jspService() 메서드가 아닌 클래스 블록 안에 복사됨.
  - 보통 멤버 변수나 메서드를 선언할 때 사용
  - 어차피 클래스 블록 안에 놓이기 때문에 이 태그의 선언 위치는 상관없다.
 --%>
<%! 
int v1;
static int v2;
public int v3;
public static int v4;
public void m() {}

%>
 
 
 











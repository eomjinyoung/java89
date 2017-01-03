<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%-- EL(Expression Language)
=> JSP와 JSTL 태그와 함께 사용하는 특별한 문법
=> 객체를 OGNL(Object Graph Navigation Language) 방식으로 다룬다.
   예) 객체명.속성명.속성명.속성명 
   꼭 파일의 경로를 지정하듯이 그 객체 안에 포함된 다른 객체의 속성 값을 
   쉬운 표기법으로 다룰 수 있다.
=> 기본 문법
   ${객체명.속성명}
   ${객체명["속성명"]}
   ${객체명['속성명']}
   
--%>

<%-- EL에서 값을 표현하는 방법: Literals --%>
문자열: ${"ABC가각간"}
문자열: ${'ABC가각간'}
정수: ${20}
부동소수점: ${3.14}
논리값: ${true}
null: ${null}    
    
    
    
    
    
    
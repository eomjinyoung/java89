<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- EL에서 사용 가능한 연산자 --%>
산술 연산자
--------------------------------------
10 + 20 = ${10 + 20}
10 - 20 = ${10 - 20}
10 * 20 = ${10 * 20}
10 / 20 = ${10 / 20}
10 div 20 = ${10 div 20}
10 % 20 = ${10 % 20}
10 mod 20 = ${10 mod 20}    
    
논리 연산자
--------------------------------------
true && false = ${true && false}
true and false = ${true and false}
true || false = ${true || false}
true or false = ${true or false}
!true = ${!true}
not true = ${not true}
    
비교 연산자
--------------------------------------
10 == 11 = ${10 == 11}
10 eq 11 = ${10 eq 11}
10 != 11 = ${10 != 11}
10 ne 11 = ${10 ne 11}
10 < 11 = ${10 < 11}
10 lt 11 = ${10 lt 11}
10 > 11 = ${10 > 11}
10 gt 11 = ${10 gt 11}
10 <= 11 = ${10 <= 11}
10 le 11 = ${10 le 11}
10 >= 11 = ${10 >= 11}
10 ge 11 = ${10 ge 11}

empty 연산자
--------------------------------------
<% pageContext.setAttribute("name", "홍길동"); %>
empty name = ${empty name}
empty name2 = ${empty name2} 

조건 연산자
--------------------------------------
10 > 20 ? "크다" : "작거나 같다" = ${10 > 20 ? "크다" : "작거나 같다"}




    
    
    
    
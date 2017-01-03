<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- EL에서 기본으로 제공하는 객체 --%>
pageContext: ${pageContext},
----------------------------------------------
servletContext.객체명 : ${pageContext.servletContext},
----------------------------------------------
session.객체명 : ${pageContext.session},
----------------------------------------------
request.객체명 : ${pageContext.request},
----------------------------------------------
response.객체명 : ${pageContext.response},
----------------------------------------------
param.파라미터명 : ${param},
----------------------------------------------
paramValues.파라미터명 : ${paramValues},
----------------------------------------------
header.헤더명 : ${header},
----------------------------------------------
headerValues.헤더명 : ${headerValues},
----------------------------------------------
cookie.쿠키명 : ${cookie},
----------------------------------------------
initParam.파라미텅 : ${initParam},
----------------------------------------------
pageScope.이름 : ${pageScope},
----------------------------------------------
requestScope.이름 : ${requestScope},
----------------------------------------------
sessionScope.이름 : ${sessionScope},
----------------------------------------------
applicationScope.이름 : ${applicationScope},







<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<pre>
method:${pageContext.request.method}
header:${header["Content-Type"]}
email:${param.email}
name:${param.name}
age:${param.age}
</pre>
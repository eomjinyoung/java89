<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
HashMap<String,Object> resultMap = new HashMap<>();

if (!ServletFileUpload.isMultipartContent(request)) {
  resultMap.put("status", "failure");
  resultMap.put("params", "멀티파트 형식이 아닙니다.");
  
} else {
	DiskFileItemFactory itemFactory = new DiskFileItemFactory();
	ServletFileUpload uploadHandler = new ServletFileUpload(itemFactory);
	try {
	  List<FileItem> items = uploadHandler.parseRequest(request);
	    
	  int count = 0;
	  ArrayList<Map<String,Object>> data = new ArrayList<>();
	  HashMap<String,Object> objMap = null;
	  
	  for (FileItem item : items) {
	    objMap = new HashMap<>();
	    
	    if (item.isFormField()) {
	      objMap.put("name", item.getFieldName());
	      objMap.put("value", item.getString("UTF-8"));

	    } else { 
	      objMap.put("name", item.getFieldName());
	      objMap.put("filename", item.getName());
	      objMap.put("size", item.getSize());
	      ServletContext sc = this.getServletContext();
	      String realPath = sc.getRealPath("/upload/" + item.getName());
	      item.write(new File(realPath));
	      objMap.put("filepath", realPath);
	    }
	    data.add(objMap);
	  }
	  resultMap.put("status", "success");
	  resultMap.put("params", data);
	  
	} catch (Exception e) {
	  resultMap.put("status", "failure");
	  resultMap.put("params", e.getMessage());
	  e.printStackTrace();
	}
}
out.print(new Gson().toJson(resultMap));
System.out.println("OK!");
%>







/* 주제: Redirect 적용
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet22/add")
public class Servlet22_add extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
      stmt = con.prepareStatement(
          "insert into ex_students(uid,pwd,name,tel,email,work,byear,schl) "
          + " values(?,?,?,?,?,?,?,?)");
      
      stmt.setString(1, request.getParameter("userId"));
      stmt.setString(2, request.getParameter("password"));
      stmt.setString(3, request.getParameter("name"));
      stmt.setString(4, request.getParameter("tel"));
      stmt.setString(5, request.getParameter("email"));
      stmt.setString(6, request.getParameter("working"));
      stmt.setInt(7, Integer.parseInt(request.getParameter("birthYear")));
      stmt.setString(8, request.getParameter("school"));
      
      stmt.executeUpdate();
      
      // 등록한 후 목록 페이지로 가도록 응답한다.
      // 현재 경로    => http://localhost:8080/web01/servlet/servlet22/add
      // 이동할 경로  => http://localhost:8080/web01/servlet/servlet22/list
      ((HttpServletResponse)response).sendRedirect("list");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
}









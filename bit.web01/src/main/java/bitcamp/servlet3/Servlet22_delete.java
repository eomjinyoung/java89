/* 주제: Refresh 추가
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet22/delete")
public class Servlet22_delete extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    // 응답 내용을 출력한 1초 후에 목록 페이지로 이동할 것을 첨부한다.
    // 현재 경로    => http://localhost:8080/web01/servlet/servlet22/delete
    // 이동할 경로  => http://localhost:8080/web01/servlet/servlet22/list
    ((HttpServletResponse)response).setHeader("Refresh", "1;url=list");
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
      stmt = con.prepareStatement("delete from ex_students where uid=?");
      
      // 첫 번째 in-parameter 값 설정
      stmt.setString(1, request.getParameter("userId"));
      
      int count = stmt.executeUpdate();
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<meta charset='UTF-8'>");
      out.println("<meta name='viewport' content='width=device-width, user-scalable=no'>");
      out.println("<title>학생관리-삭제</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>삭제 결과</h1>");
      
      if (count == 0) {
        out.println("해당 학생이 없습니다.");
      } else {
        out.println("삭제하였습니다.");
      }
      
      out.println("</body>");
      out.println("</html>");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
}









/* 주제: DBMS 연동하기 + HTML 출력
 */
package bitcamp.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet15/view")
public class Servlet15_view extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
      stmt = con.prepareStatement(
          "select uid, pwd, name, tel, email, work, byear, schl "
          + " from ex_students"
          + " where uid=?");
      stmt.setString(1, request.getParameter("userId"));
      rs = stmt.executeQuery(); 
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<meta charset='UTF-8'>");
      out.println("<meta name='viewport' content='width=device-width,"
          + " user-scalable=no, maximum-scale=1.0'>");
      out.println("<title>학생관리-상세정보</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>학생 정보</h1>");
      out.println("<form>");
      out.println("<table border='1'>");
      
      if (rs.next()) { // 서버에서 레코드 한 개를 가져왔다면,
        out.printf("<tr><th>아이디</th><td>"
            + "<input name='userId' type='text' value='%s' disabled></td></tr>\n",
                  rs.getString("uid"));
        out.printf("<tr><th>암호</th><td>"
            + "<input name='password' type='password'></td></tr>\n");
        out.printf("<tr><th>이름</th><td>"
            + "<input name='name' type='text' value='%s'></td></tr>\n", 
                  rs.getString("name"));
        out.printf("<tr><th>이메일</th><td>"
            + "<input name='email' type='text' value='%s'></td></tr>\n", 
                  rs.getString("email"));
        out.printf("<tr><th>전화</th><td>"
            + "<input name='tel' type='text' value='%s'></td></tr>\n", 
                  rs.getString("tel"));
        
        out.printf("<tr><th>재직여부</th><td>"
            + "<input type='radio' name='working' %s>재직중"
            + " <input type='radio' name='working' %s>실업/미취업</td></tr>\n",
            (rs.getString("work").equals("Y") ? "checked" : ""),
            (rs.getString("work").equals("Y") ? "" : "checked"));
        out.printf("<tr><th>태어난해</th><td>"
            + "<input name='birthYear' type='number' value='%d'></td></tr>\n", 
                  rs.getString("byear"));
        out.printf("<tr><th>최종학교</th><td>"
            + "<input name='school' type='text' value='%s'></td></tr>\n", 
                  rs.getString("schl"));
      } else {
        out.println("<tr><td>해당 사용자가 없습니다.</td></tr>");
      }

      out.println("</table>");
      out.println("<button type='submit'>변경</button>");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
}









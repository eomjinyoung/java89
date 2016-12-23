/* 주제: HttpSession 보관소에 데이터 저장하기 
 */
package bitcamp.servlet9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/servlet40_2")
public class Servlet40_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    // 세션에 데이터 보관
    HttpSession session = request.getSession();
    session.setAttribute("name", request.getParameter("name"));
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>세션 테스트</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>페이지2</h1>");
    out.println("<form action='servlet40_3' method='POST'>");
    out.println("이메일: <input name='email' type='text'>");
    out.println("<button type='submit'>다음</button>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }
  
}




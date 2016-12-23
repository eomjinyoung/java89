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

@WebServlet("/servlet/servlet40_3")
public class Servlet40_3 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    // 세션에 데이터 보관
    HttpSession session = request.getSession();
    session.setAttribute("email", request.getParameter("email"));
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>세션 테스트</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>페이지3</h1>");
    out.println("<form action='servlet40_4' method='POST'>");
    out.println("전화: <input name='tel' type='text'>");
    out.println("<button type='submit'>다음</button>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }
  
}




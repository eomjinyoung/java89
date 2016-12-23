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

@WebServlet("/servlet/servlet40_4")
public class Servlet40_4 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    // 세션에 보관된 데이터 꺼내기
    HttpSession session = request.getSession();
    String name = (String)session.getAttribute("name");
    String email = (String)session.getAttribute("email");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.printf("name: %s\n", name);
    out.printf("email: %s\n", email);
    out.printf("tel: %s\n", request.getParameter("tel"));
  }
  
}




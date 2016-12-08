/* 주제: HTML 출력
 * => 출력하기 전에 MIME 타입에 HTML임을 설정해야 한다.   
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet11")
public class Servlet11 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset=\"UTF-8\">");
    out.println("<title>메인화면</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>안녕하세요!</h1>");
    out.println("</body>");
    out.println("</html>");
  }
  
}









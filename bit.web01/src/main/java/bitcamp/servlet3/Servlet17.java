/* 주제: HTTP GET 요청과 HTTP POST 요청
 * => /servlet/servlet17_get.html 과 servlet17_post.html 을 사용하여 테스트하라!
 * => 이 예제는 자바 코드 쪽에 특별한 사항은 없다.
 *    언제 get 요청이 발생하고, 언제 post 요청이 발생하는 지 확인하는 예제이다.
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/servlet17")
public class Servlet17 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet17</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>요청 메서드</h1>");
    out.println("</body>");
    out.println("</html>");
    
  }
}






/* 주제: 인클루드(include) 
 * => 다른 서블릿에게 협업을 요청하는 것.
 * => 단 같은 웹애플리케이션에 있는 서블릿에게만 협업을 요청할 수 있다.
 * => 현재 서블릿의 버퍼에 저장된 출력물은 그대로 유지하고,
 *    협업하는 다른 서블릿의 출력물도 포함시킨다.
 */
package bitcamp.servlet5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet30_2")
public class Servlet30_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("서블릿 30_2");
  }
  
}










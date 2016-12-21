/* 주제: 포워드(forward) 
 * => 사용자의 요청을 다른 서블릿으로 위임하는 것.
 * => 단 같은 웹애플리케이션에 있는 서블릿으로만 실행을 위임할 수 있다.
 * => 다른 서블릿으로 실행을 위임하기 전에 현재 서블릿의 버퍼에 저장된 출력물은 모두 버린다.
 */
package bitcamp.servlet5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet29")
public class Servlet29 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("서블릿 1");
    
    String menuNo = request.getParameter("menuNo");
    
    // 메뉴 번호가 있을 경우 해당 번호의 서블릿으로 실행을 위임한다.
    if ("m2".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_2");
      rd.forward(request, response);
      return;
    } else if("m3".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_3");
      rd.forward(request, response);
      return;
    }
      
  }
  
}










/* 주제: GET과 POST를 구분하여 요청 처리 III
 * => AbstractHttpServlet 클래스를 상속 받아서 요청을 처리한다.
 * => servlet/servlet25.html 로 테스트 한다.
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet25")
public class Servlet25 extends AbstractHttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("요청 처리");
  }
  
}









/* 주제: GET과 POST를 구분하여 요청 처리 II
 * => AbstractHttpServlet 클래스를 상속 받아서 요청을 처리한다.
 * => servlet/servlet24.html 로 테스트 한다.
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet24")
public class Servlet24 extends AbstractHttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 이렇게 AbstractHttpServlet 클래스에 추가된 service() 메서드를 재정의하면
    // 오리지널 service()를 구현하는 것 보다 편하다.
    // 어떤 점에서? 파라미터를 HttpServletRequest와 HttpServletResponse로 
    // 형변환할 필요가 없다.
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("service(ServletRequest,ServletResponse) "
        + "---> service(HttpServletRequest, HttpServletResponse) 호출한다.");
  }
  
}









/* 주제: ServletRequest 저장소 
 * => ServletRequest는 저장소 기능을 갖고 있다.
 * => 포워딩, 인클루딩 서블릿 끼리 데이터를 공유할 때 사용한다.
 * => setAttribute(키, 값) / getAttribute(키)
* => lifecycle
 *    요청 --> HttpServletRequest 객체와 HttpServletResponse 객체가 생성된다. --> 응답 후 삭제
 *    즉, 요청이 처리되는 동안만 유지된다.
 */
package bitcamp.servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet31_2")
public class Servlet31_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    // ServletRequest 보관소에 저장된 값을 꺼낸다.
    int sum = (int)request.getAttribute("result");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.printf("%s + %s = %d\n", 
        request.getParameter("a"),
        request.getParameter("b"),
        sum);
  }
  
}










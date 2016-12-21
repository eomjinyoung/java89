/* 주제: ServletContext 저장소 
 * => ServletContext는 웹 애플리케이션의 정보를 다루는 역할을 한다.
 *    또한 저장소 역할도 한다.
 * => 요청이 분리된 서블릿 끼리 데이터를 공유할 때 사용한다.
 * => setAttribute(키, 값) / getAttribute(키)
 * => lifecycle
 *    웹애플리케이션이 시작되면 생성된다.
 *    웹애플리케이션을 멈추면 제거된다.
 *    따라서 ServletContext 객체는 웹 애플리케이션 당 1 개만 존재한다.
 */
package bitcamp.servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet32_1")
public class Servlet32_1 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    float interest = Float.parseFloat(request.getParameter("interest"));
    
    // 모든 서블릿이 이자율을 사용할 수 있도록 ServletContext 보관소에 데이터를 저장하라!
    ServletContext servletContext = request.getServletContext();
    servletContext.setAttribute("interest", interest);

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("설정된 이자율: %f\n", interest);
  }
  
}










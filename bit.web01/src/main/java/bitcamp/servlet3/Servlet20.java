/* 주제: HttpServletRequest 사용
 * => 요청 정보 중에서 HTTP 관련 정보를 다룰 수 있는 기능을 포함하고 있다.
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet20")
public class Servlet20 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) 
      throws ServletException, IOException {
    
    // 파라미터 객체를 사용하기 전에 원래의 타입으로 형변환 한 후 사용한다.
    HttpServletRequest request = (HttpServletRequest)req;
    HttpServletResponse response = (HttpServletResponse)resp;
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet20</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>HttpServletRequest 사용</h1>");
    // ServletRequest를 통해서는 알 수 없는 다음과 같은 정보를 추가로 알아낼 수 있다.
    out.printf("요청 메서드=> %s<br>\n", request.getMethod());
    out.printf("Context Root(웹애플리케이션 경로)=> %s<br>\n", request.getContextPath());
    out.printf("User-Agent 헤더(웹브라우저이름)=> %s<br>\n", request.getHeader("User-Agent"));
    out.printf("Path Info=> %s<br>\n", request.getPathInfo());
    out.printf("Query String=> %s<br>\n", request.getQueryString());
    out.printf("Request URI=> %s<br>\n", request.getRequestURI());
    out.printf("Request URL=> %s<br>\n", request.getRequestURL());
    out.printf("Servlet Path=> %s<br>\n", request.getServletPath());
    out.println("</body>");
    out.println("</html>");
    
  }
}



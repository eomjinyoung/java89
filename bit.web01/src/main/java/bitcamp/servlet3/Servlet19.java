/* 주제: HttpServletRequest와 HttpServletResponse
 * => Servlet 은 서버 프로그램을 작은 조각으로 나눠서 개발할 수 있게 도와주는 기술이다.
 * => Servlet 기술을 만들 때 처음부터 웹 기술과의 결합을 고려해서 만든 것은 아니다.
 *    일반적인 목적의 서버 프로그램을 쉽게 만들 수 있게 도와주기 위해 만든 기술이다.
 * => 그러다보니 service()의 파라미터 타입이,
 *    최소한의 요청 정보를 다루는 ServletRequest와 
 *    최소한의 응답 정보를 다루는 ServletResponse로 정의하였다.
 * => 그러나 "서블릿 + 웹"으로 사용한다면,
 *    service()메서드에 실제 전달되는 파라미터 값은,
 *    HTTP 요청 정보를 다룰 수 있는 HttpServletRequest와
 *    HTTP 응답 정보를 다룰 수 있는 HttpServletResponse 객체이다.
 * => 결론!
 *    HTTP 정보를 다루고 싶다면,
 *    ServletRequest를 HttpServletRequest로 타입 캐스팅 하여 사용하라!
 *    ServletResponse를 HttpServletResponse로 타입 캐스팅 하여 사용하라!
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

@WebServlet("/servlet/servlet19")
public class Servlet19 extends GenericServlet {
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
    out.println("<title>servlet19</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>HttpServletRequest와 HttpServletResponse</h1>");
    out.printf("HttpServletRequest=%b<br>\n", request instanceof HttpServletRequest);
    out.printf("HttpServletResponse=%b<br>\n", response instanceof HttpServletResponse);
    out.println("</body>");
    out.println("</html>");
    
  }
}



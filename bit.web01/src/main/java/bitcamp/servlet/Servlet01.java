/* 주제: 서블릿 만들기
 * => javax.servlet.Servlet 인터페이스를 구현한다.
 * => service() 메서드에 작업 코드를 둔다.
 * => 서블릿 실행 명령을 클래스에 설정한다.
 *    - @WebServlet("실행명령") 애노테이션을 붙인다.
 * => 만약 웹 프로젝트를 배치하지 않았으면, 
 *    서블릿 컨테이너(예: 톰캣서버)에 웹 프로젝트를 배치한다.
 *    - 톰캣홈/webapps/애플리케이션명/WEB-INF/classes/서블릿들 
 *    - 이클립스에서 개발하는 경우, 이클립스에 설정된 테스트 환경에 배치를 한다.
 *      Servers 뷰 > 테스트 환경 > Add and Remove... > 웹 프로젝트 추가 > publish 
 * => 서블릿 컨테이너 실행
 * => 서블릿 실행
 *    - 웹브라우저 주소 창에 다음 형식으로 명령을 작성하여 서버에 제출한다.
 *      http://서버주소:포트번호/웹애플리케이션명/서블릿명령
 *    - 예)
 *      http://localhost:8080/bit.web01/hello
 */
package bitcamp.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class Servlet01 implements Servlet {

  @Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("Hello, World!");
    
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    
  }
  
}

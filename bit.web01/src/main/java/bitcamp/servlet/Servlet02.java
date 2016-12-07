/* 주제: 서블릿 구동 원리
 * 1) 웹브라우저에서 http://localhost:8080/web01/servlet02를 서버에 제출한다.
 * 2) 웹서버는 웹 브라우저의 요청을 받는다.
 * 3) 웹서버는 서블릿 컨테이너에게 요청 처리를 위임한다.
 * 4) 서블릿 컨테이너는 URL을 분석한 후 웹 애플리케이션(/web01)을 찾는다.
 * 5) 서블릿 컨테이너는 웹 애플리케이션의 서블릿 객체(/servlet02)를 찾는다.
 * 6) 만약 서블릿 객체가 생성되지 않았으면,
 *    - Servlet02(/servlet02) 클래스의 객체를 생성한다.
 *    - init() 메서드를 호출한다.
 * 7) service() 메서드를 호출한다.
 * 8) 서블릿 컨테이너는 service() 메서드의 출력 내용을 웹서버에 전달한다.
 * 9) 웹서버는 서블릿 컨테이너로부터 전달 받은 데이터를 웹 브라우저에게 응답한다. 
 *    
 * 
 * 
 * [URI(Uniform Resource Identifier)?]
 * - 인터넷 상에 존재하는 자원(파일, 프로그램 등)을 가리킬 때 사용하는 주소 
 * - 종류
 *   - URL(Uniform Resource Locator) : 웹 상의 자원 주소를 지정할 때 사용
 *        ex) http://localhost:8080/web01/servlet02
 *            https://www.google.co.kr/search?q=홍길동&espv=2&tbm=isch
 *   - URN(Uniform Resource Name)
 *        ex) urn:isbn:0451450523
 *            urn:mpeg:mpeg7:schema:2001
 *            
 * [Servlet 인터페이스의 메서드]
 * init() 
 *   - 서블릿 인스턴스를 생성한 후 자동으로 호출됨. 
 *   - 서블릿을 위한 객체를 준비시키는 코드를 여기에 둔다.
 * destroy()
 *   - 웹애플리케이션을 멈추거나 서블릿 컨테이너를 멈출 때 호출됨.
 *   - init()에서 준비한 객체를 초기화시키거나 해제시키는 코드를 여기에 둔다.
 * service()
 *   - 클라이언트가 요청할 때 마다 호출됨.
 *   - 클라이언트에게 응답할 결과를 만드는 코드를 여기에 둔다.
 * getServletInfo()
 *   - 서블릿 컨테이너의 관리자 화면에서 서블릿 정보를 출력할 때 호출됨.
 * getServletConfig()
 *   - 서블릿을 실행하는 중에 해당 서블릿 관련 설정 정보를 추출할 때 호출됨.  
 *   
 * [서블릿 lifecycle 관련 메서드]
 * init(), service(), destroy()
 * 
 */
package bitcamp.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet02")
public class Servlet02 implements Servlet {

  public Servlet02() {
    System.out.println("Servlet02()");
  }
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("Servlet02.init()");
  }

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("Servlet02.getServletConfig()");
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("Servlet02.service()");
    
  }

  @Override
  public String getServletInfo() {
    System.out.println("Servlet02.getServletInfo()");
    return null;
  }

  @Override
  public void destroy() {
    System.out.println("Servlet02.destroy()");
  }
  
}

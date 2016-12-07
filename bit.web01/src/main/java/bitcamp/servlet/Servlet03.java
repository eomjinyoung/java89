/* 주제: GenericServlet 추상 클래스
 * - Servlet 인터페이스의 5 개 메서드를 매번 구현하는 것이 번거롭다.
 * - GenericServlet은 Servlet 인터페이스의 메서드 중에서 다음 메서드를 미리 구현했다.
 *   init(), destroy(), getServletInfo(), getServletConfig()
 * - 서브 클래스가 구현해야 할 service()는 추상 메서드를 남겨두었다.
 * - Servlet 인터페이스를 직접 구현해서 관심없는 메서드까지 모두 만드는 것 보다 
 *   GenericServlet 클래스를 상속 받아서 service() 메서드를 만드는 것이 편하다!
 * - GenericServlet의 목표는 개발자가 코드를 적게 작성하도록 하는 것이지,
 *   GenericServlet을 상속 받았기 때문에 서블릿이 되는 게 아니다.
 * - 서블릿이 되려면 반드시 javax.servlet.Servlet 인터페이스를 구현해야 한다.
 *   이것이 서블릿을 만드는 유일한 방법이다.
 * 
 */
package bitcamp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet03")
public class Servlet03 extends GenericServlet {
  // GenericServlet은 Serializable 인터페이스를 구현하기 때문에 버전 번호를 추가해야 한다.
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("Servlet03.service()");
    
  }
  
}

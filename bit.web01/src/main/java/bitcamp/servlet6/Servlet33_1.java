/* 주제: 서블릿 컨테이너가 시작될 때 서블릿 객체를 자동 생성하는 방법 
 * => 서블릿 객체는 클라이언트가 요청할 때 해당 객체가 없으면 그 때 생성한다.
 * => 그러나 서블릿 컨테이너가 시작될 때 서블릿 객체를 자동으로 만들고 싶다면,
 *    웹 애플리케이션 설정을 추가하라.
 * => 방법1: web.xml에 설정하기
<servlet>
    <servlet-name>servlet 05</servlet-name>
    <servlet-class>bitcamp.servlet.Servlet05</servlet-class>
    <load-on-startup>1</load-on-startup>  <----- 이 태그 추가
</servlet> 

     load-on-startup 태그의 값은 생성 순서이다. 작은 값부터 먼저 서블릿 객체를 생성한다.

 * => 방법2: 애노테이션으로 설정하기
@WebServlet(
    value="/servlet/servlet33_1", 
    loadOnStartup=1  <------------ loadOnStartup 속성의 값을 지정한다.
)
     web.xml 파일에 설정하는 경우, 서블릿에 URL을 연결하지 않아도 된다.
     그러나 애노테이션으로 설정하는 경우 URL을 지정해야 한다.
 */
package bitcamp.servlet6;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//이 서블릿은 다른 서블릿들이 사용할 값을 준비하는 역할이기 때문에
// service() 메서드는 구현하지 않는다. 
@WebServlet(value="/servlet/servlet33_1", loadOnStartup=1)
public class Servlet33_1 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("Servlet33_1.init() 호출됨");
    //서블릿 객체가 생성될 때 이 메서드가 자동으로 호출된다.
    //따라서 초기화시킬 작업이 있다면 이 메서드 안에 작성한다.
    ServletContext servletContext = config.getServletContext();
    servletContext.setAttribute("interest", 0.11f);
  }
}










/* 주제: web.xml 과 서블릿
 * - @WebServlet 애노테이션은 Servlet 3.0 부터 추가되었다.
 * - Servlet 2.5 이하 버전에는 @WebServlet 애노테이션이 없기 때문에
 *   서블릿 정보를 등록하려면 web.xml 파일에 설정해야 한다.
 *   
 * [web.xml]
 * - 웹 애플리케이션의 설정 정보를 담고 있는 파일이다.
 * - DD 파일(Deployment Descriptor)이라 부른다.
 * 
 * [서블릿 설정]
 * <servlet>
 *   <servlet-name>서블릿 별명</servlet-name>
 *   <servlet-class>서블릿 클래스명(패키지명 포함)</servlet-class>
 * </servlet>
 * 
 * <servlet-mapping>
 *   <servlet-name>서블릿 별명</servlet-name>
 *   <url-pattern>서블릿을 요청할 때 사용할 이름</url-pattern>
 * </servlet-mapping>
 * 
 */
package bitcamp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet04 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("Servlet04.service()");
    
  }
  
}

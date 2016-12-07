/* 주제: 클라이언트가 보낸 데이터 꺼내기
 * => 클라이언트가 서블릿에 데이터를 전달하는 방법
 *    - URL에 이름과 값을 포함시킨다.
 *    - 문법) http://localhost:8080/웹애플리케이션명/서블릿명령어?이름=값&이름=값&이름=값 
 *    - 예)   http://localhost:8080/web01/servlet07?name=aaa&age=20&tel=111-111
 * => ServletRequest 도구를 이용하여 꺼낸다.
 *    - getParameter("파라미터명") : 그 파라미터에 해당하는 값을 리턴
 *      예) getParameter("name") ---> "aaa"
 *      
 * => 참고!
 *    톰캣7 이하 버전에서는 URL로 보낸 한글 데이터를 서버에서 읽을 때 그 한글 데이터가 깨진다. 
 *    해결책? 
 *    톰캣 서버의 설정 파일 "server.xml"에서 다음 태그에 URIEncoding 속성을 추가하라.
 *    <Connector connectionTimeout="20000" 
 *               port="8080" 
 *               protocol="HTTP/1.1" 
 *               redirectPort="8443"
 *               URIEncoding="UTF-8"/>
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet07")
public class Servlet07 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String tel = request.getParameter("tel");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("이름: %s\n", name);
    out.printf("나이: %s\n", age);
    out.printf("전화: %s\n", tel);
    
  }
  
}









/* 주제: 클라이언트가 보낸 데이터 꺼내기 III
 * => 클라이언트가 어떤 이름으로 데이터를 보낼 지 모를 경우, 
 *    먼저 이름 목록을 알아낸 다음, 값을 꺼낸다.
 *    - 예)   http://localhost:8080/web01/servlet07?name=aaa&age=20&tel=111-222&email=hong
 * => 이름 꺼내기
 *    - getParameterNames()         ----> 이름을 저장한 배열을 리턴한다.
 *    
 * [요청 파라미터]
 * - 클라이언트가 보낸 데이터(이름=값)를 말한다.   
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet09")
public class Servlet09 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    // 요청 파라미터의 이름 목록 알아내기
    Enumeration<String> names = request.getParameterNames();
    while (names.hasMoreElements()) {
      String name = names.nextElement();
      out.printf("%s=%s\n", name, request.getParameter(name));
    }
    
  }
  
}









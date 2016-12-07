/* 주제: 클라이언트가 보낸 데이터 꺼내기 II
 * => 같은 이름으로 여러 개의 데이터를 보낼 수 있다.
 *    - 예)   http://localhost:8080/web01/servlet07?name=aaa&name=bbb&name=ccc
 * => 데이터 꺼내기
 *    - getParameter("name")        ----> 첫 번째 데이터만 리턴한다.
 *    - getParameterValues("name")  ----> 값을 저장한 배열을 리턴한다.
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet08")
public class Servlet08 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    String value = request.getParameter("name");
    out.println(value);
    out.println("----------------");
    
    String[] values = request.getParameterValues("name");
    for (String item : values) {
      out.println(item);
    }
    
  }
  
}









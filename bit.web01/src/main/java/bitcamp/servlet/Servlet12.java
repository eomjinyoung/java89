/* 주제: CSV(Comma Separated Value) 출력과 다운로드
 * => 웹 브라우저는 다룰 수 없는 형식의 데이터를 받을 때
 *    다운로드 창을 띄운다.  
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet12")
public class Servlet12 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/csv;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("홍길동,20,111-1111,hong@test.com");
    out.println("홍길동2,21,111-1112,hong2@test.com");
    out.println("홍길동3,20,111-1113,hong3@test.com");
    out.println("홍길동4,23,111-1114,hong4@test.com");
    out.println("홍길동5,24,111-1115,hong5@test.com");
  }
  
}









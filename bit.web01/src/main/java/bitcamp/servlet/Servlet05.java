/* 주제: 웹브라우저에게 출력하기
 * => service() 메서드의 파라미터 값으로 넘어오는 객체 중에서 
 *    ServletResponse 객체를 사용해야 한다.
 * => ServletRequest
 *    - 클라이언트 요청과 관련된 기능을 구비하고 있다.
 *    - getParameter() : 클라이언트가 보낸 파라미터 값을 추출.
 *    - getRemoteAddress() : 클라이언트의 IP 주소를 추출.
 *    - setCharacterEncoding() : 클라이언트가 보낸 데이터의 문자집합을 지정한다.
 * => ServletResponse
 *    - 클라이언트 응답과 관련된 기능을 구비하고 있다.
 *    - getWriter() : 클라이언트로 출력할 도구를 리턴.
 *    - setContentType() : 출력하려는 데이터의 타입과 문자집합을 지정한다.
 *    
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet05 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    // 클라이언트에게 데이터를 보낼 때 사용할 출력 스트림 얻기
    PrintWriter out = response.getWriter();
    out.println("Hello, world!");
    out.println("안녕하세요");
    out.println("你好");
    out.println("Hallo!");
    out.println("こんにちは");
    
  }
  
}









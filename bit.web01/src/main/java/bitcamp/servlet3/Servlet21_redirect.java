/* 주제: HttpServletResponse 사용 - 페이지 이동 기법(Refresh) III
 * => HTTP 프로토콜의 응답을 다루는 기능을 들어 있다.
 * => Redirect
 *    - 클라이언트에게 특정 페이지로 이동하라고 알려준다.
 *    - 상태 코드 값 
 * */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/servlet/servlet21_redirect")
public class Servlet21_redirect extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) 
      throws ServletException, IOException {
    
    // 파라미터 객체를 사용하기 전에 원래의 타입으로 형변환 한 후 사용한다.
    HttpServletRequest request = (HttpServletRequest)req;
    HttpServletResponse response = (HttpServletResponse)resp;
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet21_refresh1</title>");
    out.println("</head>");
    out.println("<body>");
    // 버퍼를 꽉채워 자동으로 출력하게 해서 sendRedirect()를 못하게 테스트하고 싶다면
    // 다음 반복문의 주석을 풀어 테스트하라!
    //for (int i = 0; i < 2000; i++ ) {
      out.println("<p>5초 후에 카카오 홈페이지로 이동합니다.</p>");
    //}
    out.println("</body>");
    out.println("</html>");
    
    // Redirect 응답하기
    // => 응답 헤더의 상태 값을 xxx 로 응답한다.
    // => 출력 버퍼에 저장된 내용을 모두 버린다.
    //    - 출력 버퍼의 기본 크기는? 서블릿 컨테이너마다 다르다. 톰캣 서버인 경우 8KB이다.
    //    - 만약에 sendRedirect()를 호출하기 전에 버퍼 크기를 넘게 출력했다면?
    //      => 버퍼가 꽉차면 자동으로 클라이언트에게 내보낸다.
    //      => 일단 응답한 후에는 sendRedirect()를 호출할 수 없다. 호출하면 오류가 발생한다.
    // => 즉 클라이언트로 콘텐츠를 출력하지 않는다.
    // => 당연히 웹브라우저는 아무런 내용도 받지 않았음으로 아무것도 출력하지 않는다.
    // => 아무것도 출력하는 것 없이 다른 페이지로 이동하고 싶다면 리다이렉트를 사용하라!
    response.sendRedirect("http://www.daum.net");
  }
}

/* HTTP 응답 프로토콜
HTTP/1.1 302 Found                      <======== 응답 상태코드 값이 200이 아니라 302이다.
Server: Apache-Coyote/1.1
Location: http://www.daum.net           <======== 이동할 페이지의 URL
Content-Type: text/html;charset=UTF-8
Content-Length: 0
Date: Mon, 12 Dec 2016 02:55:29 GMT
Proxy-Connection: Keep-alive

(아무런 내용도 클라이언트에게 보내지 않는다.)
 */









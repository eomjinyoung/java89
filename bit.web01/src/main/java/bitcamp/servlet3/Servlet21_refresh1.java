/* 주제: HttpServletResponse 사용 - 페이지 이동 기법(Refresh) I
 * => HTTP 프로토콜의 응답을 다루는 기능을 들어 있다.
 * => Refresh
 *    - 클라이언트에게 특정 페이지로 이동하라고 알려준다.
 *    - 방법1) HTML에 리프래시 명령어 심기
 *    - 방법2) 응답 헤더에 리프래시 명령어 심기
 */
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

@WebServlet("/servlet/servlet21_refresh1")
public class Servlet21_refresh1 extends GenericServlet {
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
    
    // HTML문 안에 리프래시 명령어 심기
    // => 웹브라우저는 5초 후에 지정된 URL을 실행한다.
    out.println("<meta http-equiv='Refresh' content='5;url=http://www.daum.net'>");
    
    out.println("<title>servlet21_refresh1</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>5초 후에 카카오 홈페이지로 이동합니다.</p>");
    out.println("</body>");
    out.println("</html>");
    
  }
}
/* HTTP 응답 결과
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Content-Type: text/html;charset=UTF-8
Content-Length: 244
Date: Mon, 12 Dec 2016 02:48:02 GMT
Proxy-Connection: Keep-alive

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<meta http-equiv='Refresh' content='5;url=http://www.daum.net'>
<title>servlet21_refresh1</title>
</head>
<body>
<p>5초 후에 카카오 홈페이지로 이동합니다.</p>
</body>
</html>

 */


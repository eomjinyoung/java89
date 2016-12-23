/* 주제: HttpSession 보관소 사용하기
 * => HttpSession 객체를 사용하려할 때 해당 객체가 없으면,
 *    새로 생성한다. 그리고 그 세션 아이디를 쿠키로 웹 브라우저에게 맡긴다.
 * => 웹 브라우저가 웹서버로부터 세션 아이디를 받으면
 *    다음에 해당 웹 서버에 요청할 때 마다 세션 아이디를 쿠키로 보낸다.
 * => 웹서버는 클라이언트가 보낸 세션 아이디로 해당 HttpSession 객체를 찾는다.
 * => 새로 HttpSession 객체를 만드는 경우,
 *    웹서버는 웹브라우저에게 쿠기로 세션 아이디를 내려 보낸다.
 * => 이미 HttpSession 객체가 존재할 때는 새로 객체를 만들지 않기 때문에
 *    웹브라우저로 세션 아이디를 보내지 않는다.
 */
package bitcamp.servlet9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/servlet39")
public class Servlet39 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    // 웹브라우저가 세션 아이디를 쿠키로 보내지 않았으면,
    // 새로 HttpSession 객체를 만들어 리턴한다.
    // 만약 웹 브라우저가 세션 아이디를 보냈으면,
    // 해당 HttpSession 객체를 찾아 리턴한다.
    HttpSession session = request.getSession();

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("세션 아이디: %s\n", session.getId());
    
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(session.getCreationTime());
    out.printf("세션 생성시간: %s:%s:%s\n", 
        cal.get(Calendar.HOUR),
        cal.get(Calendar.MINUTE),
        cal.get(Calendar.SECOND));
    
  }
}

/* getSession()을 호출할 때,
 * 다음과 같이 요청 헤더의 쿠키 데이터에 세션 아이디가 없으면 
 * 웹서버는 새 HttpSession 객체를 만든다.
-------------------------------------------------------------------
GET /bit.web01/servlet/servlet39 HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,...
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
-------------------------------------------------------------------
 *
 * 클라이언트에게 응답할 때 새로 만든 HttpSession 객체의 아이디를 
 * 다음과 같이 쿠키로 보낸다.
------------------------------------------------------------------- 
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Set-Cookie: JSESSIONID=A37E7F95635F75910C21452F491C1849; Path=/bit.web01/; HttpOnly
Content-Type: text/plain;charset=UTF-8
Content-Length: 80
Date: Fri, 23 Dec 2016 06:53:37 GMT
-------------------------------------------------------------------
 */

/* getSession()을 호출할 때,
 * 다음과 같이 요청 헤더의 쿠키 데이터에 세션 아이디가 있으면 
 * 웹서버는 그 아이디에 해당하는 HttpSession 객체를 찾는다.
-------------------------------------------------------------------
GET /bit.web01/servlet/servlet39 HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,...
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Cookie: JSESSIONID=A37E7F95635F75910C21452F491C1849
-------------------------------------------------------------------
 *
 * 기존 HttpSession 객체를 사용한 경우에는
 * 이미 클라이언트에게 세션 아이디를 보냈다는 의미이기 때문에
 * 응답할 때 세션 아이디를 쿠키로 다시 보내지 않는다.
------------------------------------------------------------------- 
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Content-Type: text/plain;charset=UTF-8
Content-Length: 80
Date: Fri, 23 Dec 2016 06:55:44 GMT
-------------------------------------------------------------------
 */







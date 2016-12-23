/* 주제: 쿠키 받기 
 * => 웹 브라우저는 웹 서버에 요청할 때 마다,
 *    웹 서버로부터 받은 쿠키 데이터를 요청 헤더에 첨부하여 보낸다.
 *    물론 웹 서버로부터 받은 쿠기가 없다면 요청 헤더에 첨부할 일도 없을 것이다.
 *    그리고 요청할 때 그 서버로부터 받은 쿠키를 첨부하는 것이지,
 *    다른 서버에서 받은 쿠기를 첨부하는 것은 아니다. 
 * => 쿠키의 유효기간
 *    - 웹 브라우저가 쿠키를 보내기 전에 유효기간을 검사하여,
 *      유효기간이 넘은 쿠키는 보관소에게 제거해 버린다. 그리고 서버에 보내지 않는다.
 *      즉 일정시간 주기적으로 쿠키를 청소하는 것은 아니다. 
 * => HTTP 프로토콜 분석 : 웹 브라우저가 웹 서버로 쿠키 보내기
GET /bit.web01/servlet/servlet36_2 HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*...
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Cookie: name=%ED%99%8D%EA%B8%B8%EB%8F%99; email="hong@test.com"; age=10
 */
package bitcamp.servlet8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet36_2")
public class Servlet36_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    // 요청 헤더에 포함된 쿠키 데이터 꺼내기
    Cookie[] cookies = request.getCookies();
    HashMap<String,String> cookieMap = new HashMap<String,String>();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        cookieMap.put(cookie.getName(), cookie.getValue());
      }
    }
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("Servlet36_2");
    // URL 인코딩하여 저장했다면 꺼낼 때 직접 디코딩 해야 한다.
    out.printf("name=%s\n", URLDecoder.decode(cookieMap.get("name"), "UTF-8"));
    out.printf("email=%s\n", cookieMap.get("email"));
    out.printf("age=%s\n", cookieMap.get("age"));
    
  }
}










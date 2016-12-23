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
 * => 
 *    
 * => HTTP 프로토콜 분석 : 웹 서버에서 웹 브라우저로 쿠키 보내기
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Set-Cookie: name=%ED%99%8D%EA%B8%B8%EB%8F%99
Set-Cookie: email="hong@test.com"; Version=1
Set-Cookie: age=10
Content-Type: text/plain;charset=UTF-8
Content-Length: 10
Date: Fri, 23 Dec 2016 02:11:55 GMT

내용...
 */
package bitcamp.servlet8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet36")
public class Servlet36_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    // 데이터를 담을 쿠키 객체 생성
    // => 단 문자열만 웹 브라우저로 보낼 수 있다.
    // => 한글은 URL 인코딩(한글을 영문화시키는 것)해서 보내야 한다. 
    //    왜냐하면, 요청헤더는 ASCII 코드만 가능하다. 
    Cookie c1 = new Cookie("name", URLEncoder.encode("홍길동", "UTF-8"));
    Cookie c2 = new Cookie("email", "hong@test.com"); // 영문은 OK!
    Cookie c3 = new Cookie("age", "10"); // 숫자는 문자열로 표현
    
    // 쿠키를 응답헤더에 포함시키기
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("Servlet36");
  }
}










/* 주제: 쿠키 보내기 
 * => 쿠키란? 
 *    - 웹 브라우저 쪽에 보관되는 데이터
 *    - 유효기간을 설정할 수 있다. 
 *    - 유효기간이 있으면 웹 브라우저는 그 때까지 유지한다.
 *    - 사용 범위를 설정할 수 있다.
 *    - 그 범위의 URL일 때만 쿠키를 사용한다.
 * => 웹 서버에서 데이터를 생성하여 웹 브라우저 쪽으로 보낸다.
 * => 용도?
 *    - 웹 서버에 요청할 때 다시 쿠키를 보낸다.
 *    - 웹 서버가 웹 브라우저에게 잠시 맡기는 데이터다.
 *    - 웹 브라우저는 웹 서버에 요청할 때 마다 
 *      요청 헤더에 웹 서버가 맡긴 데이터를 첨부해서 보낸다.
 *    - 예) 쿠폰
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
public class Servlet36 extends HttpServlet {
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










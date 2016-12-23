/* 주제: 쿠키 보내기2 
 * => 쿠키의 사용 범위 지정하기
 * => HTTP 응답 프로토콜
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Set-Cookie: value1=value1
Set-Cookie: value2=value2; Path=/web01
Set-Cookie: value3=value3; Path=/web01/servlet2
Content-Type: text/plain;charset=UTF-8
Content-Length: 10
Date: Fri, 23 Dec 2016 03:12:48 GMT
 */
package bitcamp.servlet8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet37")
public class Servlet37 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    /* 주의! 
     * - 웹 브라우저가 사용할 URL의 루트는 웹서버 루트를 의미한다. 
     *   예) "/" ---> "localhost:8080/"
     * - 그러나 forward/include에서 루트는 현재 웹 애플리케이션 루트를 의미한다.
     *   예) "/" ---> "localhost:8080/web01"
     * - 쿠키는 웹브라우저가 사용하는 URL이기 때문에 "/"가 웹서버 루트를 의미한다.
     *   주의해서 작성하라!
     */
    // 웹브라우저가 어느 URL로 요청할 때 쿠키를 보내야 하는지 지정한다.
    Cookie c1 = new Cookie("value1", "value1");
    
    Cookie c2 = new Cookie("value2", "value2");
    c2.setPath("/bit.web01");
    
    Cookie c3 = new Cookie("value3", "value3"); 
    c3.setPath("/bit.web01/servlet2");
    
    // 쿠키를 응답헤더에 포함시키기
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("Servlet37");
  }
}










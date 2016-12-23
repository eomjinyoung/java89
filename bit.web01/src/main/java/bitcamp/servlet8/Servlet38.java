/* 주제: 쿠키 보내기3 
 * => 쿠키의 유효기간 지정하기
 * => HTTP 응답 프로토콜

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

@WebServlet("/servlet/servlet38")
public class Servlet38 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    // 유효기간을 지정하지 않으면,
    // => 웹브라우저가 실행되는 동안만 유효하다.
    Cookie c1 = new Cookie("value5", "not");
    
    // 유효기간을 지정하면,
    // => 웹브라우저를 종료하더라도 계속 유지시킨다.
    // => 단 웹서버에 쿠키를 보내기 전에 유효기간이 지난 경우 해당 쿠키를 버린다.
    Cookie c2 = new Cookie("value6", "30");
    c2.setMaxAge(30);
    
    Cookie c3 = new Cookie("value7", "60"); 
    c3.setMaxAge(60);
    
    // 쿠키를 응답헤더에 포함시키기
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("Servlet38");
  }
}










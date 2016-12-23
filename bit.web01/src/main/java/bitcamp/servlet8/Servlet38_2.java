/* 주제: 쿠키 받기 
 * => 유효기간이 지난 쿠키는 웹 브라우저가 보내지 않는다.
 * => 유효기간을 지정하지 않으면 웹브라우저가 실행되는 동안만 유지된다.
 * 
 */
package bitcamp.servlet8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet38_2")
public class Servlet38_2 extends HttpServlet {
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
    out.println("Servlet38_2");
    // URL 인코딩하여 저장했다면 꺼낼 때 직접 디코딩 해야 한다.
    out.printf("value5=%s\n", cookieMap.get("value5"));
    out.printf("value6=%s\n", cookieMap.get("value6"));
    out.printf("value7=%s\n", cookieMap.get("value7"));
    
  }
}










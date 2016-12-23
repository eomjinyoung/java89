/* 주제: 쿠키 받기2
 * => 웹 서버가 쿠키를 보낼 때 사용 범위를 지정하지 않으면,
 *    쿠키를 보낸 URL로 사용 범위를 한정시킨다.
 *    즉 그 URL이 "http://localhost:8080/web01/servlet/servlet36" 이라면,
 *    같은 URL인 "http://localhost:8080/web01/servlet/...." 에 대해서만
 *    웹브라우저가 쿠키를 보낸다.
 *    만약 이번 서블릿처럼 "http://localhost:8080/web01/servlet2/...." 이렇게 다른 URL이라면,
 *    같은 서버라도 쿠키를 보내지 않는다.
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

@WebServlet("/servlet2/servlet36_3")
public class Servlet36_3 extends HttpServlet {
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
    out.println("Servlet36_3");
    // URL 인코딩하여 저장했다면 꺼낼 때 직접 디코딩 해야 한다.
    out.printf("name=%s\n", URLDecoder.decode(cookieMap.get("name"), "UTF-8"));
    out.printf("email=%s\n", cookieMap.get("email"));
    out.printf("age=%s\n", cookieMap.get("age"));
    
  }
}










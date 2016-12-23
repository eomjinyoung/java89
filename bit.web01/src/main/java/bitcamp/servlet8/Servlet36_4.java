/* 주제: 쿠키 받기3
 * => 당연히 그 쿠키를 보낸 URL의 하위 URL로 요청할 때는
 *    웹 브라우저가 쿠키를 보낸다. 
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

@WebServlet("/servlet/a/b/c/servlet36_4")
public class Servlet36_4 extends HttpServlet {
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
    out.println("Servlet36_4");
    // URL 인코딩하여 저장했다면 꺼낼 때 직접 디코딩 해야 한다.
    out.printf("name=%s\n", URLDecoder.decode(cookieMap.get("name"), "UTF-8"));
    out.printf("email=%s\n", cookieMap.get("email"));
    out.printf("age=%s\n", cookieMap.get("age"));
    
  }
}










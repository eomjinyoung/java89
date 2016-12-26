/* 주제: 파일 업로드 처리 
 * => HTML 폼
 *    - POST 요청이어야 한다.
 *    - 인코딩 타입이 멀티파트 방식이어야 한다.
 *    예) 
 *    <form action='servlet41' 
 *          method='POST' 
 *          enctype="multipart/form-data">
 *      ...
 *    </form>
 *    
 * => 멀티파트 방식으로 데이터를 전송하는 경우 HTTP 요청 형식 예)
POST /bit.web01/servlet/servlet41 HTTP/1.1
Host: localhost:8080
Content-Length: 5139
Cache-Control: max-age=0
Origin: http://localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36
Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryB4AMJHT5IqdMXghb
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*...
Referer: http://localhost:8080/bit.web01/servlet/servlet41_form.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

------WebKitFormBoundaryB4AMJHT5IqdMXghb
Content-Disposition: form-data; name="userId"

aaa
------WebKitFormBoundaryB4AMJHT5IqdMXghb
Content-Disposition: form-data; name="password"

bbbb
------WebKitFormBoundaryB4AMJHT5IqdMXghb
Content-Disposition: form-data; name="name"

ccc
------WebKitFormBoundaryB4AMJHT5IqdMXghb
Content-Disposition: form-data; name="photo"; filename="photo05.jpeg"
Content-Type: image/jpeg

바이너리데이터...
------WebKitFormBoundaryB4AMJHT5IqdMXghb--

 * => 멀티파트 형식으로 데이터를 보낸 경우에는,
 *    서버쪽에서 getParameter() 메서드로 값을 꺼낼 수 없다.
 *    멀티파트를 분석하여 값을 꺼내야 한다.
 *    안타깝게도 서블릿 API는 멀티파트 값을 꺼내는 메서드를 제공하지 않는다.
 *    외부 라이브러리 도움을 받아서 처리해야 한다.
 *    어떤 라이브러리? 
 *    http://commons.apache.org/proper/commons-fileupload/
 */
package bitcamp.servlet10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet41")
public class Servlet41 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    request.setCharacterEncoding("UTF-8");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.printf("userId=%s\n", request.getParameter("userId"));
    out.printf("password=%s\n", request.getParameter("password"));
    out.printf("name=%s\n", request.getParameter("name"));
    out.printf("photo=%s\n", request.getParameter("photo"));
  }
  
}




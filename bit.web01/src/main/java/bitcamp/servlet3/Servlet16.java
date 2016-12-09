/* 주제: HTTP 요청 프로토콜과 응답 프로토콜 분석
 * 
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet16")
public class Servlet16 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet16</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>HTTP 프로토콜 분석</h1>");
    out.println("</body>");
    out.println("</html>");
    
  }
}
/* HTTP 요청
요청라인 
(일반헤더 | 요청헤더 | 엔티티 헤더)*
빈 줄
(메시지 본문 <--- 서버에 보내는 데이터. 선택항목)

[요청라인(request line)]
메서드 URI 프로토콜명/버전
=> GET /bit.web01/servlet16 HTTP/1.1
=> 메서드
   - GET, POST, HEAD, PUT, DELETE, TRACE, OPTIONS, CONNECT 등

[일반헤더]
- 헤더? 요청이나 응답에 대한 부가 설명이다.
- 요청과 응답에 모두 사용할 수 있는 부가 설명
- 형식)
  헤더명: 값 CRLF
- 예) 
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
  

[요청헤더]
- 요청할 때만 사용하는 부가 설명
- 예)
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*//*;q=0.8
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Host: localhost:8080
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36

[엔티티헤더]
- 서버에 보내는 데이터에 대한 부가 설명
- 예)

예)
GET /bit.web01/servlet16 HTTP/1.1
Host: localhost:8080
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*//*;q=0.8
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
 */

/* HTTP 응답
상태 라인 
(일반헤더 | 응답헤더 | 엔티티 헤더)*
빈 줄
메시지 본문 <--- 클라이언트에게 보내는 콘텐츠

[상태 라인(request line)]
프로토콜명/버전 상태코드 간단한문구
=> HTTP/1.1 200 OK
=> 상태 코드
   - 200   : 정상적으로 실행했음을 의미한다.
   - 301   : 요청한 자원이 다른 주소로 이동했음을 알린다.
   - 400   : 요청 형식이 잘못되었을 때.
   - 404   : 요청한 자원을 찾을 수 없을 때.
   - 500   : 서버측 오류.

[일반헤더]
- 헤더? 요청이나 응답에 대한 부가 설명이다.
- 요청과 응답에 모두 사용할 수 있는 부가 설명
- 형식)
  헤더명: 값 CRLF
- 예) 
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
Date: Fri, 09 Dec 2016 03:16:23 GMT  

[응답헤더]
- 응답할 때만 사용하는 부가 설명
- 예)
Server: Apache-Coyote/1.1
Proxy-Connection: Keep-alive

[엔티티헤더]
- 서버에 보내는 데이터에 대한 부가 설명
- 예)
Content-Type: text/html;charset=UTF-8
Content-Length: 143

예)
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Content-Type: text/html;charset=UTF-8
Content-Length: 143
Date: Fri, 09 Dec 2016 03:16:23 GMT
Proxy-Connection: Keep-alive

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>servlet16</title>
</head>
<body>
<h1>HTTP 프로토콜 분석</h1>
</body>
</html>
 */






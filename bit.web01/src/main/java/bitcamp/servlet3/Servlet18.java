/* 주제: GET 요청과 POST 요청의 차이점
 * => 아래의 주석을 참고하라!
 * => 테스트는 /servlet/servlet18.html 을 실행하라.
 */
package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/servlet18")
public class Servlet18 extends GenericServlet {
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
    out.println("<title>servlet18</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>파라미터 값</h1>");
    out.printf("data1=%s<br>\n", request.getParameter("data1"));
    out.printf("data2=%s<br>\n", request.getParameter("data2"));
    out.printf("data3=%s<br>\n", request.getParameter("data3"));
    out.println("</body>");
    out.println("</html>");
    
  }
}

/* HTTP GET 요청
=> request-line의 URI에 데이터를 첨부하여 서버로 보낸다.
=> 프로토콜 예) 
GET /bit.web01/servlet/servlet18?data1=aaa&data2=bbb&data3=ccc HTTP/1.1
Host: localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*//*;q=0.8
Referer: http://localhost:8080/bit.web01/servlet/servlet18.html
Accept-Encoding: gzip, deflate, sdch, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
 */

/* HTTP POST 요청
=> 메시지 본문에 데이터를 첨부하여 보낸다.
=> 메시지 본문?
HTTP 요청 프로토콜을 다시 한 번 상기해보자!
------------------------------------------
요청 라인
헤더: 값
헤더: 값
헤더: 값
...
(빈 줄)
메시지 본문
------------------------------------------
=> GET 요청은 데이터를 URI에 첨부하기 때문에 메시지 본문을 따로 보내지 않는다.
=> POST 요청은 "빈 줄" 다음에 데이터를 첨부하여 보낸다.
=> 프로토콜 예)
POST /bit.web01/servlet/servlet18 HTTP/1.1
Host: localhost:8080
Content-Length: 29
Cache-Control: max-age=0
Origin: http://localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36
Content-Type: application/x-www-form-urlencoded
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*//*;q=0.8
Referer: http://localhost:8080/bit.web01/servlet/servlet18.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

data1=xxx&data2=yyy&data3=zzz
 */

/* GET 요청 특징 
 * => 웹브라우저 주소 창에 데이터가 노출된다.
 *    => 로그인 데이터(아이디/암호)가 쉽게 노출될 수 있다. 
 *    => 웹브라우저는 실행한 URL을 내부 저장소에 임시 보관해 두기 때문에
 *       언제든 해당 요청을 다시 실행할 수 있다. => 이것이 보안에 취약한 이유이다.
 * => 웹서버 마다 Request-Line으로 보낼 수 있는 데이터의 크기에 제한이 있다.
 *    => 많은 양의 데이터를 GET 방식으로 서버에 보낼 수 없다.
 *    => 예) 톰캣 서버(8KB), IIS6/7(16KB) 등 
 *    => 조회할 때 사용할 간단한 키 값, 검색할 때 사용할 검색어 정도의 간단한
 *       데이터를 보낼 때 사용한다.  
 * => URL에 데이터를 첨부한다.
 *    => 텍스트 데이터만 서버에 보낼 수 있다.
 *    => 물론, Base64와 같은 인코딩을 사용하면 바이너리 데이터(GIF, JPEG 등)를 
 *       문자화 시켜 서버에 보낼 수 있다.
 *       하지만, 일단 GET 요청에서 URL 크기에 제한이 있기 때문에
 *       바이너리 데이터를 보내는데 GET 방식을 사용하지 않는다. 
 * => GET 방식이 좋은 점
 *    => URL에 데이터가 포함되기 때문에 URL과 함께 데이터를 포함하여 
 *       다른 사람에게 쉽게 전달할 수 있다.
 *       예) http://www.zdnet.co.kr/news/news_view.asp?artice_id=20161208142417
 *    => 그래서 게시물 조회나 검색은 GET 방식으로 서버에 요청한다.
 *    => 즐겨찾기나 북마크 형태로 현재 페이지의 위치를 저장할 수 있다.      
 */

/* POST 요청 특징
 * => 웹브라우저 주소 창에 데이터가 보이지 않는다.
 *    => URL과 데이터가 분리되어 있기 때문에 데이터를 따로 추출해 볼 수 없다.
 *       => 최소한 웹브라우저 캐시에 데이터가 보관되는 문제는 방지할 수 있다.
 * => 보내는 데이터의 크기에 제한이 없다.
 *    => 게시판 글처럼 큰 용량의 데이터를 보낼 때 사용한다. 
 *    => 또한 이미지 파일과 같은 바이너리 데이터를 보낼 때 사용한다.
 * => POST 방식의 단점
 *    => URL에 데이터가 포함되어 있지 않기 때문에 
 *       즐겨 찾기나 북마트로 현재 페이지를 저장할 수 없다.    
 * 
 */

/* GET vs POST
 * 데이터 전송 형식    => URL에 첨부 vs 메시지 본문에 첨부
 * 보안                => 데이터가 URL에 첨부되기 때문에 웹 브라우저에 임시 보관될 수 있음(보안 취약)
 *                        vs 데이터가 캐시(cache; 임시 보관)되지 않는다.(보안에 양호)
 * 바이너리 전송 가능  => 불가능 vs 가능
 *   (GET 방식은 Base64와 같은 인코딩을 통해 바이너리를 문자화시켜 전송가능)
 * 전송 데이터의 크기  => 8KB 또는 16KB로 제한됨 vs 제한 없음
 *   (웹서버 마다 URL이나 헤더 크기를 제한하기 때문)
 * 사용처              => 조회와 같은 간단한 데이터를 이용한 요청 
 *                        vs 글 등록, 파일 업로드 같은 대량 데이터를 전송할 때
 * 캐시에 저장 여부    => URL과 결과를 저장한다. vs 저장하지 않는다.
 *   (POST는 URL에 데이터가 포함되어 있지 않기 때문에 서버에서 받은 결과를 저장하지 않는다)
 *    
 */















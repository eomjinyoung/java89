/* 주제: POST 요청에서 한글이 깨지는 이유
 * => 사용자가 입력한 데이터 ------> Servlet ------> getParameter("파라미터명") -----> 데이터
 * => getParameter()는 클라이언트가 보낸 값이 ISO-8859-1 방식으로 인코딩 되었다고 간주한다.
 *    그래서 입력한 데이터가 모두 영어라고 간주하고 무조건 2바이트로 만들어 리턴한다.
 *     
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet28")
public class Servlet28 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /* GET 요청으로 데이터 보낼 때,
   * 1) 사용자가 입력한 문자열      
   *    => "ABC012가각간"
   * 2) 웹브라우저가 웹서버에게 보낼 때 UTF-8로 인코딩하여 데이터를 보낸다.    
   *    => {41,42,43,30,31,32,ea,b0,80,ea,b0,81,ea,b0,84}
   * 3) 톰캣 서버 8.0부터는 클라이언트가 보낸 데이터를 UTF-16으로 자동 인코딩함.
   *    => {0041,0042,0043,0030,0031,0032,ac00,ac01,ac04} 
   *    주의!
   *    -------------------------------------------------------------------------------
   *    톰캣 서버 7.x 이하에서는 반드시 server.xml 설정 파일의 Connector 태그에 
   *    URIEncoding 속성을 추가해야 함. 그래야만 GET 요청의 한글 인코딩이 자동 처리됨.
   *    <Connector 
   *      connectionTimeout="20000" 
   *      port="8080" 
   *      protocol="HTTP/1.1" 
   *      redirectPort="8443"
   *      URIEncoding="UTF-8"/>
   *    -------------------------------------------------------------------------------
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    // 값을 꺼낼 때 따로 인코딩 설정을 할 필요가 없다.
    String data1 = request.getParameter("data1");
    
    for (int i = 0; i < data1.length(); i++) {
      out.printf("[%c]-%x\n", data1.charAt(i), (int)data1.charAt(i));
    }
  }
  
  /* POST 요청으로 데이터 보낼 때,
   * 1) 사용자가 입력한 문자열      
   *    => "ABC012가각간"
   * 2) 웹브라우저가 웹서버에게 보낼 때 UTF-8로 인코딩하여 데이터를 보낸다.    
   *    => {41,42,43,30,31,32,ea,b0,80,ea,b0,81,ea,b0,84}
   * 3) 톰캣 서버에서 자동으로 인코딩 해주지 않는다.
   *    그래서 그냥 모든 데이터가 영어라고 간주되어 UTF-16으로 바뀐다.
   *    => {0041,0042,0043,0030,0031,0032,00ea,00b0,0080,00ea,00b0,0081,00ea,00b0,0084}
   *    즉 각 바이트 앞에 00이 붙어서 2바이트가 만들어진다.
   *    ASCII 문자(영어나 숫자인 경우)인 경우에는 정상적인 UTF-16 값이지만,
   *    한글인 경우는 아니다. 
   * 4) 해결책?
   *    getParameter()를 반드시!!! 최초로 호출하기 전에,
   *    먼저 클라이언트에서 보낸 데이터가 어떤 형식으로 인코딩 되었는지 설정해야 한다.
   *    => request.setCharacterEncoding("UTF-8");
   *    그런 후 getParameter()를 호출해야 한다.
   *    만약, getParameter()를 호출한 후에 이 메서드를 호출한다면, 아무 소용이 없다.  
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    // 클라이언트에서 보낸 데이터가 어떤 형식으로 인코딩 되었느지 먼저 설정한다.
    // => 주석을 풀고 테스트 해보라!
    //request.setCharacterEncoding("UTF-8");
    
    String data1 = request.getParameter("data1");
    
    for (int i = 0; i < data1.length(); i++) {
      out.printf("[%c]-%x\n", data1.charAt(i), (int)data1.charAt(i));
    }
  }
  
}










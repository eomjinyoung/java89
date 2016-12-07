/* 주제: 한글 출력이 깨지는 이유
 * => 다음과 같이 getWriter()를 통해 출력스트림을 얻으면,
 *      PrintWriter out = response.getWriter();
 *    이 출력스트림은 텍스트를 출력할 때 UTF-16을 ISO-8859-1로 변환한다.
 *    ISO-8859-1에는 영어와 라틴문자, 숫자, 특수문자 등 
 *    약 200자의 문자에 대해서만 코드 값이 정의되어 있기 때문에 
 *    한글이나, 한자, 일본글자 등은 ISO-8859-1로 변환될 수 없다.
 *    그래서 이런 문자들이 물음표(?)로 출력되는 것이다. 
 * => 해결책?
 *    출력 스트림을 얻기 전에 어떤 타입의 데이터를 출력할 것인지?
 *    어떤 문자집합으로 변환시켜 출력할 것인지? 
 *    지정하면 된다.
 *    response.setContentType("MIME타입;charset=문자집합");
 *    
 * [MIME 표기법]
 * - 데이터종류/애플리케이션명 
 * - 널리 알려진 MIME 표기 
 *   text/html
 *   video/avi
 *   application/msword
 *   image/jpeg
 *   audio/mpeg
 *   application/zip      
 *    
 */
package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/* 주의! 
 * web.xml 파일을 만들 때 meta-complete 속성의 값을 다음과 같이 false로 설정하지 않으면,
 * @WebServlet 애노테이션을 인식하지 못한다.
 * 
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                      http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
  version="3.1"
  metadata-complete="false">
 *
 */
@WebServlet("/servlet06")
public class Servlet06 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    // 출력 스트림을 얻기 전에 출력할 데이터의 종류와 문자집합을 지정해야 한다.
    //response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    out.println("Hello, world!");
    
    response.setContentType("text/plain;charset=UTF-8");
    out.println("안녕하세요");
    out.println("你好");
    out.println("Hallo!");
    out.println("こんにちは");
    
  }
  
}









/* 주제: 임의 폴더에 업로드된 파일을 클라이언트에게 보내기 
 * => 배치 폴더가 아닌 임의의 폴더에 파일을 저장하면,
 *    클라이언트에게 바로 접근불가하다.
 * => 이런 경우, 다운로드를 도와주는 서블릿을 만들어야 한다.
 * => 이렇게 배치 폴더가 아닌 디렉토리에 저장하는 경우가 있는가?
 *    - 실무에서는 여러 웹 서버가 접근할 수 있도록 이 방식을 사용한다.
 *    - 또 다운로드할 때 권한을 검사를 통해 접근을 제한할 때 사용한다.  
 */
package bitcamp.servlet10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet42_download")
public class Servlet42_download extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    try {
      
      String filename = request.getParameter("filename");
      
      // 서버의 특정 폴더에 저장된 파일을 읽기 위한 입력 스트림 객체 준비
      File filepath = new File("/Users/eomjinyoung/git/java89/bit.web01/temp/" + filename);
      BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream(filepath));
      
      // 웹브라우저로 파일을 출력할 출력 스트림 객체 준비
      OutputStream out = response.getOutputStream();
      
      int b = -1;
      while ((b = fileIn.read()) != -1) {
        out.write(b);
      }
      
      out.close();
      fileIn.close();
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
  
}




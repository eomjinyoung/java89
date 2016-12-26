/* 주제: 파일 업로드 처리2 
 * => 배치 폴더가 아닌 임의의 폴더에 저장하기
 */
package bitcamp.servlet10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/servlet/servlet42")
public class Servlet42 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    // 멀티파트 형식에는 다음 문자집합 처리가 소용없다.
    //request.setCharacterEncoding("UTF-8");
    
    // 멀티파트 형식 데이터인지 여부 확인
    if (!ServletFileUpload.isMultipartContent(request)) {
      throw new ServletException("멀티파트 형식이 아닙니다.");
    }
    
    // 클라이언트가 보낸 데이터를 저장할 객체 준비
    // => HDD 에 저장할 거라면, 다음 객체를 생성하라!
    DiskFileItemFactory itemFactory = new DiskFileItemFactory();
    
    // 멀티파트 데이터를 분석 처리할 객체 준비
    // => 이때 생성자 파라미터 값으로 데이터 저장을 처리하는 공장을 넘겨야 한다.
    ServletFileUpload uploadHandler = new ServletFileUpload(itemFactory);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    // 요청 데이터의 분석을 실행한다.
    try {
      // 리턴값: 멀티파트를 분석하여 그 결과를 목록으로 리턴한다.
      List<FileItem> items = uploadHandler.parseRequest(request);
      
      for (FileItem item : items) {
        if (item.isFormField()) { // 일반 폼 항목이면,
          out.printf("%s=%s\n", item.getFieldName(), item.getString("UTF-8"));
        } else { // 파일이면,
          out.printf("%s=%s\n", item.getFieldName(), item.getName());
          
          // 임시 저장소에 있는 파일을 지정된 폴더로 옮긴다.
          // => 임의 폴더에 저장하기
          item.write(new File(
              "/Users/eomjinyoung/git/java89/bit.web01/temp/" 
              + item.getName()));
        }
      }
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
    
  }
  
}




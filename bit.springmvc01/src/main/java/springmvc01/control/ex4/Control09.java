/* 주제: 멀티파트 데이터 다루기
 * => 멀티파트 데이터를 다루는 장비(객체)를 장착(등록)해야 한다. 
 * 
 */
package springmvc01.control.ex4;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Control09 {
  @Autowired ServletContext context;
  
  /* 멀티파트 데이터 다루기
   * => /webapp/ex4/test01form.jsp 로 테스트하라!
   */
  @RequestMapping("/ex4/test01")
  public void test01(String name, int age, boolean work, 
      MultipartFile photo1, MultipartFile photo2, Model model) {
    
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    model.addAttribute("work", work);
    
    // 파일을 넘기지 않아도 MultipartFile 객체를 생성하여 넘긴다. who? DispatcherServlet 
    // 파일이 없으면 파일 크기는 0, 파일명은 빈 문자열이 된다.
    model.addAttribute("photo1_originFilename", photo1.getOriginalFilename());
    model.addAttribute("photo1_filesize", photo1.getSize());
    if (photo1.getSize() > 0) { // 파일이 있다면 저장한다.
      // 웹애플리케이션 실행 경로를 알아내어 그 경로에 파일을 저장한다.
      String filepath = context.getRealPath("/ex4/" + photo1.getOriginalFilename());
      try {
        photo1.transferTo(new File(filepath));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    model.addAttribute("photo2_originFilename", photo2.getOriginalFilename());
    model.addAttribute("photo2_filesize", photo2.getSize());
    if (photo2.getSize() > 0) { 
      String filepath = context.getRealPath("/ex4/" + photo2.getOriginalFilename());
      try {
        photo2.transferTo(new File(filepath));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  
  
}








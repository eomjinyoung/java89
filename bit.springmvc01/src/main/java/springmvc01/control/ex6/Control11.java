/* 주제: 인터셉터 붙이기
 * => 인터셉터?
 *    프론트 컨트롤러(DispatcherServlet)와 페이지 컨트롤러 사이에 끼우는 필터 객체
 *    프론트 컨트롤러와 뷰 컴포넌트(예: JSP) 사이에 끼우는 필터 객체
 * 
 */
package springmvc01.control.ex6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control11 {

  @RequestMapping("/ex6/test01")
  public void test01() {
    System.out.println("/ex6/test01 실행!");
  }
  
 
}








/* 주제: 뷰 컴포넌트 관리자 교체하기
 * => 특정 폴더에서 JSP를 찾도록 기존의 뷰 컴포넌트 관리자를 교체한다.
 * => 스프링 설정파일(dispatcher-servlet.xml)에 해당 객체를 추가한다.
 *    이 객체를 추가하면 기존 객체 대신 새로 추가한 객체를 
 *    뷰 컴포넌트 관리자로 사용할 것이다.
 *  
 */
package springmvc01.control.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control02 {
  
  /* 
   */
  @RequestMapping("/ex2/test01")
  public String test01() {
    
    // 리턴 값은 인클루드/포워드할 뷰 컴포넌트의 경로이다.
    return "/ex2/test01.jsp";
  }
  
  /* 만약 리턴 값을 지정하지 않으면, 
   * 
   */
  @RequestMapping("/ex2/test02")
  public void test02() {
  }
}








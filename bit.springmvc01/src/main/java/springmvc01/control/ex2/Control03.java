/* 주제: GET과 POST 요청 구분하기
 * => @RequestMapping 속성을 이용하여 설정한다.
 *  
 */
package springmvc01.control.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control03 {
  /* ex2/control03.jsp로 테스트 하라! */
  
  @RequestMapping(value="/ex2/get", method=RequestMethod.GET)
  public void get() {
  }
  
  @RequestMapping(value="/ex2/post", method=RequestMethod.POST)
  public void post() {
  }
  
  // method 속성을 지정하지 않으면 get과 post 요청 모두 처리한다.
  @RequestMapping(value="/ex2/all")
  public void all() {
  }
}








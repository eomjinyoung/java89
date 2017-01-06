/* 주제: 파라미터의 존재 여부에 따라 호출을 결정할 수 있다.
 * => @RequestMapping 속성을 이용하여 설정한다.
 *  
 */
package springmvc01.control.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control04 {
  @RequestMapping(value="/ex2/param", params="aaa")
  public void aaa() {
    System.out.println("aaa()");
  }
  
  @RequestMapping(value="/ex2/param", params="bbb")
  public void bbb() {
    System.out.println("bbb()");
  }
  
  @RequestMapping(value="/ex2/param", params={"aaa","bbb"})
  public void aaabbb() {
    System.out.println("aaabbb()");
  }
}








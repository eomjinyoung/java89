/* 주제: 요청 헤더의 존재 여부에 따라 호출을 결정할 수 있다.
 * => @RequestMapping 속성을 이용하여 설정한다.
 *  
 */
package springmvc01.control.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control05 {
  // aaa 요청 헤더가 있어야 하고 그 값이 okok일 때만 호출할 수 있다.
  @RequestMapping(value="/ex2/header", headers="aaa=okok")
  public void aaa() {
    System.out.println("aaa()");
  }
  
  // bbb 요청 헤더가 있기만 하면 된다. 값은 상관없다.
  @RequestMapping(value="/ex2/header", headers="bbb")
  public void bbb() {
    System.out.println("bbb()");
  }
  
  // aaa와 bbb 헤더 모두 있어야 한다. 값은 상관없다.
  @RequestMapping(value="/ex2/header", headers={"aaa","bbb"})
  public void aaabbb() {
    System.out.println("aaabbb()");
  }
}








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
  // aaa 파라미터가 있을 때 호출된다. 값은 상관없다.
  @RequestMapping(value="/ex2/param", params="aaa")
  public void aaa() {
    System.out.println("aaa()");
  }
  
  // bbb 파라미터가 있을 때 호출된다. 단 값이 okok이어야 한다.
  @RequestMapping(value="/ex2/param", params="bbb=okok")
  public void bbb1() {
    System.out.println("bbb()");
  }
  
  // bbb 파라미터가 있을 때 호출된다. 단 값이 nono이어야 한다.
  @RequestMapping(value="/ex2/param", params="bbb=nono")
  public void bbb2() {
    System.out.println("bbb()");
  }
  
  // aaa와 bbb 파라미터가 모두 있을 때 호출된다. 값은 상관없다.
  @RequestMapping(value="/ex2/param", params={"aaa","bbb"})
  public void aaabbb() {
    System.out.println("aaabbb()");
  }
}








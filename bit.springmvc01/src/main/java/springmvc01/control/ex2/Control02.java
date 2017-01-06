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
    
    // 새로 등록한 뷰 컴포넌트 관리자는 리턴 값 앞, 뒤로 경로를 붙이기 때문에
    // JSP 경로를 리턴할 때 이런 것을 고려하라!
    return "ex2/test01";
  }
  
  /* 만약 리턴 값을 지정하지 않으면, 
   * 뷰 URL로 요청 URL을 사용한다.
   * 뷰 컴포넌트 관리자(뷰 리졸버)는 다음 공식에 따라 뷰 URL을 결정한다.
   * => 뷰 URL = 접두어 + 요청URL + 접미사 = "/" + "/ex2/test02 + ".jsp" = /ex2/test02.jsp 
   *    단 앞에 /가 겹쳐 있으면 한 개로 만든다.
   */
  @RequestMapping("/ex2/test02")
  public void test02() {
  }
}








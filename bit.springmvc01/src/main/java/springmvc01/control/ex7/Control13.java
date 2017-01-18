/* 주제: 프로퍼티 에디터를 사용하여 입력 값 다루기
 * => 문자열을 java.util.Date 객체로 자동 변환하기
 * 
 */
package springmvc01.control.ex7;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control13 {

  @RequestMapping("/ex7/test03")
  public void test03(String p1, Date p2) {
    System.out.println(p1);
    System.out.println(p2);
  }
  
  // 페이지 컨트롤러에서 프로퍼티 에디터를 등록한다.
  // -> 단 이 방법은 이 컨트롤러에 대해서만 적용된다.
  // -> 메서드를 만드는 규칙
  //    1) 메서드 이름은 마음대로 
  //    2) 파라미터는 WebDataBinder 타입이어야 한다.
  //    3) 메서드에 @InitBinder를 붙여서 프론트 컨트롤러에게 알려야 한다.
  //       이 메서드가 프로퍼티 에디터를 등록시키는 메서드임을 알린다.
  // -> CustomDateEditor
  //    - 문자열을 java.util.Date 객체로 변환시키는 에디터이다.
  //    - 파라미터 중에서 Date 타입 변수가 있으면 이 에디터를 사용하여 
  //      문자열을 Date 객체로 만든다.
  
  
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

  @InitBinder
  protected void initBinder(WebDataBinder binder) {
      // 이 메서드는 request handler가 호출될 때 마다 먼저 실행된다.
      System.out.println("Control13.initBinder()....");
      dateFormat.setLenient(false);
      
      // String --> Date 타입의 값으로 바꿀 때 
      // CustomDateEditor를 사용하여 바꾸라는 의미이다.
      binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }
  
 
}








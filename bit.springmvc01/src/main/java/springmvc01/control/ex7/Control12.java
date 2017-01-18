/* 주제: 프로퍼티 에디터를 사용하여 입력 값 다루기
 * => 문자열을 java.util.Date 객체로 자동 변환하기
 * 
 */
package springmvc01.control.ex7;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control12 {

  // 입력 파라미터 값은 문자열이다.
  // 이 문자열을 자바 원시 타입으로 자동 변환시킨다. 
  @RequestMapping("/ex7/test01")
  public void test01(String p1, int p2, boolean p3) {
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
  
  // 문자열을 날짜 타입의 값으로 받기?
  // - 스프링 프론트 컨트롤러(DispatcherServlet)는 자바 원시 타입 외에 다른 타입의 값으로는 
  //   변환할 수 없다.
  // - 해결책!
  //   입력 문자열을 특정 타입의 값으로 바꿔주는 프로퍼티 에디터를 별도로 등록해야 한다.
  //   어떻게? 다음 예제를 보라!
  @RequestMapping("/ex7/test02")
  public void test02(String p1, Date p2, int p3) {
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
  
 
}








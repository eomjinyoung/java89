/* 주제: Accept 요청 헤더의 값에 따라 호출을 결정할 수 있다.
 * => @RequestMapping 속성을 이용하여 설정한다.
 * => Accept 요청 헤더? 
 *    웹브라우저가 서버로부터 받기를 원하는 콘텐츠의 MIME 타입이다.
 * => 주의!
 *    Accept 요청 헤더를 분석하여 그에 해당하는 메서드를 찾아 실행시키는 
 *    객체를 따로 등록해야 한다.
 *    다행히 그 객체의 클래스 이름을 몰라도 된다. 
 *    왜? 스프링에서 <context:component-scan> 태그의 경우처럼 단축 태그를 제공한다.
 *    이 기능을 활성화시키는 객체를 등록하는 단축 태그는?
 *    <mvc:annotation-driven/> 
 *  
 */
package springmvc01.control.ex2;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control06 {
  // Accept 요청 헤더의 값이 application/json 일 때 호출된다.
  @RequestMapping(value="/ex2/accept", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
  public String json() {
    return "ex2/json";
  }
  
  // Accept 요청 헤더의 값이 text/html 일 때 호출된다.
  @RequestMapping(value="/ex2/accept", produces=MediaType.TEXT_HTML_VALUE)
  public String html() {
    return "ex2/html";
  }
  
//Accept 요청 헤더의 값이 text/plain 일 때 호출된다.
  @RequestMapping(value="/ex2/accept", produces=MediaType.TEXT_PLAIN_VALUE)
  public String plain() {
    return "ex2/plain";
  }
  
}








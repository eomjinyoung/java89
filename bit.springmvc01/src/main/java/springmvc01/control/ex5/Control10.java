/* 주제: 리턴 값 다루기
 * 
 */
package springmvc01.control.ex5;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control10 {
  @Autowired ServletContext context;
  
  /* 뷰 컴포넌트(JSP) URL 리턴하기
   * => String 리턴
   */
  @RequestMapping("/ex5/test01")
  public String test01() {
    // DispatcherServlet(프론트 컨트롤러)은 요청 핸들러(페이지컨트롤러의 메서드)가 
    // 리턴하는 값을 파악하여, String이라면, 뷰 컴포넌트 URL로 간주한다.
    return "ex5/jsp01";
  }
  
  /* 뷰 컴포넌트(JSP) URL 리턴하기
   * => ModelAndView 리턴
   */
  @RequestMapping("/ex5/test02")
  public ModelAndView test02() {
    // ModelAndView 객체에 뷰 컴포넌트의 URL을 저장하여 리턴한다.
    ModelAndView mv = new ModelAndView();
    mv.setViewName("ex5/jsp02");
    return mv;
  }
  
  /* 뷰 컴포넌트를 경유하지 않고 바로 콘텐츠를 클라이언트에게 보내기
   * => 문자열로 콘텐츠를 리턴하라!
   * => 문자열이 콘텐츠 임을 표시하기 위해 @ResponseBody 애노테이션을 붙여라!
   */
  @RequestMapping(path="/ex5/test03", produces="text/html;charset=UTF-8") // value나 path나 같다!
  @ResponseBody
  public String test03() {
    return "<html><body><h1>test03</h1><p>ABC123가나다</p></body></html>";
  }
  
  /* 뷰 컴포넌트를 경유하지 않고 바로 콘텐츠를 클라이언트에게 보내기 II
   * => ResponseEntity 객체를 리턴한다.
   * => DispatcherServlet(프론트 컨트롤러)은 리턴 값의 타입이 ResponseEntity이면,
   *    JSP 실행하지 않고 이 객체 들어있는 콘텐츠와 헤더를 가지고 
   *    클라이언트로 바로 출력한다.
   */
  @RequestMapping(path="/ex5/test04") // value나 path나 같다!
  public ResponseEntity<String> test04() {
    // 응답 헤더 추가
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "text/html;charset=UTF-8");
    
    return new ResponseEntity(
        "<html><body><h1>test04</h1><p>ABC123가나다</p></body></html>",
        headers,
        HttpStatus.OK);
  }
 
}








/* 주제: 페이지 컨트롤러 만들기
 * => 클래스 선언부에 @Controller를 붙인다.
 *    @Component를 붙여도 되지만 페이지 컨트롤러의 경우 
 *    객체의 역할을 명시하기 위해 @Controller 애노테이션을 사용한다.
 *    객체의 이름은 생략해도 된다.
 * => 클라이언트 요청에 대해 호출될 메서드를 만들고,
 *    메서드 선언부에 @RequestMapping을 붙인다.
 *    그리고 URL을 부여한다.
 *    즉 클라이언트가 해당 URL을 요청하면 이 메서드가 호출될 것이다.
 *  
 */
package springmvc01.control.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control01 {
  
  /* URL 요청을 처리할 메서드 만들기
   - 이 메서드를 Request Handler라 부른다.
   - @RequestMapping(url) 애노테이션을 붙여라.
   - URL을 부여할 때 확장자를 붙이지 말라! 
     그래야만 나중에 확장자를 바꾸더라도 영향을 받지 않는다.
   - 프론트 컨트롤러가 이 메서드를 찾을 때 확장자를 제외한 부분을 알아서 조회한다.
   */
  @RequestMapping("/ex1/test01")
  public String test01() {
    
    // 리턴 값은 인클루드/포워드할 뷰 컴포넌트의 경로이다.
    return "/ex1/test01.jsp";
  }
  
  /* 만약 리턴 값을 지정하지 않으면, 
   * 기본으로 해당 URL의 폴더로 가서 뷰 컴포넌트를 찾는다.
   * 단 현재 URL에서 마지막 폴더에 요청한 URL 경로가 덧붙여진다.
   * "/ex1/test02" ---> "/ex1/ex1/test02" 
   */
  @RequestMapping("/ex1/test02")
  public void test02() {
  }
}

/* 구동 원리
 * 1) 웹브라우저는 톰캣서버에게 /ex1/test01.do 요청을 한다.
 * 2) 톰캣 서버는 *.do 요청을 처리하는 서블릿을 실행한다.
 * 3) DispatcherServlet은 자신이 갖고 있는 스프링 IoC 컨테이너에서 
 *    "/ex1/test" 요청을 처리할 객체와 그 메서드를 찾는다.
 * 4) 메서드를 호출하기 전에 그 메서드가 파라미터 값으로 무엇을 원하는지 조사한다.
 * 5) 파라미터 값을 준비하고, 메서드를 호출할 때 넘긴다.
 * 6) 메서드가 리턴한 값을 가지고 JSP를 찾아 인클루드한다.
 * 7) 응답을 완료한다.
 * 8) 톰캣서버는 DispatcherServlet이 완료한 응답을 웹브라우저에게 보낸다.
 * 9) 웹브라우저는 서버로부터 받은 콘텐츠를 화면에 그린다.(렌더링 한다)
 */






















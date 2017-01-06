/* 주제: 요청 핸든러의 파라미터 다루기 I 
 * 
 */
package springmvc01.control.ex3;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control07 {
  /* HttpServletRequest와 HttpServletResponse, HttpSession 얻기 
   * => 메서드의 파라미터로 선언하면 프론트 컨트롤러(DispatcherServlet)가
   *    메서드를 호출하기 전에 그 메서드의 파라미터를 분석하여,
   *    그에 해당하는 값을 넘겨준다.
   */
  @RequestMapping("/ex3/test01")
  public String test01(
      HttpServletRequest request, 
      HttpServletResponse response, 
      HttpSession session) {
    System.out.println(request);
    System.out.println(response);
    System.out.println(session);
    
    /* 주의!
     * HttpServletResponse 객체를 파라미터로 받게 되면, 
     * 출력의 책임을 메서드에 떠 넘기기 때문에
     * 리턴 값을 void로 해서는 안된다. 명확히 JSP url을 지정해야 한다.
     */
    return "ex3/test01";
  }
  
  /* ServletContext 객체 얻기 
   * => 이 객체는 파라미터로 받을 수 없다.
   * => 의존 객체로 주입 받아라.
   *    @Autowired 애노테이션을 사용하여 인스턴스 변수로 선언하라!
   */
  
  @Autowired ServletContext context;
  
  @RequestMapping("/ex3/test02")
  public void test02(/*ServletContext context*/) {
    System.out.println(context);
  }
  
  /* 요청 파라미터 값 받기
   * => 파라미터 변수를 선언하고 그 앞에 @RequestParam("파라미터명") 을 붙여라
   * => 기본은 필수입력이다. 파라미터에 해당 이름의 값이 없으면 예외가 발생한다.
   */
  @RequestMapping("/ex3/test03")
  public void test03(
      @RequestParam("name") String name,
      @RequestParam("age") int age, /* 프론트 컨트롤러가 문자열을 자바 원시 타입으로 자동 변환해 준다 */ 
      @RequestParam("work") boolean work) {
    System.out.println(name);
    System.out.println(age);
    System.out.println(work);
  }
  
  /* 요청 파라미터 값 필수/선택 지정하기
   * => 파라미터 항목이 없더라도 오류가 발생하지 않는다.
   * => 주의!
   *    null 값을 문자열이 아닌 자바 원시 타입으로 바꿀 수 없기 때문에 예외가 발생한다.
   *    해결책? 다음 메서드를 봐라!
   */
  @RequestMapping("/ex3/test04")
  public void test04(
      @RequestParam(value="name", required=false) String name,
      @RequestParam(value="age", required=false) int age,  
      @RequestParam(value="work", required=false) boolean work) {
    System.out.println(name);
    System.out.println(age);
    System.out.println(work);
  }
  
  /* 요청 파라미터 값 필수/선택 지정하기
   * => 만약 파라미터의 타입이 String이 아니라 자바 원시 타입이라면,
   *    요청 파라미터 값이 없을 때 예외가 발생하는데,
   *    이런 경우에는 required=false 대신 defaultValue 속성을 사용하여 기본 값을 지정하라!
   *    이 때 기본 값은 요청 파라미터처럼 문자열로 표현해야 한다.
   */
  @RequestMapping("/ex3/test05")
  public void test05(
      @RequestParam(value="name", required=false) String name,
      @RequestParam(value="age", defaultValue="0") int age,  
      @RequestParam(value="work", defaultValue="false") boolean work) {
    System.out.println(name);
    System.out.println(age);
    System.out.println(work);
  }
  
  /* @RequestParam에서 파라미터 명 생략
   * => 파라미터 명이 변수명과 같다면 생략할 수 있다.
   */
  @RequestMapping("/ex3/test06")
  public void test06(
      @RequestParam(required=false) String name,
      @RequestParam(defaultValue="0") int age,  
      @RequestParam(defaultValue="false") boolean work) {
    System.out.println(name);
    System.out.println(age);
    System.out.println(work);
  }
  
  /* @RequestParam 생략
   * => 파라미터 명이 변수명과 같고, 선택 항목으로 만들고 싶다면 생략해도 된다.
   *    즉 생략하면 다음과 같다.
   *        @RequestParam(value="name",required=false) String name
   *        ==> String name
   * => 단 기본 값을 설정해야 하는 경우에는 생략할 수 없다.
   */
  @RequestMapping("/ex3/test07")
  public void test07(String name, int age, boolean work) {
    System.out.println(name);
    System.out.println(age);
    System.out.println(work);
  }
  
  /* 값 객체(Value Object)를 파라미터로 선언하면,
   * => 그 값 객체의 프로퍼티 이름과 일치하는 요청 파라미터 값을 찾아 자동으로 꼽아준다.
   */
  @RequestMapping("/ex3/test08")
  public void test08(Student student) {
    System.out.println(student);
  }
}








/* 주제: 요청 핸든러의 파라미터 다루기 II 
 * 
 */
package springmvc01.control.ex3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control08 {
  /* JSP에 데이터 보내기
   * => 기존 방식: HttpServletRequest 보관소에 직접 담는다.
   */
  @RequestMapping("/ex3/test11")
  public void test11(HttpServletRequest request) {
    request.setAttribute("name", "홍길동");
    request.setAttribute("age", 20);
    request.setAttribute("tel", "1111-2222");
  }
  
  /* JSP에 데이터 보내기
   * => 스프링 방식: Model, Map 객체에 담아서 전달하면, 
   *    프론트 컨트롤러가 이것을 꺼내 다시 HttpServletRequest 보관소에 담는다. 
   */
  @RequestMapping("/ex3/test12")
  public void test12(Map<String,Object> map) {
    map.put("name", "홍길동");
    map.put("age", 20);
    map.put("tel", "1111-2222");
  }
  
  /* JSP에 데이터 보내기
   * => 스프링 방식: Model, Map 객체에 담아서 전달하면, 
   *    프론트 컨트롤러가 이것을 꺼내 다시 HttpServletRequest 보관소에 담는다. 
   */
  @RequestMapping("/ex3/test13")
  public void test13(Model model) {
    model.addAttribute("name", "홍길동");
    model.addAttribute("age", 20);
    model.addAttribute("tel", "1111-2222");
  }
  
  /* JSP에 데이터 보내기
   * => 스프링 방식: Model, Map 객체에 담아서 전달하면, 
   *    프론트 컨트롤러가 이것을 꺼내 다시 HttpServletRequest 보관소에 담는다. 
   */
  @RequestMapping("/ex3/test14")
  public Map test14() {
    ModelMap model = new ModelMap();
    model.addAttribute("name", "홍길동");
    model.addAttribute("age", 20);
    model.addAttribute("tel", "1111-2222");
    return model;
  }
  
  /* JSP에 데이터 보내기
   * => 스프링 방식: Model, Map 객체에 담아서 전달하면, 
   *    프론트 컨트롤러가 이것을 꺼내 다시 HttpServletRequest 보관소에 담는다. 
   */
  @RequestMapping("/ex3/test15")
  public ModelAndView test15() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", "홍길동");
    mv.addObject("age", 20);
    mv.addObject("tel", "1111-2222");
    return mv;
  }
  
  /* JSP에 데이터 보내기
   * => ModelAndView는 데이터와 JSP URL을 한 번에 지정할 수 있다. 
   */
  @RequestMapping("/ex3/test16")
  public ModelAndView test16() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", "홍길동");
    mv.addObject("age", 20);
    mv.addObject("tel", "1111-2222");
    mv.setViewName("ex3/okok");
    return mv;
  }
  
}








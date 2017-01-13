package springmvc01.control.ex6;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    System.out.println("MyInterceptor.preHandler()");
    // true: 다음 인터셉터를 호출한다. 없으면 페이지 컨트롤러의 메서드 호출한다.
    // false: 바로 응답한다.
    return true;
  }
  
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    System.out.println("MyInterceptor.postHandle()");
  }
  
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    System.out.println("MyInterceptor.afterCompletion()");
  }
}

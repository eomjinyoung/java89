/* 주제: 서블릿 컨테이너에서 특정 사건이 발생했을 때 보고 받는 객체 만들기
 * => 특정 사건의 발생을 "Event"라 부른다.
 * => 보고 받는 객체를 다른 말로 "Listener"라 부른다.
 * => 이벤트가 발생했을 때 호출될 메서드는 인터페이스에 정의되어 있다.
 * => 개발자가 할 일?
 *    - 보고 받고 싶은 이벤트의 인터페이스를 구현하면 된다.
 * => 서블릿 컨테이너에서 발생되는 이벤트와 그 호출 규칙
 *    1) 웹 애플리케이션이 시작되거나 종료될 때 발생하는 이벤트
 *      => ServletContextListener
 *    2) ServletContext 보관소에 데이터를 저장하거나 꺼낼 때 발생하는 이벤트
 *      => ServletContextAttributeListener
 *    3) ServletRequest 객체가 생성되거나 소멸될 때 발생하는 이벤트  
 *      => ServletRequestListener
 *    4) ServletRequest 보관소에 데이터를 저장하거나 꺼낼 때 발생하는 이벤트
 *      => ServletRequestAttributeListener
 *    5) HttpSession 객체가 생성되거나 소멸될 때 발생하는 이벤트
 *      => HttpSessionListener
 *    6) HttpSession 보관소에 데이터를 저장하거나 꺼낼 때 발생하는 이벤트
 *      => HttpSessionAttributeListener
 *    
 * => 리스너 등록하기
 *    1) DD 파일(web.xml)에 등록하기
          <listener>
            <listener-class>bitcamp.servlet7.Listener1</listener-class>
          </listener>    
 *    2) 애노테이션으로 등록하기
          @WebListener       
 * 
 */
package bitcamp.servlet7;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 웹 애프리케이션의 시작/종료 이벤트를 보고 받고 싶다.
@WebListener
public class Listener1 implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // 이 메서드는 웹 애플리케이션이 시작된 후 즉시 호출된다.
    // => 웹 애플리케이션이 사용할 기본 도구를 준비시키는 코드를 이 메서드에는 둔다.
    System.out.println("ServletContextListener.contextInitialized()");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    // 이 메서드는 웹 애플리케이션을 종료하기 직전에 호출된다.
    // => contextInitialized()에서 준비한 도구를 해제시키는 코드를 이 메서드에 둔다.
    System.out.println("ServletContextListener.contextDestroyed()");
  }
  
}




















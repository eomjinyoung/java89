/* 주제: 스프링 IoC 사용 후
 * => 객체 생성 및 관리를 스프링 IoC 컨테이너에서 한다. 
 */
package step30.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex2/application-context.xml");
    
    Control c = iocContainer.getBean(Control.class);
    
    System.out.println("---------------------------");
    c.testPlus();
    System.out.println("***************************");
  }

}

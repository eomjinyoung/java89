/* 주제: 애노테이션을 사용하여 AOP 필터 꼽기
 */
package step30.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex5/application-context.xml");
    
    Control c = iocContainer.getBean(Control.class);
    c.testPlus();
  }

}

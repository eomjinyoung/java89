/* 주제: AOP 필터에서 메서드의 파라미터 값이 리턴 값을 알아내기
 */
package step30.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex4/application-context.xml");
    
    Control c = iocContainer.getBean(Control.class);
    c.testPlus();
  }

}

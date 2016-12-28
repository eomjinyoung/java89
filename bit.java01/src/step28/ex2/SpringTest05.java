/* 주제: 객체 생성
 * => 설정을 전담하는 클래스를 사용하여 생성할 객체 설정 
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest05 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    
    Car obj1 = (Car)iocContainer.getBean("c1");
    if (obj1 != null) {
      System.out.println("오호라.. 객체를 생성했네");
    }
    
  }
}









/* 주제: 스태틱 팩토리 메서드를 통해 객체 준비하기 
 */
package step28.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest20 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex5/application-context20.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("d1"));
    System.out.println(iocContainer.getBean("d1").getClass());
  }
}








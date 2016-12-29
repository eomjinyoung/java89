/* 주제: Map 의존 객체 주입하기 
 */
package step28.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest19 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex4/application-context19.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("c1"));
  }
}








/* 주제: FactoryBean을 통해 객체 준비하기 
 */
package step28.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest22 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex5/application-context22.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("obj1"));
  }
}








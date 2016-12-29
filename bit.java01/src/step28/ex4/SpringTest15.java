/* 주제: 의존 객체 주입하기 
 */
package step28.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest15 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex4/application-context15.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("c1"));
    System.out.println(iocContainer.getBean("c2"));
    
    Car c1 = (Car)iocContainer.getBean("c1");
    Car c2 = (Car)iocContainer.getBean("c2");
    if (c1.getEngine() != c2.getEngine())
      System.out.println("c1.engine != c2.engine");
  }
}








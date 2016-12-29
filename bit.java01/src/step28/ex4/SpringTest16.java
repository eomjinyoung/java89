/* 주제: 배열 의존 객체 주입하기 
 */
package step28.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest16 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex4/application-context16.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("c1"));
    System.out.println(iocContainer.getBean("c2"));
  }
}








/* 주제: 생성자 호출하여 값 저장하기 
 */
package step28.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest13 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex3/application-context13.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("c1"));
    System.out.println(iocContainer.getBean("c2"));
    System.out.println(iocContainer.getBean("c3"));
    System.out.println(iocContainer.getBean("c4"));
    System.out.println(iocContainer.getBean("c5"));
    System.out.println(iocContainer.getBean("c6"));
    System.out.println(iocContainer.getBean("c7"));
    System.out.println(iocContainer.getBean("c8"));
    System.out.println(iocContainer.getBean("c9"));
    System.out.println(iocContainer.getBean("c10"));
  }
}








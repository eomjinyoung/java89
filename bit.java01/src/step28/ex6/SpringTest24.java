/* 주제: String 또는 원시 타입이 아닌 프로퍼티 값을 지정하는 방법 
 * => 직접 개발자가 문자열을 Date 객체로 변환해야 한다.
 */
package step28.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest24 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex6/application-context24.xml");
    
    System.out.println("----------------------");
    //System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}








/* 주제: 객체 생성
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest04 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context.xml");
    
    Car obj1 = (Car)iocContainer.getBean("c1");
    if (obj1 != null) {
      System.out.println("오호라.. 객체를 생성했네");
    }
    
    // 주어진 이름과 일치하는 객체가 없다면 예외 발생!
    Car obj2 = (Car)iocContainer.getBean("c2");
  }
}








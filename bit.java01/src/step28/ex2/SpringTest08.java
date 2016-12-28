/* 주제: 객체 생성 - id 속성을 지정하지 않았을 때, name 속성 값을 사용한다.
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest08 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context08.xml");

    // getBean() 메서드를 호출할 때는 기본 이름이나 별명을 모두 사용할 수 있기 때문에
    // id로 객체 이름을 지정하든,
    // name으로 객체 이름을 지정하든 상관없다.
    Car a1 = (Car)iocContainer.getBean("a1");
    Car b1 = (Car)iocContainer.getBean("b1");
    Car b2 = (Car)iocContainer.getBean("b2");
    
    if (a1 != b1) System.out.println("a1 != b1");
    if (b1 == b2) System.out.println("b1 == b2");
    
    
  }
}








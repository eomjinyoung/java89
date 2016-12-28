/* 주제: 객체 생성 - name으로 여러 개의 별명을 지정하기
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest07 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context07.xml");
    
    Car a1 = (Car)iocContainer.getBean("a1");
    Car a2 = (Car)iocContainer.getBean("a2");
    Car a3 = (Car)iocContainer.getBean("a3");
    Car a4 = (Car)iocContainer.getBean("a4");
    
    if (a1 == a2) System.out.println("a1 == a2");
    if (a2 == a3) System.out.println("a2 == a3");
    if (a3 == a4) System.out.println("a3 == a4");
    
    Car b1 = (Car)iocContainer.getBean("b1");
    Car b2 = (Car)iocContainer.getBean("b2");
    Car b3 = (Car)iocContainer.getBean("b3");
    Car b4 = (Car)iocContainer.getBean("b4");
    
    if (b1 == b2) System.out.println("b1 == b2");
    if (b2 == b3) System.out.println("b2 == b3");
    if (b3 == b4) System.out.println("b3 == b4");
    
    if (a1 != b1) System.out.println("a1 != b1");
    
    // id는 여러 개를 지정할 수 었다. id 값 모두 한 개의 값으로 취급한다.
    // 따라서 "d1"이라는 객체는 없다.
    //System.out.println(iocContainer.getBean("d1")); // 예외 발생!
    
    // 즉 "d1 d2"가 객체의 이름이다.
    System.out.println(iocContainer.getBean("d1 d2")); // OK!
    
  }
}








/* 주제: 객체 생성 - name 속성과 id 속성의 차이
 * - id 속성    : 객체를 식별할 때 사용하는 기본 이름이다.
 * - name 속성  : 객체를 식별할 때 사용하는 별명이다.
 * - 그러나 객체를 찾을 때는 구분할 필요가 없다.
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest06 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context06.xml");
    
    // id 값으로 객체를 찾을 수 있다.
    Car obj1 = (Car)iocContainer.getBean("c1");
    
    // 또한 객체의 별명인 name 값으로도 찾을 수 있다. 
    Car obj2 = (Car)iocContainer.getBean("c2");
    
    System.out.println(obj1);
    System.out.println(obj2);
    
    // 스프링 IoC 컨테이너는 기본으로 객체를 한 개만 생성한다.
    // 따라서 두 객체는 같은 인스턴스이다.
    if (obj1 == obj2) {
      System.out.println("obj1 == obj2");
    }
    
  }
}








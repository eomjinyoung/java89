/* 주제: @Component 애노테이션이 붙은 클래스의 객체를 자동 생성하기
 * => 주의사항!
 *    @Component를 통해 객체를 자동 생성할 때는
 *    @Autowired가 붙은 변수에 값을 넣을 때 셋터 메서드를 호출하지 않고,
 *    직접 넣는다. private 변수라 하더라도!
 *    이 부분이 객체지향의 캡슐화 기능을 깨뜨린다고 많은 개발자로부터 비난을 받고 있다.
 *    이 부분은 반반으로 갈려서 논란이 일고 있는데,
 *    개발자가 각자 판단하라!
 * => @Component 외에 같은 기능을 하는 애노테이션이 여럿 있다.
 *    보통 객체의 역할을 구분하기 위해 사용한다.
 *    @Service    : 비즈니스 로직을 처리하는 클래스에 대해 붙인다.
 *    @Controller : MVC 구조에서 페이지 컨트롤러 역할을 하는 클래스에 대해 붙인다.
 *    @Repository : DAO 역할을 클래스에 대해 붙인다.
 *    
 */
package step28.ex14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest36 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex14/application-context36.xml");
    
    System.out.println("----------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
      System.out.println(iocContainer.getBean(name));
      System.out.println();
    }
    
  }
}








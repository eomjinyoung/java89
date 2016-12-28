/* 주제: 익명 객체의 기본 이름과 별명 
 * => 객체의 이름을 id 또는 name으로 지정하지 않으면,
 *    다음과 같이 "클래스명 + 인덱스"가 기본 이름이 된다.
 *    예) step28.ex2.Car#0
 * => 같은 클래스의 객체가 여러 개 있을 경우, 
 *    첫 번째 객체에는 "클래스명"이 별명으로 추가된다.
 *    예) step28.ex2.Car 
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest11 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context11.xml");

    System.out.printf("객체 개수 = %d\n", iocContainer.getBeanDefinitionCount());
    System.out.println("-------------------");
    
    // IoC 컨테이너에 저장된 객체의 기본 이름을 알아내기
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
      // 해당 객체의 별명을 알아내기
      String[] aliases = iocContainer.getAliases(name);
      for (String alias : aliases) {
        System.out.printf("--> %s\n", alias);
      }
    }
    System.out.println("-------------------");
    
    
    
  }
}








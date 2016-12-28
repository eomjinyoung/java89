/* 주제: IoC 컨테이너의 내부 들여다보기 
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest09 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context08.xml");

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








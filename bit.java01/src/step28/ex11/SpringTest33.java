/* 주제: <context:annotation-config/>로 등록한 객체 알아내기
 * => 이 태그는 애노테이션을 처리할 객체를 등록하는 일을 한다.
 */
package step28.ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest33 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex11/application-context32.xml");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name));
    }
  }
}








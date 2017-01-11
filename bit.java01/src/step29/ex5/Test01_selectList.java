/* 주제: Mybatis를 Spring 프레임워크와 연동하기
 * 1) SqlSessionFactory 객체를 만들어 줄 공장 객체를 스프링 설정 파일에 등록해야 한다.
 *    - 
 */
package step29.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01_selectList {
  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step29/ex5/application-context.xml");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name));
    }
  }
}








/* 주제: 스프링 IoC 컨테이너 준비3
 * => XML 설정 파일 대신에 설정을 전담하는 클래스를 사용하여 IoC 컨테이너를 준비한다. 
 */
package step28.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest03 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    // => 설정을 전담하는(@Configuration이 붙은) 클래스의 타입을 생성자에 넘긴다.
    
    System.out.println("실행완료!");
    
  }
}









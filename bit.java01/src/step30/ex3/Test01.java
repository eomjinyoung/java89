/* 주제: AOP를 이용하여 plus(), minus() 전 후에 필터 붙이기.
 * 1) AOP 라이브러리 등록
 *   - build.gradle 변경: aspectj-weaver 의존 라이브러리 추가
 *   - "gradle eclipse" 실행
 *   - 프로젝트 리프래시
 * 2) AOP 필터 객체 등록
 *   - 메서드 호출 전/후에 실행될 객체 등록
 */
package step30.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex3/application-context.xml");
    
    Control c = iocContainer.getBean(Control.class);
    c.testPlus();
  }

}

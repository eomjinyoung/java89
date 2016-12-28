/* 주제: 스프링 IoC 컨테이너 준비1
 * => XML 설정 파일을 이용하여 스프링 IoC 컨테이너 객체를 준비한다.
 * => IoC (Inversion of Control)?
 *    - 역제어라부른다.
 *    - 명령은 위에서 아래서 씌여진 순서대로 실행한다.
 *      그런데 이 흐름에 역행하는 경우를 말한다.
 *    - 예) 이벤트 처리, 의존 객체 주입(Dependency Injection; DI)
 * => 이벤트 처리가 IoC의 예라고?
 *    - 이벤트가 발생하면 현재의 실행 흐름에 상관없이,
 *      지정된 메서드가 호출된다.
 * => 의존 객체 주입이 IoC의 예라고?
 *    - 보통 사용할 객체는 사용자 클래스측에서 객체를 생성하여 사용한다.
 *    - 그런데 사용할 객체를 외부에서 주입 받는 방식이기 때문이다.
 *    - 의존 객체를 외부에서 관리하기 때문에 사용하는 쪽에서는
 *      객체 생성과 관리에 대한 코드를 줄일 수 있다.
 * => IoC 컨테이너? 
 *    - 객체의 생성과 소멸을 관리하고,
 *    - 그 객체를 사용하는 쪽에 자동으로 주입해주는 역할을 한다.
 *    - DI 컨테이너라고도 부른다.
 * => 스프링 IoC 컨테이너 구현체의 종류
 *    - ApplicationContext 인터페이스를 구현해야 한다.
 *    1) ClassPathXmlApplicationContext
 *       - 스프링 설정 파일을 자바 클래스 경로에서 찾는다.
 *    2) FileSystemXmlApplicationContext
 *       - 스프링 설정 파일을 OS 파일 시스템 경로에서 찾는다.
 *    3) XmlWebApplicationContext
 *       - 스프링 설정 파일을 웹 애플리케이션 경로(/WEB-INF)에서 찾는다.
 */
package step28.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest01 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex1/application-context.xml");
    System.out.println("실행완료!");
    
  }
}
/* 클래스 경로
 * => JavaVM은 다음 순서로 클래스를 찾는다. 
 * 1) 부트스트랩(bootstrap) - JRE에서 제공하는 클래스. jre/lib 폴더를 뒤진다.
 * 2) JRE 확장 라이브러리 - JRE의 lib/ext 폴더를 뒤진다.
 * 3) CLASSPATH - OS 환경 변수의 경로 또는 JVM을 실행할 때 설정한 경로를 뒤진다.
 * 
 * 따라서 위 예제에서 application-context.xml라는 스프링 설정 파일을 찾을 때
 * $프로젝트폴더/bin 폴더를 뒤진다. 
 */









/* 역할: 스프링 XML 설정 파일을 대신하는 클래스
 * 
 */
package step28.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  
  @Bean
  public Car c1() {
    // 스프링 IoC 컨테이너는 이 메서드를 호출하여 리턴 한 값을 저장한다.
    // 객체를 저장할 때 메서드의 이름을 key로 사용한다.
    return new Car();
  }
}








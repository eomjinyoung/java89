/* 주제: 타입으로 객체 찾기 
 */
package step28.ex2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest10 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex2/application-context08.xml");

    // 단 해당 타입의 객체가 한 개일 때만 유효한다.
    // 여러 개 있을 경우 예외가 발생한다.
    //Car obj1 = iocContainer.getBean(Car.class); // 예외 발생!
    
    // 해당 타입의 객체가 여러 개 있다면,
    // 다음 메서드를 사용하여 꺼내라.
    Map<String,Car> carMap = iocContainer.getBeansOfType(Car.class);
    Set<Entry<String,Car>> entrySet =  carMap.entrySet();
    for (Entry<String,Car> entry : entrySet) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
  }
}








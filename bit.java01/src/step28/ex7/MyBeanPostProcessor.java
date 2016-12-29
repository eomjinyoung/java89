/* 역할: 빈(=객체=인스턴스)을 생성한 후, 뒤처리 하는 객체
 * => org.springframework.beans.factory.config.BeanPostProcessor 규칙에 따라 
 *    클래스를 작성해야 한다.
 * => 그리고 이 객체를 생성한다.
 * => 스프링 IoC 컨테이너는 객체를 만든 후 이 뒤처리를 전담하는 객체를 실행한다.
 */
package step28.ex7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
  
  public MyBeanPostProcessor() {
    System.out.println("MyBeanPostProcessor()");
  }
  
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.printf("postProcessBeforeInitialization() : %s\n", beanName);
    System.out.println(bean);
    if (bean instanceof Car) {
      Car car = (Car)bean;
      switch (car.getModel()) {
      case "소나타": car.setCc(1980); break;
      case "티코": car.setCc(900); break;
      case "그랜저": car.setCc(3500); break;
      }
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.printf("postProcessAfterInitialization() : %s\n", beanName);
    System.out.println(bean);
    return bean;
  }

}

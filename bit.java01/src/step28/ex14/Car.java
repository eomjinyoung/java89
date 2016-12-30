/* 주제: @Component 애노테이션 사용법
 * => <bean> 태그를 사용하지 않고 객체를 생성하고 싶다면,
 *    해당 클래스 선언에 @Component 애노테이션을 붙여라!
 * 
 */
package step28.ex14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("c1") // 객체를 저장할 때 사용할 이름을 지정할 수 있다.
@Component // 객체의 이름을 지정하지 않으면 내부적으로 정한 규칙에 따라 자동으로 부여된다.
public class Car {
  private String model; 
  private String maker; 
  private int cc;       
  
  @Autowired
  private Engine engine;

  public Car() {
    System.out.println("Car()");
  }
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", engine=" + engine + "]";
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    System.out.println("setModel()");
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    System.out.println("setMaker()");
    this.maker = maker;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    System.out.println("setCc()");
    this.cc = cc;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    System.out.println("setEngine()");
    this.engine = engine;
  }
  
  
}

/* 주제: 셋터 메서드에 @Autowired를 붙이면 해당 객체를 찾아 자동으로 호출한다.
 * 
 */
package step28.ex8;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
  String model; 
  String maker; 
  int cc;       
  Engine engine;
  
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
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public Engine getEngine() {
    return engine;
  }

  /* 야! 스프링 IoC 컨테이너. Engine 객체를 찾아보고 있으면 이 메서드를 호출해서 넣어줘!
   */
  @Autowired
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

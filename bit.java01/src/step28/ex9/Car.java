/* 주제: 셋터 메서드 대신 인스턴스 변수에 @Autowired를 붙여도 된다.
 * 
 */
package step28.ex9;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
  String model; 
  String maker; 
  int cc;       
  @Autowired Engine engine;
  
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

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

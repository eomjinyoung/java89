/* 주제: required의 값을 false로 설정하면 해당 항목은 선택항목으로 바뀐다.
 *       즉 해당 변수에 넣을 인스턴스가 없어도 예외를 발생시키지 않는다. 
 * 
 */
package step28.ex10;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
  String model; 
  String maker; 
  int cc;       
  @Autowired(required=false) Engine engine;
  
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

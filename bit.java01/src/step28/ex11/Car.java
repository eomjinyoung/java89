/* 주제: @Qualifier 를 사용하여 주입할 객체의 이름을 지정할 수 있다. 
 * 
 */
package step28.ex11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
  String model; 
  String maker; 
  int cc;       
  
  @Autowired 
  @Qualifier("e2") 
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

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

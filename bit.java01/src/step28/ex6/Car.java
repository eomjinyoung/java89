package step28.ex6;

import java.util.Date;

public class Car {
  String model; // 프로퍼티가 아니다. 필드(field)라고 부른다.
  String maker; // 프로퍼티가 아니다. 필드라고 부른다.
  int cc;       // 프로퍼티가 아니다. 필드라고 부른다.
  Date madeDate;
  Engine engine;
  
  public Car() {
    System.out.println("Car()");
  }
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", madeDate=" + madeDate + ", engine=" + engine
        + "]";
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
  public Date getMadeDate() {
    return madeDate;
  }
  public void setMadeDate(Date madeDate) {
    System.out.println("setMadeDate()");
    this.madeDate = madeDate;
  }
  public Engine getEngine() {
    return engine;
  }
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

package step28.ex4;

import java.util.Arrays;

public class Car2 {
  String model; // 프로퍼티가 아니다. 필드(field)라고 부른다.
  String maker; // 프로퍼티가 아니다. 필드라고 부른다.
  int cc;       // 프로퍼티가 아니다. 필드라고 부른다.
  Tire[] tires;
  
  @Override
  public String toString() {
    return "Car2 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", tires=" + Arrays.toString(tires) + "]";
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
  public Tire[] getTires() {
    return tires;
  }
  public void setTires(Tire[] tires) {
    this.tires = tires;
  }
  
  
}

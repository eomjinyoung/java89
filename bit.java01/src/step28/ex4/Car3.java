package step28.ex4;

import java.util.List;

public class Car3 {
  String model; 
  String maker; 
  int cc; 
  List<Tire> tires;
  
  
  @Override
  public String toString() {
    return "Car3 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", tires=" + tires + "]";
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
  public List<Tire> getTires() {
    return tires;
  }
  public void setTires(List<Tire> tires) {
    this.tires = tires;
  }
  
  
}

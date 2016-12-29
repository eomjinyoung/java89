package step28.ex4;

import java.util.List;
import java.util.Set;

public class Car4 {
  String model; 
  String maker; 
  int cc; 
  Set<Tire> tires;
  List<Tire> tires2;
  
  @Override
  public String toString() {
    return "Car4 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", tires=" + tires + ", tires2=" + tires2 + "]";
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
  public Set<Tire> getTires() {
    return tires;
  }
  public void setTires(Set<Tire> tires) {
    this.tires = tires;
  }
  public List<Tire> getTires2() {
    return tires2;
  }
  public void setTires2(List<Tire> tires2) {
    this.tires2 = tires2;
  }
  
  
  
  
}

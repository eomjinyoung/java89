package step28.ex4;

import java.util.Map;

public class Car5 {
  String model; 
  String maker; 
  int cc; 
  Map<String,Object> options;
  
  
  @Override
  public String toString() {
    return "Car5 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", options=" + options + "]";
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
  public Map<String, Object> getOptions() {
    return options;
  }
  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }
  
  
  
  
}

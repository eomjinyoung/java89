package step28.ex5;

public class Car {
  String model; // 프로퍼티가 아니다. 필드(field)라고 부른다.
  String maker; // 프로퍼티가 아니다. 필드라고 부른다.
  int cc;       // 프로퍼티가 아니다. 필드라고 부른다.
  Engine engine;
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", engine=" + engine + "]";
  }

  public String getModel() {
    return model;
  }
  public void setModel(String model) { // 프로퍼티명 : setModel --> Model --> "model"
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) { // 프로퍼티명 : setMaker --> Maker --> "maker"
    this.maker = maker;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {           // 프로퍼티명 : setCc --> Cc --> "cc"
    this.cc = cc;
  }
  public Engine getEngine() {
    return engine;
  }
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

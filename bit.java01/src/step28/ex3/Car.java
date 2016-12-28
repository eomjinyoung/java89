package step28.ex3;

public class Car {
  String model; // 프로퍼티가 아니다. 필드(field)라고 부른다.
  String maker; // 프로퍼티가 아니다. 필드라고 부른다.
  int cc;       // 프로퍼티가 아니다. 필드라고 부른다.
  
  public Car() {
    System.out.println("Car()");
  }
  
  public Car(String model) {
    System.out.println("Car(String)");
    this.model = model;
  }
  
  public Car(int cc) {
    System.out.println("Car(int)");
    this.cc = cc;
  }
  
  public Car(String model, int cc) {
    System.out.println("Car(String,int)");
    this.model = model;
    this.cc = cc;
  }
  
  public Car(int cc, String model) {
    System.out.println("Car(int,String)");
    this.model = model;
    this.cc = cc;
  }
  
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + "]";
  }
  
  public String getModel() {
    return model;
  }
  public void setModel(String model) { // 프로퍼티명 : setModel --> Model --> "model"
    System.out.println("setModel()");
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) { // 프로퍼티명 : setMaker --> Maker --> "maker"
    System.out.println("setMaker()");
    this.maker = maker;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {           // 프로퍼티명 : setCc --> Cc --> "cc"
    System.out.println("setCc()");
    this.cc = cc;
  }
  
  
}

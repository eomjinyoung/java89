package step25.ex1;

public class Car {
  String model;
  int capacity;
  String maker;
  Engine engine;
  
  public Car(String model, int capacity, String maker) {
    this.model = model;
    this.capacity = capacity;
    this.maker = maker;
    this.engine = new Engine("비트엔진", 5700);
  }
  
  public void run() {
    engine.setOn(true);
    System.out.println("달린다");
  }
}

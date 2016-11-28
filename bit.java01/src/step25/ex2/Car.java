package step25.ex2;

public class Car {
  String model;
  int capacity;
  String maker;
  Engine engine;
  
  public Car(String model, int capacity, String maker) {
    this.model = model;
    this.capacity = capacity;
    this.maker = maker;
  }
  
  // 의존 객체는 외부에서 주입받아야 하기 때문에 셋터를 추가한다.
  // => 변수에 직접 의존 객체를 할당하기 보다는 프로퍼티(셋터)를 통해 의존 객체를 주입한다.
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  public void run() {
    engine.setOn(true);
    System.out.println("달린다");
  }
}









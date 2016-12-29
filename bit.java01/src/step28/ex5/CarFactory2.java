/* 역할: 객체를 생성해주는 공장 역할2
 * => 공장 메서드가 인스턴스 메서드인 경우
 */
package step28.ex5;

public class CarFactory2 {
  public Car createCar(String model) {
    Engine engine = new Engine();
    Car car = new Car();
    car.setEngine(engine);
    
    switch (model) {
    case "티코":
      car.setMaker("대우자동차");
      car.setModel("티코2017");
      car.setCc(980);
      engine.setValve(8);
      engine.setVentil(4);
      break;
    case "소나타":
      car.setMaker("현대자동차");
      car.setModel("소나타2017");
      car.setCc(1980);
      engine.setValve(12);
      engine.setVentil(6);
      break;
    case "그랜저":
      car.setMaker("현대자동차");
      car.setModel("그랜저2017");
      car.setCc(2500);
      engine.setValve(12);
      engine.setVentil(6);
      break;
    default:
      car.setMaker("비트자동차");
      car.setModel("비트2017");
      car.setCc(5000);
      engine.setValve(18);
      engine.setVentil(9);
    }
    return car;
  }
}

/* 역할: 객체를 생성해주는 공장 역할
 * => 왜 공장이 필요한가?
 *    왜 공장 객체를 통해서 객체를 얻어야 하는가?
 *    - 객체 생성 과정이 복잡할 경우 공장을 통해 객체를 얻는 것이 
 *      코드를 단순하게 만든다.
 */
package step28.ex5;

public class CarFactory {
  public static Car createCar(String model) {
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

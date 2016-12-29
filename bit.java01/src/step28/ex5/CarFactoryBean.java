/* 역할: 객체를 생성해주는 공장 역할3
 * => 스프링의 규칙에 따라 공장 클래스를 만든다.
 */
package step28.ex5;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
  String model;
  
  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public Car getObject() throws Exception {
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

  @Override
  public Class<Car> getObjectType() {
    return Car.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}

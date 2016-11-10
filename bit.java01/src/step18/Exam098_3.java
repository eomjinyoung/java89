/* 주제: 클래스 사이의 관계 - 복합 관계
1) 상속(inheritance)
   => 수퍼 클래스와 서브 클래스의 관계
2) 연관(association)
   => 단순히 사용하는 관계
3) 집합(aggregation)
   => 개념적으로 포함하는 관계. container 와 containee 의 생명주기가 다르다.
   => 컨테이너가 가비지가 되더라도 컨테이니는 별도로 사용될 수 있다.
4) 복합(composition)
   => 개념적으로 포함하는 관계. container 와 containee 의 생명주기가 같다.
   => 컨테이너가 가비지가 될 때 컨테이니도 함께 가비지가 된다.
5) 의존(dependency)
   => 메서드가 호출될 때 잠시 사용하는 관계

*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam098_3 {
  static class Engine {}
  static class Tire {}

  static class Car {
    Engine engine = new Engine(); // composition 관계
    /* Car 객체가 가비지가 될 때 Engine 객체도 함께 가비지가 된다면,
       두 클래스의 관계는 composition 이 된다.*/
    Tire[] tires;  // aggregation 관계 
  }

  public static void main(String[] args) throws Exception {
    Tire[] tires = {new Tire(), new Tire(), new Tire(), new Tire()};
    Car car = new Car();
    car.tires = tires; // 집합관계
  }
}
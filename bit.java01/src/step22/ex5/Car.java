package step22.ex5;

// 서브 클래스에서 공통 속성과 메서드를 뽑아(상속->일반화; generalization) 만든 클래스라면,
// 그 클래스의 목적은 서브 클래스에게 공통 속성 및 메서드를 상속해주는 기능을 하는 것이다.
// 이런 경우 이 클래스의 인스턴스를 만들 이유도 없고 만들지 말아야 하기 때문에
// 보통 "추상클래스"로 선언한다.
// 또, 추상 메서드를 가져야 한다면,
// 그 때도 "추상클래스"로 선언해야 한다.
// 왜? 추상 클래스만이 추상 메서드를 가질 수 있기 때문이다.
//     추상 클래스는 인스턴스를 생성할 수가 없기 때문에 
//     추상 메서드가 호출될 일이 없다.
public abstract class Car {

  String modelName;
  int cc;
  String color;
  int energy = 100;
  int speed;

  public Car() {
    super();
  }

  // 이 메서드들은 서브클래스에서 재정의해야할 메서드들이다.
  // => 이렇게 서브 클래스에서 반드시 가져야할 메서드이고,
  // => 서브 클래스 마다 구현이 다를 수 있는 메서드라면,
  // 추상 메서드로 선언하라!
  public abstract void speedUp();
  public abstract void speedDown();
  public abstract void run();
  public abstract void attack();

  // 대부분의 서브 클래스가 공통적으로 가지는 메서드라면,
  // => 그냥 일반 메서드로 구현하여 서브 클래스에게 물려줘라!
  public void fillEnergy() {
    energy = 100;
  }
}





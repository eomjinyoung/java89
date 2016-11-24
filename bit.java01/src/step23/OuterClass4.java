/* 주제: 익명 클래스 만들기 
 */
package step23;

public class OuterClass4 {
  // 상속 이용
  // - 익명 클래스는 이름이 없기 때문에 정의하는 즉시 인스턴스를 생성해야 한다. 
  // - 익명 클래스는 이름이 없기 때문에 생성자를 만들 수 없다.
  //   생성자가 없기 때문에 인스턴스를 생성할 때 생성자를 호출할 수 없다.
  //   자바에서는 생성자를 호출하지 않고 인스턴스를 만드는 것을 허락하지 않는다.
  //   해결책? 수퍼 클래스의 생성자를 호출하라!
  // - 익명 클래스의 인스턴스를 생성했다면, 참조 변수에 그 주소를 저장해야 하는데,
  //   클래스 이름이 없으니 익명 클래스의 참조 변수를 만들 수 없다.
  //   해결책? 수퍼 클래스의 참조 변수에 저장하라! 다형적 변수의 특징을 이용하는 것이다.
  //   "어떤 참조 변수가 있다면, 그 클래스 뿐만아니라 그 자식 클래스의 객체도 가리킬 수 있다." 
  static Car obj = new Car("티코") {
    // 익명 클래스는 생성자를 만들 수 없다.
    //public () {} // 컴파일 오류!
    
    @Override
    public void run() {
      System.out.println(this.model + ": 점프하며 달리다");
    }
  };
  
  // 인터페이스를 구현하는 익명 클래스도 만들 수 있다.
  static Weapon obj2 = new Weapon() {
    public void fillBullet() {
      System.out.println("무리 충전 완료!");
    }
    public void attack() {
      System.out.println("공격!!!!");
    }
  };
  
  public static void main(String[] args) {
    obj.run();
    
    obj2.attack();
  }
  
}






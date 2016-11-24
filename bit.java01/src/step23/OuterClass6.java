/* 주제: Inner 클래스의 객체 만들기 
 */
package step23;

public class OuterClass6 {
 
  static class Bike {
    public void run() {
      System.out.println("썡~~~~ 달린다.");
    }
  }
  
  class Car {
    public void run() {
      System.out.println("달린다");
    }
  }
  
  public void m1() {
    // 같은 멤버 클래스는 사용하기 쉽다.
    Car c = new Car();
    c.run();
    
    Bike b = new Bike();
    b.run();
  }
  
  static public void m2() {
    // 스태틱 멤버(스태틱 블록,스태틱 메서드)는 인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)에
    // 접근할 수 없다.
    // 인스턴스 없이 호출하기 때문이다.
    //Car c = new Car(); // 컴파일 오류!
    //c.run();
    
    Bike b = new Bike();
    b.run();
  }
  
}






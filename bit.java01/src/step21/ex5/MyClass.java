package step21.ex5;

// 인터페이스를 구현하는 클래스는 항상 상속 받은 모든 메서드를
// 구현해야 한다.
public class MyClass implements MyInterface10 {
  // MyInterface8의 메서드 구현
  public void m1() {}
  public void m2() {}
  public void m3() {} // MyInterface9의 메서드이기도 함.
  
  // MyInterface9의 메서드 구현
  public void m4() {}
  
  // MyInterface10의 메서드 구현
  public void m5() {}
}

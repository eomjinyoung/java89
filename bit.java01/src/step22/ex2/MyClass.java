package step22.ex2;

public class MyClass extends MyAbstract1 {
  // 인터페이스와 다른 점
  void m1() {} // 공개 범위를 좁힐 수는 없지만,
  public void m2() {} // 이렇게 공개 범위를 넓힐 수는 있다. 
  public void m3() {} // 이렇게 공개 범위를 넓힐 수는 있다.
}

package step21.ex2;

// 인터페이스 구현 II
public class MyClass2 implements MyInterface3 {
  // 인터페이스의 메서드는 반드시 public 이어야 한다.
  // 접근 제한을 줄일 수 없다.
  void m1() {} // 컴파일 오류!
  public void m2() {}
  public void m3() {}
}

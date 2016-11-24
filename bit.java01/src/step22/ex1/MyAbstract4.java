package step22.ex1;

// 추상 메서드는 추상 클래스가 가질 수 있다.
// 왜? 인스턴스를 안 만들 것이기 때문에.
public abstract class MyAbstract4 {
  void m1() {}
  
  abstract void m2(); // 컴파일 오류!
}

package step22.ex2;

// 추상 클래스를 인터페이스 처럼 사용하면 어떤가요?
// => 안돼요. 문법적인 제약이 크다.
public abstract class MyAbstract1 {
  public abstract void m1();
  // 추상 클래스는 메서드의 접근 제어를 마음대로 조정할 수 있다.
  // 이것은 규칙이라는 의미와 거리가 멀다.
  // 왜? 규칙은 무조건 공개해야 하기 때문이다.
  // 만약 추상메서드의 접근을 제한한다면 그것은
  // 규칙으로 사용하는 것이 아니라 그냥 일반 메서드로 사용한다는 의미다.
  protected abstract void m2();
  abstract void m3();
}

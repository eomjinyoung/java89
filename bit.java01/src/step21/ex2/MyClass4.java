package step21.ex2;

// 인터페이스 구현 IV
// => 만약 의도적으로 메서드를 구현하지 않았다면,
//    추상 클래스로 만들라!
// => 이유? 추상 클래스는 인스턴스를 만들지 못하기 때문에
//    추상 메서드를 가질 수 있다.
public abstract class MyClass4 implements MyInterface3 {
  public void m1() {}
  public void m2() {}
  //public void m3() {}
}

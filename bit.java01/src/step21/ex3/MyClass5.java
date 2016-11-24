package step21.ex3;

import step21.ex2.MyInterface3;

// 인터페이스 구현 V
// => 클래스는 여러 개의 클래스를 상속 받을 수 없다.
//    왜? 만약 수퍼 클래스들 중에서 동일한 메서드가 있다면,
//        어느 것을 상속해야 할 지 결정할 수 없기 때문이다.
// => 그러나 인터페이스는 구현된 메서드가 아니기 때문에,
//    추상 메서드이기 때문에 여러 인터페이스에 동일한 메서드가 있더라도
//    상관없다.
public class MyClass5 implements MyInterface3, MyInterface4 {
  public void m1() {}
  public void m2() {}
  public void m3() {} // m3()가 어느 인터페이스의 메서드인지 굳이 따질 필요가 없다.
                      // 왜? 규칙이기 때문에 인터페이스 구현 조건을 만족시키기만 하면 된다.
                      // 즉 MyInterface3 입장에서 m1(), m2(), m3()를 모두 구현하였고,
                      // MyInterface4 입장에서도 m3(), m4()를 모두 구현한 것이기 때문이다.
  public void m4() {}
}







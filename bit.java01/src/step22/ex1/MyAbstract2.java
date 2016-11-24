package step22.ex1;

// 추상클래스는 일반 클래스와 동일하게 
// static/non-static 멤버를 가질 수 있다.
// => 다만 인스턴스를 생성할 수 없을 뿐이다.
// => 왜? 이 클래스의 목적은 서브 클래스에게 공통 변수나 메서드를 상속해주는 것이기 때문이다.
public abstract class MyAbstract2 {
  static int a;
  int b;
  
  static void m1() {}
  void m2() {}
}

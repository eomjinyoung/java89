package step21.ex5;

// 인터페이스는 다중 상속을 허용한다.
// 왜? 어차피 메서드가 구현되지 않았기 때문에
// 동일한 메서드를 여러 인터페이스에서 상속 받더라도 문제 없다.
public interface MyInterface10 extends MyInterface8, MyInterface9 {
  void m5();
}

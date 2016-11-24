// 인터페이스 작성 규칙 II
package step21.ex1;

public interface MyInterface2 {
  /*public static final*/ int a = 100;
  
  // 메서드는 사용자와 피사용자의 호출 규칙이다.
  // - 구현해서는 안된다. 추상 메서드여야 한다.
  // - 규칙이기 때문에 공개되어야 한다.
  public abstract void m1();
  
  // public 이 없으면 컴파일할 때 자동으로 붙이다.
  abstract void m2();
  
  // abstract 가 없으면 컴파일할 때 자동으로 붙인다.
  public void m3();
  
  // 모두 생략하면 자동으로 모두 붙이다.
  /*public abstract*/ void m4();
  
}








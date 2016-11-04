/* 주제: 중첩 클래스의 접근 제어
*/
package step16.ex4;

// 바깥 클래스?
// => "패키지 멤버 클래스"라 부른다.
// 안쪽 클래스?
// => 클래스 안에 소속된 클래스라고 해서 "중첩 클래스(inner class, nested class)"라 부른다.
public class Exam088_0 {
  // 중첩 클래스도 변수나 메서드 처럼 static을 붙일 수 있다.
  static class My1 {} // <-- 스태틱 중첩 클래스 
  class My2 {}  // <-- 인스턴스 중첩 클래스 

  // 중첩 클래스는 바깥 클래스와 달리 private, protected 모두 사용가능!
  private class My3 {}
  class My4 {}
  protected class My5 {}
  public class My6 {}
}
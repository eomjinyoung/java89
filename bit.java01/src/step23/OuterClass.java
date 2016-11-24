/* 주제: Nested Class(중첩클래스)의 종류
 * 클래스 안에 선언된 클래스를 말한다.
 * 종류는 static 이냐 아니냐에 따라 다음의 용어로 부른다.
 * 1) 스태틱 중첩 클래스(static nested class)
 * 2) non-static(=instance) 중첩 클래스 = "Inner Class(내장클래스)"
 * 3) 로컬 클래스(local class)
 *   - 메서드 안에 선언한 클래스
 *   - 그 메서드에서만 사용 가능!
 * 4) 익명 클래스(anonymous class) 
 *   - 이름이 없는 클래스
 *   - 따라서 클래스를 정의와 인스턴스 생성을 함께 해야 한다.
 *   - 즉 인스턴스를 한 개만 만들 때 주로 사용한다. 
 */
package step23;

public class OuterClass {
  static class StaticNestedClass {}
  class InnerClass {}
  
  public void m1() {
    class LocalClass {}
    
    // 로컬 익명 클래스
    Object obj2 = new Object() {};
  }
  
  // 익명 클래스
  // new 수퍼클래스명() {}
  // new 인터페이스명() {}
  // 클래스의 이름이 없기 때문에 나중에 따로 인스턴스의 주소를 받을 수 없다.
  // 그래서 익명 클래스는 정의와 동시에 인스턴스를 생성해야 한다.
  Object obj = new Object() {};
  
  
}









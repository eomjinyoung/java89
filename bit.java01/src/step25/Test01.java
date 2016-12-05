/* 주제: 애노테이션 - 정의와 사용
 * => 애노테이션
 *    - 클래스에 파일(.class 파일)에 첨부하는 특별한 주석이다.
 *    - 보통 소스 코드에 추가된 주석은 컴파일할 때 제거된다.
 *      그래서 .class 파일에 주석이 존재하지 않는다.
 *    - 그러나 애노테이션은 컴파일한 후에도 .class 파일에 남길 수 있다.
 *    - 애노테이션 실행 중에 부가 정보를 전달하고자 할 때 사용한다.
 * => 사용
 *    - 클래스 선언, 메서드 선언, 변수 선언에 붙일 수 있다.
 */
package step25;

public class Test01 {
  
  // 애노테이션 정의 
  public static @interface MyAnnotation {
    // 애노테이션의 프로퍼티를 선언할 수 있다.
  }
  
  // 애노테이션의 사용
  @MyAnnotation // 클래스 선언 부에 붙일 수 있다.
  public static class MyClass {
    @MyAnnotation int a; // 변수 선언에 붙일 수 있다.
    
    @MyAnnotation void m() {} // 메서드 선언에 붙일 수 있다.
    
    void m2(@MyAnnotation int p) { // 파라미터 변수에도 붙일 수 있다.
      @MyAnnotation int v; // 로컬 변수 선언에도 붙일 수 있다.
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    
    
    
  }
 
}

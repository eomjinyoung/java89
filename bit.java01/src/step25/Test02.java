/* 주제: 애노테이션 - 애노테이션을 중복 사용하기
 * => 애노테이션을 붙일 때 여러 개를 붙일 수 있다.
 *     
 */
package step25;

public class Test02 {
  
  // 애노테이션 정의 
  public static @interface MyAnnotation {
    // 애노테이션의 프로퍼티를 선언할 수 있다.
  }
  public static @interface MyAnnotation2 {
    // 애노테이션의 프로퍼티를 선언할 수 있다.
  }
  
  // 애노테이션의 사용
  @MyAnnotation // 클래스 선언 부에 붙일 수 있다.
  @MyAnnotation2 // 여러 개의 애노테이션을 붙일 수 있다. 다른 것도 똑 같다.
  public static class MyClass {
    @MyAnnotation2 @MyAnnotation int a; // 변수 선언에 붙일 수 있다.
    
    @MyAnnotation2 @MyAnnotation void m() {} // 메서드 선언에 붙일 수 있다.
    
    void m2(@MyAnnotation2 @MyAnnotation int p) { // 파라미터 변수에도 붙일 수 있다.
      @MyAnnotation2 @MyAnnotation int v; // 로컬 변수 선언에도 붙일 수 있다.
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    
    
    
  }
 
}

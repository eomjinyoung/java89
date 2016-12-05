/* 주제: 애노테이션 - 애노테이션 프로퍼티
 * => 애노테이션은 정형화된 정보를 첨부할 수 있다.
 *    "프로퍼티"를 통해서 가능하다.  
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test04 {
  
  @Retention(RetentionPolicy.RUNTIME) 
  public static @interface MyAnnotation {
    int value(); // 프로퍼티를 선언할 때 메서드 문법을 사용한다.
  }
  
  // 애노테이션의 프로퍼티 값을 지정하는 방법
  @MyAnnotation(value=10)
  public static class MyClass {
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    // 애노테이션의 프로퍼티 추출 
    MyAnnotation anno = clazz.getAnnotation(MyAnnotation.class);
    
    // 메서드 호출하듯이 프로퍼티 값을 꺼낼 수 있다.
    System.out.println(anno.value());
  }
 
}








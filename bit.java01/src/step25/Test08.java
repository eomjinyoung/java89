/* 주제: 애노테이션 - 프로퍼티 이름 생략
 * => 프로퍼티 이름이 'value'이고,
 *    value 값 한 개를 지정할 때는 이름을 생략할 수 있다. 
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test08 {
  
  @Retention(RetentionPolicy.RUNTIME) 
  public static @interface MyAnnotation {
    String value() default "111";
    String value2() default "222";
    String value3() default "333"; 
  }
  
  //@MyAnnotation(value="홍길동") // OK!
  //@MyAnnotation(value2="홍길동") // OK!
  //@MyAnnotation(value3="홍길동") // OK!
  @MyAnnotation("홍길동") // OK! 왜? 프로퍼티 이름이 value 이니까
  //@MyAnnotation("홍길동", value2="하하하") // 컴파일 오류! 값을 두 개 지정할 때는 value 생략 불가!
  public static class MyClass {}
  
  public static void main(String[] args) throws Exception {
    // 애노테이션 추출 
    MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
    System.out.println(anno.value());
    System.out.println(anno.value2());
    System.out.println(anno.value3());
  }
 
}








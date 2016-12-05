/* 주제: 애노테이션 - 애노테이션 프로퍼티의 필수 입력 항목과 선택 입력 항목
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test05 {
  
  @Retention(RetentionPolicy.RUNTIME) 
  public static @interface MyAnnotation {
    int value(); // 기본 값을 지정하지 않으면 필수 입력 항목이 된다.
    int value2() default 100; // 기본 값을 지정하면 선택 입력 항목이 된다.
  }
  
  // 애노테이션의 프로퍼티 값 지정
  //@MyAnnotation() // 필수 입력 항목(value)의 값을 지정하지 않아서 컴파일 오류!
  //@MyAnnotation(value2=200) // 필수 입력 항목(value)의 값을 지정하지 않아서 컴파일 오류!
  //@MyAnnotation(value=200) // OK! 필수 입력 항목만 값 지정.
  @MyAnnotation(value=200, value2=300) // 당연히 모든 프로퍼티의 값을 지정할 수 있다.
  public static class MyClass {
  }
  
  @MyAnnotation(value=1000) // 선택 입력 항목의 값을 지정하지 않으면 기본 값이 사용된다.
  public static class MyClass2 { 
  }
  
  public static void main(String[] args) throws Exception {
    // 애노테이션 추출 
    MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
    System.out.println(anno.value());
    System.out.println(anno.value2());
    
    MyAnnotation anno2 = MyClass2.class.getAnnotation(MyAnnotation.class);
    System.out.println(anno2.value());
    System.out.println(anno2.value2()); // 기본 값이 출력됨을 알 수 있다.
  }
 
}








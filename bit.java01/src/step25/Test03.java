/* 주제: 애노테이션 - 애노테이션 정책과 추출
 * => 애노테이션 유지 정책
 *    - 애노테이션을 언제까지 유지할 것인지에 대한 정책
 *    - SOURCE  : 컴파일 후 제거됨. 즉 .class 파일에 남아있지 않음. 
 *                일반 주석과 다를 바 없네?
 *                다른 점이 하나 있다. 나중에 정보를 추출하기 쉽게 정형화 되어 있다. 
 *    - CLASS   : 컴파일 한 후에도 .class에 존재한다. 
 *                단 실행할 때는 읽을 수 없다.
 *                해당 주석을 꺼내려면 파일 I/O를 통해 클래스 파일의 데이터를 직접 분석해야 한다.
 *                보통 컴파일러에게 특정 정보를 전달할 때 사용한다.
 *                애노테이션을 정의한 후 유지 정책을 지정하지 않으면 CLASS가 기본 정책이 된다.
 *    - RUMTIME : 컴파일 한 후에도 .class에 존재한다.
 *                실행 중에 해당 애노테이션을 꺼낼 수 있다.   
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test03 {
  
  @Retention(RetentionPolicy.SOURCE) public static @interface MyAnnotation {}
  @Retention(RetentionPolicy.CLASS) public static @interface MyAnnotation2 {}
  @Retention(RetentionPolicy.RUNTIME) public static @interface MyAnnotation3 {}
  
  @MyAnnotation
  @MyAnnotation2
  @MyAnnotation3
  public static class MyClass {
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    // 애노테이션 정보 추출 
    MyAnnotation anno = clazz.getAnnotation(MyAnnotation.class);
    MyAnnotation2 anno2 = clazz.getAnnotation(MyAnnotation2.class);
    MyAnnotation3 anno3 = clazz.getAnnotation(MyAnnotation3.class);
    
    if (anno != null) {
      System.out.println("MyAnnotation 추출 성공!");
    }
    if (anno2 != null) {
      System.out.println("MyAnnotation2 추출 성공!");
    }
    if (anno3 != null) {
      System.out.println("MyAnnotation3 추출 성공!");
    }
  }
 
}








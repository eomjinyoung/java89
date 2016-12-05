/* 주제: 애노테이션 - 애노테이션 프로퍼티의 다양한 타입
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test06 {
  
  @Retention(RetentionPolicy.RUNTIME) 
  public static @interface MyAnnotation {
    String title() default ""; 
    String press() default "";
    int page() default 200;
  }
  
  @MyAnnotation(
      title="제목...",
      press="비트출판",
      page=500) 
  public static class MyClass {
  }
  
  public static void main(String[] args) throws Exception {
    // 애노테이션 추출 
    MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
    
    String t = anno.title();
    String pr = anno.press();
    int pa = anno.page();
    
    System.out.println(t);
    System.out.println(pr);
    System.out.println(pa);
  }
 
}








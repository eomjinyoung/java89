/* 주제: 애노테이션 - 배열 프로퍼티
 */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test07 {
  
  @Retention(RetentionPolicy.RUNTIME) 
  public static @interface MyAnnotation {
    String[] value();
  }
  
  @MyAnnotation(value = {"홍길동","임꺽정"}) 
  public static class MyClass {}
  
  @MyAnnotation(value= {"유관순"})
  public static class MyClass2 {}
  
  @MyAnnotation(value ="윤봉길") // 배열의 값이 한 개일 때 중괄호({})를 생략할 수 있다.
  public static class MyClass3 {}
  
  public static void main(String[] args) throws Exception {
    // 애노테이션 추출 
    MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
    String[] list = anno.value();
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("----------------------------");
    
    anno = MyClass2.class.getAnnotation(MyAnnotation.class);
    list = anno.value();
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("----------------------------");
    
    anno = MyClass3.class.getAnnotation(MyAnnotation.class);
    list = anno.value();
    for (String s : list) {
      System.out.println(s);
    }
  }
 
}








/* 주제: 리플랙션 API 사용법 - 메서드 호출
 * => java.lang.reflect.Method 클래스
 *    - 메서드에 대한 정보를 다루는 클래스
 *   
 */
package step24;

import java.lang.reflect.Method;

public class ClassTest09 {
  static class MyClass {
    float interest;
    
    public void m1(String a, int b) {
      System.out.printf("인스턴스 메서드: %s, %f\n", a, (b * this.interest));
    }
    
    public static void m2(String a, int b) {
      System.out.printf("스태틱 메서드: %s, %d\n", a, b);
    }
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    Method m1 = clazz.getMethod("m1", String.class, int.class);
    Method m2 = clazz.getMethod("m2", String.class, int.class);
    
    // 스태틱 메서드 호출 
    m2.invoke(null, "홍길동", 30);
    
    // 인스턴스 메서드 호출
    //m1.invoke(null, "임꺽정", 20); // 실행 오류! 인스턴스 메서드는 인스턴스 주소 없이 호출 불가!
    
    MyClass obj1 = new MyClass();
    obj1.interest = 0.012f;
    
    MyClass obj2 = new MyClass();
    obj2.interest = 0.15f;
    
    m1.invoke(obj1, "임꺽정", 1000000);
    m1.invoke(obj2, "유관순", 1000000);
  }

}






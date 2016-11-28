/* 주제: 리플랙션 API 사용법 - 메서드의 파라미터 정보 추출하기
 * => java.lang.reflect.Parameter 클래스
 *    - 메서드의 파라미터 정보를 다루는 클래스
 *   
 */
package step24;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassTest10 {
  static class MyClass {
    public void m1() {}
    public void m2(String a) {}
    public void m3(int b) {}
    public void m4(String a, int b) {}
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    Method[] methods = clazz.getMethods();
    
    for (Method m : methods) {
      System.out.println(m.getName());
      System.out.printf("> 메서드 리턴 타입: %s\n", m.getReturnType().getName());
      System.out.printf("> 파라미터 개수: %d\n", m.getParameterCount());
      Parameter[] params = m.getParameters();
      for (Parameter p : params) {
        System.out.printf("===> %s %s\n", p.getType().getName(), p.getName());
      }
    }
  }

}






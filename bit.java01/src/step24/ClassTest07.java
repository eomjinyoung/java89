/* 주제: 리플랙션 API 사용법 - 클래스의 메서드 정보 추출하기 II
 * => java.lang.reflect.Method 클래스
 *    - 메서드에 대한 정보를 다루는 클래스
 *   
 */
package step24;

import java.lang.reflect.Method;

public class ClassTest07 {
  static class MyClass {
    public static int publicStaticVar = 100;
    protected static int protectedStaticVar = 200;
    static int defaultStaticVar = 300;
    private static int privateStaticVar = 400;
    
    public int publicVar = 100;
    protected int protectedVar = 200;
    int defaultVar = 300;
    private int privateVar = 400;
    
    public static void publicStaticMethod() {}
    protected static void protectedStaticMethod() {}
    static void defaultStaticMethod() {}
    private static void privateStaticMethod() {}
    
    public void publicMethod() {}
    protected void protectedMethod() {}
    void defaultMethod() {}
    private void privateMethod() {}
  }
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    // 자신의 메서드만 추출한다. private, protected, (default) 포함. 
    Method[] methods = clazz.getDeclaredMethods();
    
    for (Method m : methods) {
      System.out.println(m.getName());
    }
    
  }

}






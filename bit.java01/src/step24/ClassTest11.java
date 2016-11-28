/* 주제: 리플랙션 API 사용법 - 멤버의 부가 정보(modifier) 알아내기 
 * => 
 *   
 */
package step24;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassTest11 {
  static class MyClass {
    public void m1() {}
    protected void m2() {}
    public static void m3() {}
    public static final void m4() {}
    void m5() {}
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    
    System.out.println("--------------------------");
    System.out.printf("public: %x\n", Modifier.PUBLIC);
    System.out.printf("protected: %x\n", Modifier.PROTECTED);
    System.out.printf("private: %x\n", Modifier.PRIVATE);
    System.out.printf("static: %x\n", Modifier.STATIC);
    System.out.printf("final: %x\n", Modifier.FINAL);
    System.out.println("--------------------------");
    
    Method[] methods = clazz.getDeclaredMethods();
    
    for (Method m : methods) {
      int modifiers = m.getModifiers();
      System.out.printf("%s => %x\n", m.getName(), modifiers);
      System.out.print("===>");
      
      if ((modifiers & Modifier.PUBLIC) == Modifier.PUBLIC) {
        System.out.print("public,");
      }
      
      if ((modifiers & Modifier.PROTECTED) == Modifier.PROTECTED) {
        System.out.print("protected,");
      }
      
      if ((modifiers & Modifier.PRIVATE) == Modifier.PRIVATE) {
        System.out.print("private,");
      }
      
      if ((modifiers & Modifier.STATIC) == Modifier.STATIC) {
        System.out.print("static,");
      }
      
      if ((modifiers & Modifier.FINAL) == Modifier.FINAL) {
        System.out.print("final,");
      }
      System.out.println();
    }
  }

}






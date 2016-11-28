/* 주제: 리플랙션 API 사용법 - 클래스 이름 알아내기
 *   
 */
package step24;

public class ClassTest05 {
  static class MyClass {
    public static int a = 100;
    public static String txt = "ok";
    public static void m() {}
    
    static { // 클래스가 로딩될 때 실행된다. 
      System.out.println("MyClass 스태틱 블록 실행.");
    }
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = MyClass.class;
    System.out.println(clazz.getName());
    System.out.println(clazz.getSimpleName());
    System.out.println(clazz.getCanonicalName());
    System.out.println(clazz.getTypeName());
    
  }

}






/* 주제: 리플랙션 API 사용법 - 로딩된 클래스의 정보 얻기 II
 * 2) 인스턴스를 만든 후에 얻는 방법
 *    => 모든 클래스는 Object의 서브 클래스이다.
 *    => Object는 그 인스턴스가 어떤 클래스의 인스턴스인지 알려주는 메서드를 갖고 있다.
 *       그 메서드 이름은 getClass() 이다.
 *   
 */
package step24;

public class ClassTest03 {
  static class MyClass {
    static int a;
    static void m() {}
    
    static { // 클래스가 로딩될 때 실행된다. 
      System.out.println("MyClass 스태틱 블록 실행.");
    }
  }
  
  public static void main(String[] args) throws Exception {
    MyClass obj = new MyClass();
    Class<?> c = obj.getClass(); // Object로부터 상속 받은 getClass()를 이용하여 
                                 // 클래스 정보를 다루는 도구를 얻을 수 있다.
  }

}






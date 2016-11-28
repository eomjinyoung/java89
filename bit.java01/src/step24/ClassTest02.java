/* 주제: 리플랙션 API 사용법 - 로딩된 클래스의 정보 얻기 I
 * 1) Class.forName()의 리턴 값
 *   => forName()은 클래스를 로딩하기도 하지만,
 *      로딩한 후 그 클래스 정보를 다룰 수 있는 객체(도구)를 리턴하기도 한다.
 *   
 */
package step24;

public class ClassTest02 {
  static class MyClass {
    static int a;
    static void m() {}
    
    static { // 클래스가 로딩될 때 실행된다. 
      System.out.println("MyClass 스태틱 블록 실행.");
    }
  }
  
  public static void main(String[] args) throws Exception {
    // forName()을 통해 클래스 정보를 다루는 도구 얻기 
    // => 경고 뜬다. 왜? 어떤 클래스 정보를 다루는지 지정하지 않았기 때문이다. 
    Class c = Class.forName("step24.ClassTest01$MyClass");
    
    // => 경고를 없애는 방법 1 : 컴파일러에게 경고하지 말라고 얘기한다.
    @SuppressWarnings("rawtypes")
    Class c2 = Class.forName("step24.ClassTest01$MyClass");
    
    // => 경고를 없애는 방법 2 : 참조 변수 선언할 때 제네릭 문법으로 저장할 클래스를 지정한다.
    //    "?"의미? Class 도구가 다룰 수 있는 클래스는 아무거나 가능하다는 의미다.
    Class<?> c3 = Class.forName("step24.ClassTest01$MyClass");
    c3 = Class.forName("java.lang.String");
    
    // forName()에 중첩 클래스를 지정할 때는 '.' 대신 
    // 클래스 파일명에 사용하는 $를 지정해야 한다.
    // 그러나 자바 코드로 클래스를 표현할 때는 '$' 대신 '.'을 사용해야 한다.
    // 예) step24.ClassTest01.MyClass
    Class<?> c4 = Class.forName("step24.ClassTest01.MyClass"); // 컴파일 오류!
  }

}






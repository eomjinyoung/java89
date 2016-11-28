/* 주제: 리플랙션 API 사용법 - 생성자와 인스턴스 생성 
 * => 
 *   
 */
package step24;

import java.lang.reflect.Constructor;

public class ClassTest12 {
  static class MyClass {
    String name;
    public MyClass(String name) {
      this.name = name;
    }
    
    public void m() {
      System.out.println(this.name);
    }
  }
  
  public static void main(String[] args) throws Exception {
    Class<MyClass> clazz = MyClass.class;
    
    // 기본 생성자를 호출하기 때문에, 기본 생성자가 없는 경우에 실행 오류가 발생한다.
    //MyClass obj = clazz.newInstance();
    
    // 인스턴스를 만들 때 호출할 생성자를 지정해야 한다.
    Constructor<MyClass> constructor = clazz.getConstructor(String.class);
    MyClass obj = constructor.newInstance("홍길동");
    obj.m();
  }

}






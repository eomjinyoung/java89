/* 주제: 제네릭의 정의와 사용
*/

package step13.v5;
import java.util.Scanner;

public class Test2  {
 
  static class A {}
  static class B extends A {}
  static class C extends B {}

  public static void main(String[] args) {
    LinkedList<A> list = new LinkedList<A>();
    //LinkedList<A> list2 = new LinkedList<B>(); // 컴파일 오류!
    LinkedList<? extends A> list3 = new LinkedList<B>();
    LinkedList<? extends A> list4 = new LinkedList<C>();
    //LinkedList<? extends A> list5 = new LinkedList<String>(); // 컴파일 오류!
    
  }

  
}

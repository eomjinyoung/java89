/* 주제: 스레드 프로그래밍 - 사용전 
 */
package step20;

public class Exam106_0 {
  static class MyObject {
    public void m() {
      for (int i = 0; i < 5000; i++) {
        System.out.printf("MyObject(%d)...\n", i);
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    MyObject obj = new MyObject();
    
    // 다음 메서드는 일반 객체의 메서드이기 때문에 
    // 현재 main() 메서드를 실행하는 스레드("main")가 호출한다.
    // m() 메서드가 실행을 마쳐야만 다음 반복문을 실행할 수 있다. 
    // 즉 스레드는 실행 순서에 따라 차례대로 실행한다.
    obj.m();
    
    for (int i = 0; i < 5000; i++) {
      System.out.printf("main(%d)...\n", i);
    }
    
  }
}





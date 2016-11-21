/* 주제: 스레드 프로그래밍 - 부모/자식 스레드의 우선순위 
 * - 부모 스레드: 스레드를 생성한 스레드.
 * - 자식 스레드이 우선 순위는 부모 스레드의 우선 순위와 같다.  
 */
package step20;

public class Exam106_4 { 
  static class MyThread extends Thread {}
  
  public static void main(String[] args) throws Exception {
    Thread parentThread = Thread.currentThread();
    parentThread.setPriority(8); // 자식 스레드는 기본으로 부모 스레드의 우선 순위를 가져온다.
    System.out.printf("%s(%d), %d\n", 
        parentThread.getName(), parentThread.getId(), parentThread.getPriority());
    
    // 현재 스레드에서 만든 스레드를 자식 스레드라 부른다.
    MyThread childThread = new MyThread();
    System.out.printf("%s(%d), %d\n", 
        childThread.getName(), childThread.getId(), childThread.getPriority());
    
    childThread = new MyThread();
    childThread.setPriority(3); // 물론 자식 스레드는 부모와 다른 우선 순위를 가질 수 있다.
    System.out.printf("%s(%d), %d\n", 
        childThread.getName(), childThread.getId(), childThread.getPriority());
  }
}




/* 주제: 스레드 프로그래밍 - JVM 기본 스레드들 
 * - JVM을 실행하면 기본적으로 몇 개의 스레드가 실행된다.
 */
package step20;

public class Exam106_2 {  
  public static void main(String[] args) throws Exception {
    // main() 메서드를 실행하는 스레드 알아내기
    // => 현재 실행 중인 스레드를 알아내면 된다.
    Thread currThread = Thread.currentThread();
    System.out.println(currThread.getName());
    
    ThreadGroup tg = currThread.getThreadGroup();
    System.out.println(tg.getName());
    
    printThreadGroupList(tg);
    printThreadList(tg);
    
    ThreadGroup parent = tg.getParent();
    if (parent != null) {
      printThreadGroupList(parent);
      printThreadList(parent);
    }
    
    ThreadGroup parent2 = parent.getParent();
    if (parent2 != null) {
      printThreadGroupList(parent2);
      printThreadList(parent2);
    }
  }

  private static void printThreadList(ThreadGroup tg) {
    System.out.printf("[%s 스레드들]------------------\n", tg.getName());
    Thread[] threadList = new Thread[10];
    int len = tg.enumerate(threadList, false);
    for (int i = 0; i < len; i++) {
      System.out.println(threadList[i].getName());
    }
  }
  
  private static void printThreadGroupList(ThreadGroup tg) {
    System.out.printf("[%s 하위 스레드 그룹들]------------------\n", tg.getName());
    ThreadGroup[] tgList = new ThreadGroup[10];
    int len = tg.enumerate(tgList, false);
    for (int i = 0; i < len; i++) {
      System.out.println(tgList[i].getName());
    }
  }
}

/*
범례:
[스레드그룹], "스레드"
 
JVM 스레드 구조
[system]
  --> [main]
      --> "main"              : main() 호출
  --> "Reference Handler"     : 인스턴스의 레퍼런스 관리
  --> "Finalizer"             : 가비지 수집
  --> "Signal Dispatcher"  
 */








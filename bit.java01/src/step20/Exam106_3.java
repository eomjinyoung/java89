/* 주제: 스레드 프로그래밍 - 스레드 우선순위 
 * - 자바에서 스레드를 관리할 때는 1에서 10까지 우선순위를 부여하여
 *   실행 횟수를 조정한다.
 *   기본 값은 5이다.
 * - 주의 사항!
 *   자바 스레드는 OS가 만든다. JVM은 OS가 만들어준 스레드를 관리할 뿐이다.
 *   따라서 스레드 실행은 OS의 정책에 좌우된다.
 *   => 스레드 우선순위를 믿지 말라! 
 *   => 스레드 우선순위를 고려하여 프로그램을 짜지 말라!
 * - 스레드 실행 정책은 결국 OS의 멀티 태스킹 정책에 의존한다.
 *   => 소스 아래의 주석 참조 
 */
package step20;

public class Exam106_3 {  
  public static void main(String[] args) throws Exception {
    Thread currThread = Thread.currentThread();
    System.out.printf("%s(%d), %d\n", 
        currThread.getName(), currThread.getId(), currThread.getPriority());
  }
}

/* 멀티 태스킹 정책
 * - CPU를 어떤 방식으로 공유하는지에 대한 정책
 * 1) Round-Robin 방식
 * 2) Priority + Aging 방식 
 * 
 */









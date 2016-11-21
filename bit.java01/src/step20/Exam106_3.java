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
    
    // 자바의 최소 우선 순위와 최대 우선 순위 값 
    System.out.printf("%d -- %d -- %d\n", 
        Thread.MIN_PRIORITY, Thread.MAX_PRIORITY, Thread.NORM_PRIORITY);
  }
}

/* 멀티 태스킹의 CPU 스케줄링 정책
 * - CPU를 어떤 방식으로 공유하는지에 대한 정책Exam106_2.java
 * 1) Round-Robin 방식
 *    - 우선 순위를 고려하지 않는다. 
 *    - 보통 10ms ~ 100ms 단위로 돌아가면서 프로세스에게 CPU를 분배한다.
 *    - 대표적인 OS: Windows
 * 2) Priority + Aging 방식 
 *    - 우선 순위에 따라 CPU를 분배를 조절한다.
 *    - Aging은 우선 순위에서 밀릴 때 마다 우선 순위를 높이는 기법이다.
 *    - 대표적인 OS: Unix/Linux 계열 
 *    
 * 컨텍스트 스위칭(context switching)
 * - 멀티 태스킹에서 CPU를 분배할 때, 
 *   다른 프로세스에게 CPU 사용권을 넘기기 전에 현재 실행 중인 프로세스의 실행 정보를 
 *   보관해야 한다.
 *   또한 실행하려는 프로세스의 이전 실행 정보를 읽어 와야 한다.
 *   이렇게 프로세스의 실행 정보를 읽고 쓰는 과정을 "컨텍스트 스위칭"이라 부른다.
 * - 프로세스에 나눠주는 CPU 사용 시간을 너무 짧게 잡으면 
 *   실제 작업을 실행하는 것 보다 프로세스의 실행 정보를 저장하고 읽는데 
 *   더 많은 시간을 소요하게 된다.
 *   그래서 CPU 분배 시간을 적절히 조정해야 한다.  
 */









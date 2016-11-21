/* 주제: 스레드 프로그래밍 - 스레드 정의하기
 * - 스레드를 정의하는 두 가지 방법
 * 1) Thread를 상속 받기
 * 2) Runnable 인터페이스 규칙에 따라 클래스 만들기
 */
package step20;

public class Exam107_0 { 
  static class Worker1 extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 2000; i++) {
        System.out.printf("MyThread ---> %d\n", i);
      }
    }
  }
  static class Worker2 implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 2000; i++) {
        System.out.printf("MyThread2 ********** %d\n", i);
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    // Thread의 서브 클래스를 실행하기
    Worker1 w1 = new Worker1();
    w1.start();
    
    // Runnable 구현 클래스를 실행하기
    // => Worker2는 스레드가 아니다. 단지 스레드가 실행할 코드를 갖고 있다.
    Worker2 w2 = new Worker2(); 
    Thread thread = new Thread(w2); // 스레드 생성자에 Runnable 구현체를 넘겨준다.
    thread.start(); // 이 스레드는 생성자에서 받은 Worker2의 run()을 실행한다.
  }
}













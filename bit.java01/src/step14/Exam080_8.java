/* 주제: 예외 처리 - Error는 애플리케이션에서 사용하지 말라!
=> 아니~~~ 그러면 Error 스텔스 모드는 어떻게 되는가요?
=> 꼭 사용하고 싶어요!
=> 그래서 자바는 애플리케이션 개발자를 위해 Error 처럼
   스텔스 모드로 예외를 전달할 수 있는 클래스를 제공한다.
=> 조건! 모든 애플리케이션 예외는 Exception이어야 한다.
   해결 방법!
   Exception의 서브 클래스이면 될 것 아닌가?
   "java.lang.RuntimeException" 예외 클래스이다.
=> 스텔스 모드의 장점
   예외를 즉시 현장에서 처리하지 않고, 최상위 호출자에게
   전달하여 일괄적으로, 일관되게 예외를 처리하고 싶을 때 사용하는 방법이다.
*/
package step14;

import java.util.Scanner;

public class Exam080_8 {
  static void m1() {
    m2();
  }
  static void m2() {
    m3();
  }
  static void m3() {
    m4();
  }
  static void m4() {
    throw new RuntimeException("예외발생!");
  }
  
  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

/*














*/

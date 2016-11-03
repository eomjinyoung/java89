/* 주제: 예외 처리 - Exception 예외 
=> 개발자가 애플리케이션에서 예외 상황을 알릴 때 사용한다.
=> 메서드 선언부에 반드시 어떤 예외를 던지는지 선언해야 한다.
*/
package step14;

import java.util.Scanner;

public class Exam080_5 {
  // 어떤 예외를 던지는지 선언하지 않으면 컴파일 오류다!
  static void m1() {
    //throw new Exception("예외 발생!"); // 컴파일 오류 발생
  }

  // 예외를 던진다고 반드시 선언해야 한다. 필수 사항이다.
  static void m2() throws Exception {
    throw new Exception("예외 발생!");
  }
  
  public static void main(String[] args) throws Exception {
    // Exception 예외를 던지는 메서드를 호출할 때는 
    // 반드시 예외를 처리해야 한다.
    // 1) try ~ catch 를 사용하여 예외를 처리하기
    /*
    try {
      m2();
    } catch (Exception e) {
      System.out.println("예외가 발생했어요!");
    }
    */

    // 2) 만약 여기서 예외를 처리하기 싫다면 
    // 이 메서드의 선언부에 예외가 발생한다고 선언하라!
    // => 즉 throws 문장을 메서드 선언부에 붙여라!
    m2();
  }
}

/*














*/

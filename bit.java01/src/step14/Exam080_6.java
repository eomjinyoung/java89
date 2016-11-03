/* 주제: 예외 처리 - Exception 예외의 불편함
=> Exception 을 던지는 메서드를 호출하는 경우 
   반드시 예외 처리를 해야 한다.
   try ~ catch 또는 throws 
   
*/
package step14;

import java.util.Scanner;

public class Exam080_6 {
  static void m1() throws Exception {
    m2();
  }
  static void m2() throws Exception {
    m3();
  }
  static void m3() throws Exception {
    m4();
  }
  static void m4() throws Exception {
    throw new Exception("예외발생!");
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

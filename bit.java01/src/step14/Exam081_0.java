/* 주제: 예외 처리 - throws 와 다형적 변수 
=> 실무!
   다른 개발자에게 해당 메서드가 어떤 예외를 던지는지 자세하게 알려주고 싶다면,
   가능한 모든 예외를 나열하라!
*/
package step14;

import java.util.Scanner;

import java.io.*;

public class Exam081_0 {
  //1) 메서드에서 발생하는 모든 예외를 적는다.
  static void m1(int a) throws Exception, IOException, EOFException, FileNotFoundException {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if (a == 2)
      throw new IOException("예외3");
    else 
      throw new Exception("예외4");
  }

  // 예외 클래스들이 상속 관계에 있을 때 부모 클래스로 묶을 수 있다.
  static void m2(int a) throws Exception, IOException {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if (a == 2)
      throw new IOException("예외3");
    else 
      throw new Exception("예외4");
  }

  // 예외 클래스들이 상속 관계에 있을 때 부모 클래스로 묶을 수 있다. II
  static void m3(int a) throws Exception {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if (a == 2)
      throw new IOException("예외3");
    else 
      throw new Exception("예외4");
  }
  
  // 예외 클래스들이 상속 관계에 있을 때 부모 클래스로 묶을 수 있다. III
  static void m4(int a) throws Throwable {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if (a == 2)
      throw new IOException("예외3");
    else 
      throw new Exception("예외4");
  }
  
  public static void main(String[] args) {
  }
}

/*














*/

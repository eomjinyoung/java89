/* 주제: 예외 처리 - 사용자 정의 예외 클래스 만들기 
=> 기존의 예외 클래스를 사용할 수도 있다.
   그러나 애플리케이션에서 발생되는 예외에 딱 맞는 클래스가 없다면,
   사용자 정의 클래스를 만들어 사용할 수 있다.
=> 그냥 기존의 클래스를 사용하지, 왜 새 클래스를 만드는가? 이점이 있나?
   - 클래스 이름만으로 어떤 예외인지 바로 짐작할 수 있다.
   - 실행 중에 예외가 발생했을 때 개발자는 어떤 상황에서 예외가 발생했는지
     바로 짐작할 수 있다.
*/
package step14;

import java.util.Scanner;

import java.io.*;

public class Exam082_0 {
  
  // 사용자 정의 예외 클래스 만들기
  // [수퍼 클래스의 선택]
  // 1) Exception
  //    => 메서드 호출자에게 예외처리를 강제시키고 싶을 때
  // 2) RuntimeException
  //    => 스텔스 모드로 예외를 던지고 싶을 때 
  static class NegativeNumberException extends Exception {
    public NegativeNumberException() {}
    public NegativeNumberException(String message) {
      super(message);
    } 
  }


  static void m1(int a) throws Exception, IOException, NegativeNumberException {
    if (a == 0)
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if (a == 2)
      throw new IOException("예외3");
    else if (a < 0)
      throw new NegativeNumberException(); 
    else 
      throw new Exception("예외4");
  }
  
  public static void main(String[] args) throws Exception {
    m1(-10);
  }
}

/*














*/

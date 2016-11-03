/* 주제: 예외 처리 - catch 순서
=> 반드시 자식 예외부터 잡아라!
*/
package step14;

import java.util.Scanner;

import java.io.*;

public class Exam081_2 {
  static void m1() throws FileNotFoundException {
    throw new FileNotFoundException("예외1");
  }

  static void m2() throws EOFException {
    throw new EOFException("예외2");
  }

  static void m3() throws IOException {
    throw new IOException("예외3");
  }
  
  static void m4() throws Exception {
    throw new Exception("예외4");
  }
  
  public static void main(String[] args) {
    //1) try 블록 안에서 발생되는 모든 예외를 개별적으로 받을 수 있다.
    try {
      m1(); m2(); m3(); m4();
    } catch (IOException e) { 
    } catch (FileNotFoundException e) { // 컴파일 오류! 위의 IOException 변수 때문에 잡을 수 없다.  
    } catch (EOFException e) {   // 컴파일 오류! 위의 IOException 변수 때문에 잡을 수 없다.
    } catch (Exception e) {  
    }

  }
}

/*














*/

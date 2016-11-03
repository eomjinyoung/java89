/* 주제: 예외 처리 - catch 와 다형적 변수 
=> 실무!
   오류의 종류에 상관없이 한 가지 방법으로만 예외를 처리하고 싶다면
   상위 클래스를 사용하여 묶어 처리하라!
*/
package step14;

import java.util.Scanner;

import java.io.*;

public class Exam081_1 {
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
    } catch (FileNotFoundException e) {  
    } catch (EOFException e) {  
    } catch (IOException e) {  
    } catch (Exception e) {  
    }

    //2) try 블록 안에서 발생되는 모든 예외를 부모 클래스로 받을 수 있다.
    try {
      m1(); m2(); m3(); m4();
    } catch (IOException e) {  
    } catch (Exception e) {  
    }

    //3) try 블록 안에서 발생되는 모든 예외를 부모 클래스로 받을 수 있다. II
    try {
      m1(); m2(); m3(); m4();
    } catch (Throwable e) {  
    }

    //4) catch 에는 Throwable 변수만 선언할 수 있다.
    /* 
    try {
      m1(); m2(); m3(); m4();
    } catch (Object e) { // 컴파일 오류! 
    }
    */
  }
}

/*














*/

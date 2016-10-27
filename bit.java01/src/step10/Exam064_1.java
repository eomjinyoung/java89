/* 주제: 클래스 로딩과 스태틱 블록의 수행
*/

package step10;

import java.util.Scanner;

public class Exam064_1 {

  static class X {
    static int value;

    static {
      System.out.println("X: 스태틱 초기화 블록 실행");
      X.value = Y.getValue();
      System.out.printf("X: X.value=%d, Y.value=%d\n", X.value, Y.value);
    }

    static int getValue() {
      System.out.println("X: getValue()");
      return 100;
    }
  }

  static class Y {
    static int value;

    static {
      System.out.println("Y: 스태틱 초기화 블록 실행");
      Y.value = X.getValue();
      System.out.printf("Y: X.value=%d, Y.value=%d\n", X.value, Y.value);
    }

    static int getValue() {
      System.out.println("Y: getValue()");
      return 200;
    }
  }

  public static void main(String[] args) {
    System.out.println(X.value);

  }
}

/*
# 실행 결과
X: 스태틱 초기화 블록 실행
Y: 스태틱 초기화 블록 실행
X: getValue()
Y: X.value=0, Y.value=100
Y: getValue()
X: X.value=200, Y.value=100
200



*/

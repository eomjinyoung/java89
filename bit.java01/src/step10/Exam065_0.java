/* 주제: 변수 초기화 - 스태틱 변수의 초기값
*/

package step10;

import java.util.Scanner;

public class Exam065_0 {

  static class MyType {
    static byte b;
    static short s;
    static char c;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bool;

  }

  public static void main(String[] args) {
    System.out.println(MyType.b);
    System.out.println(MyType.s);
    System.out.println((int)MyType.c);
    System.out.println(MyType.i);
    System.out.println(MyType.l);
    System.out.println(MyType.f);
    System.out.println(MyType.d);
    System.out.println(MyType.bool);
  }
}

/*
# 초기값
- 변수를 만든 후 기본적으로 저장되는 값
- 스태틱 변수나 인스턴스 변수는 0 값이 저장된다.
  byte/short/int/long/char = 0
  float/double = 0.0
  boolean = false
- 로컬 변수(파라미터 변수 포함)는 초기화되지 않는다.
  따라서 초기화시키지 않은 변수를 사용하려하면 컴파일 오류가 발생한다.
















*/

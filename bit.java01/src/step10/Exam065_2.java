/* 주제: 변수 초기화 - 로컬 변수의 초기값
*/

package step10;

import java.util.Scanner;

public class Exam065_2 {
  public static void main(String[] args) {
    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;

    System.out.println(b);
    System.out.println(s);
    System.out.println((int)c);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(bool);
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

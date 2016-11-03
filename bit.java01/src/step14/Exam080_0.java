/* 주제: 예외 처리 - 개념 : 예외처리 적용 전
=> 예외 처리 문법의 존재 이유
   - 예외가 발생하더라도 시스템을 멈추지 않고 계속 실행하게 만드는 문법
   - 예외가 발생한 사실을 호출자에게 전달하는 문법
=> JVM은 자바 코드를 실행하다가 오류가 발생하면,
   예외에 대한 내용을 출력한 후 즉시 실행을 멈춘다.
*/
package step14;

import java.util.Scanner;

public class Exam080_0 {
  static int m1(int a, int b) {
    return a / b;
  }
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    // 0으로 나누려 한다면 m1() 예외가 발생하여 즉시 실행을 멈출 것이다.
    int result = m1(v1, v2);
    System.out.println(result);
    System.out.println("안녕히 가세요!");
  }
}

/*
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면
   그 문자열을 끊어서 숫자로 바꾼 다음 리턴한다.
   단 한 개 문자열만 끊어서 숫자로 바꾼다.













*/

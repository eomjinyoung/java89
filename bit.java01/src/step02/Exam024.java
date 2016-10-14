// 주제: Literal - 정수의 자릿수 구분자
package step02;

public class Exam024 {
  public static void main(String[] args) {
    System.out.println(456_7899); // 10진수
    System.out.println(4_567_899); // 10진수
    System.out.println(0b0110_0100); // 2진수
    System.out.println(0b0_1_1_0_0_1_0_0); // 2진수
  }
}

/*
=> 자바에서 숫자를 표기할 때 자릿수 구분자 '_'를 끼워 넣을 수 있다.
  컴파일할 때 해당 문자는 제거된다.





*/

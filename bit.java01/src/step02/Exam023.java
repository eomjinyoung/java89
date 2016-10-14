// 주제: Literal - 정수의 다양한 진수 표기법
package step02;

public class Exam023 {
  public static void main(String[] args) {
    // println()에 넘겨주는 값이 어떤 진수로 표기했는지 상관없이
    // 출력할 때는 무조건 10진수 표기법으로 출력한다.
    System.out.println(100); // 10진수
    System.out.println(0144); // 8진수
    System.out.println(0x64); // 16진수 (주로 0x 사용)
    System.out.println(0X64); // 16진수
    System.out.println(0b01100100); // 2진수 (주로 0b 사용)
    System.out.println(0B01100100); // 2진수
  }
}

/*
=> 정수의 진수 표기법
10진수 : 그냥 작성. 예) 128
8진수 : 0으로 시작. 예) 0128
16진수: 0x 또는 0X로 시작. 예) 0X12, 0x12
2진수: 0b 또는 0B로 시작. 예) 0b1011, 0B1011





*/

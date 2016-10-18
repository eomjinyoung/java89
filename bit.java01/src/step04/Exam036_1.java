// 주제: 연산자 - 산술연산자(+,-,*,/,%) : 연산 결과의 데이터 종류는?
package step04;

public class Exam036_1 {
  public static void main(String[] args) {
    int a = 10, b = 7;

    int result = a / b;
    System.out.println(result);

    float result2 = a / b; // 나누기 연산 결과는 int 이다.
    System.out.println(result2); // 1.0

    float a2 = 10, b2 = 7;
    result2 = a2 / b2;
    System.out.println(result2); // 1.xxxxx
  }
}

/*
# 연산 결과의 데이터 종류는?
=> 피연산자의 데이터 종류와 같다!











*/

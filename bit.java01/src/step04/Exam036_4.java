// 주제: 연산자 - 산술연산자(+,-,*,/,%) : 암시적 형변환 II
package step04;

public class Exam036_4 {
  public static void main(String[] args) {
    int a = 10;
    float b = 7;

    float result = a / b; // 데이터의 종류(type)가 다르기 때문에 암시적으로 형변환 수행.
    System.out.println(result); //1.4xxxxx

    byte b1 = 10, b2 = 20;
    //byte b3 = b1 + b2; // b1과 b2의 값은 암시적으로 int로 형변환된다. 컴파일 오류!
    int result2 = b1 + b2; // OK!

    // 예외: 상수 값끼리의 연산 결과는
    // 메모리에 값을 넣을 수 있을 때 byte와 short 메모리에 저장하는 것을 허락한다.
    byte b4 = 10 + 20; // 상수의 결과 값은 컴파일러가 알 수 있기 때문에
                      // 값의 저장 여부를 바로 검사할 수 있다.
                      // 그래서 byte 메모리에 저장하는 것을 허락한다.
    //byte b5 = 100 + 100; // 컴파일 오류! 상수 값의 계산 결과가 메모리의 크기를 초과한다.
  }
}

/*
# 자바에서 정수 연산을 수행할 때 최소 단위가 int이다.
=> 따라서 byte, short 값을 연산할 때는
   내부적으로 int로 형변환된 다음에 연산이 수행된다.









*/

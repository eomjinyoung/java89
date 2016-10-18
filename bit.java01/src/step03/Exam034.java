// 주제: 변수 선언 - 값의 종류(data type)와 메모리 크기
package step03;

public class Exam034 {
  public static void main(String[] args) {
    //1) 정수
    byte b = 127; // 1 바이트
    short s = 3_2767; // 2 바이트
    int i = 21_4748_3647; // 4 바이트
    long l = 922_3372_0368_5477_5807L; // 8 바이트

    //2) 부동소수점
    float f = 3.14159f; // 4 바이트
    double d = 3.14159; // 8 바이트

    //3) 논리값
    boolean bool = true;
    boolean bool2 = false;
    //boolean bool3 = 0; // 컴파일 오류!

    //4) 문자
    char c = 0xAC00;
    char c2 = 44032;
    char c3 = '\uAC00';
    char c4 = '가';

    //5) 문자열(primitive 타입이 아니다. 객체 타입이다. 공식적으로 레퍼런스라 부른다.)
    String str = "홍길동";
  }
}

/*
# 값의 종류 = 데이터 타입
1) 정수
  byte    => 1byte
  short   => 2byte
  int     => 4byte
  long    => 8byte
2) 부동소수점
  float   => 4byte
  double  => 8byte
3) 문자
  char    => 2byte
4) 논리값
  boolean => 1byte
6) 객체
  => 값이 놓여 있는 메모리의 주소를 저장하는 메모리

# 자바 원시 타입(java primitive data type)
=> 자바에서 값을 구분하기 위해 나누어 놓은 최소 단위의 데이터 타입
=> byte, short, int, long, float, double, boolean, char (8개)

# 문자열?
=> 자바에서 문자열은 객체로 다룬다.
=> 객체란? 원시 타입을 가지로 임의로 조직한 메모리.
=> 지금은 그냥 문자열을 변수에 직접 저장한다고 생각하고
   예제를 전개하겠다!







*/

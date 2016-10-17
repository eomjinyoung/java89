// 주제: Literal - 문자(2byte; 0 ~ 65535)
package step02;

public class Exam021 {
  public static void main(String[] args) {
    System.out.println((char)44032);
    System.out.println((char)0xAC00);
    System.out.println((char)0xac00);
    System.out.println((char)0Xac00);
    System.out.println((char)0b1010110000000000);
    System.out.println((char)0B1010110000000000);
    System.out.println('홍');

    int value = '홍'; // 홍 이라는 문자의 유니코드 값을 리턴한다.
                      // 그리고 리턴한 값을 value라는 그릇에 저장한다.
    System.out.println((char)value); // value 그릇에 저장된 유니코드의 문자를 출력한다.

    System.out.println((char)('홍' + 1)); // 홍 이라는 문자의 유니코드에 1을 더하고
                                          // 그 값에 해당하는 문자를 출력한다.

    //System.out.println('오호라'); // 컴파일 오류! 한 개의 문자만 가능!

    // 특수 문자의 유니코드 값 출력하기
    System.out.println((int)'?'); // 문자 말고, 숫자 값 출력하라!
    System.out.println((int)'"'); // 문자 말고, 숫자 값 출력하라!
    System.out.println((int)'\''); // 문자 말고, 숫자 값 출력하라!
  }
}

/*
=> 자바 문자
- 자바 문자는 유니코드 UTF-16 코드 값으로 표현한다.
- 작은 따옴표(')를 사용하여 문자의 유니코드 값을 알아낼 수 있다.
  예) '문자' ==> 해당 문자의 유니코드 값을 리턴한다.
- 한 자만 가능하다.


*/

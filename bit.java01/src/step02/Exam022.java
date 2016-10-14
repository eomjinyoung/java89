// 주제: Literal - 정수와 메모리 크기
package step02;

public class Exam022 {
  public static void main(String[] args) {
    System.out.println(100); // 실행할 때 4바이트 메모리 차지함
    System.out.println(1);   // 실행할 때 4바이트 메모리 차지함
    System.out.println(100L); // 실행할 때 8바이트 메모리 차지함
    System.out.println(1l);   // 실행할 때 8바이트 메모리 차지함
  }
}

/*
=> 리터럴 정수의 종류
4바이트 정수: 그냥 수를 작성한다. 예) 100, 200, -34
8바이트 정수: 숫자 뒤에 L 또는 l 을 붙인다. 예) 100L, 200l, -34l
              l 영문자는 숫자 1과 비슷하기 때문에
              가능한 대문자 L을 붙여라!
=> 숫자를 지정하면, 실행할 때 그 크기 만큼의 메모리를 사용한다.






*/

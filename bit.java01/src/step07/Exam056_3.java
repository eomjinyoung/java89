// 주제: 인스턴스와 레퍼런스 - 상수 스트링 객체

package step07;

public class Exam056_3 {
  public static void main(String[] args) {
    String s1 = "홍길동"; // Constants Pool에 새 인스턴스 생성
    String s2 = "홍길동"; // 기존에 생성된 인스턴스 주소를 리턴
    String s3 = "홍길동"; // 기존에 생성된 인스턴스 주소를 리턴

    if (s1 == s2) { // 주소가 같은지 검사한다.
      System.out.println("s1 == s2");
    }

    if (s1 == s3) { // 주소가 같은지 검사한다.
      System.out.println("s1 == s3");
    }

    if (s2 == s3) { // 주소가 같은지 검사한다.
      System.out.println("s2 == s3");
    }
  }
}

/*
# 상수 문자열
- new String() 의 단축문법이다.
- 특징
  => 상수 스트링 인스턴스는 Constants Pool이라고 하는
    별도의 메모리에 생성된다.
  => 같은 값을 갖는 인스턴스는 중복되지 않는다. -> 메모리 절약











*/

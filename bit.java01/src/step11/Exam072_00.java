/* 주제: 상속과 다형성 - 다형적 변수(polymorphic variable) */
package step11;

public class Exam072_0 {
  static class 포유류 {
    int v1;
    void m1() {
      System.out.println("포유류.m1()");
    }
  }
  static class 유인원 extends 포유류 {
    int v2;
    void m2() {
      System.out.println("유인원.m2()");
    }
  }
  static class 사람 extends 유인원 {
    int v3;
    void m3() {
      System.out.println("사람.m3()");
    }
  }

  public static void main(String[] args) {
    포유류 a1 = new 포유류(); // OK
    포유류 a2 = new 유인원(); // OK
    포유류 a3 = new 사람(); // OK

    //유인원 b1 = new 포유류(); // 컴파일 오류!
    유인원 b2 = new 유인원(); // OK
    유인원 b3 = new 사람(); // OK

    //사람 c1 = new 포유류(); // 컴파일 오류!
    //사람 c2 = new 유인원(); // 컴파일 오류!
    사람 c3 = new 사람(); // OK
  }
}

/*
# 다형적 변수
- 레퍼런스 변수는 오직 한 개의 클래스 인스턴스만 저장하는 것이 아니다.
- 다양한 타입의 인스턴스를 저장할 수 있다.
- 단 같은 클래스이거나 하위 클래스의 인스턴스를 가리킬 수 있다.

# 참고
- 클래스 이름, 변수 이름, 메서드 이름은 유니코드에서 특수 문자나,
  자바에서 사용하지 말라고 지정한 문자를 제외하고
  어떤 국가의 문자라도 사용할 수 있다.
- 자바 소스 파일의 문자 인코딩이 UTF-8로 되어 있을 경우,
  컴파일 할 때 옵션으로 -encoding utf8 을 지정해야만
  한글 클래스명이 허락된다.
  왜? windows 의 기본 문자 집합은 MS949이기 때문이다.







*/

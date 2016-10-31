/* 주제: 상속과 다형성 - 다형적 변수(polymorphic variable) */
package step11;

public class Exam072_1 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      this.v1 = 100;
      this.v2 = 200;
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      this.v1 = 100;
      this.v2 = 200;
      this.v3 = 300;
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    A a1 = new A(); // OK
    A a2 = new B(); // OK
    A a3 = new C(); // OK

    //B b1 = new A(); // 컴파일 오류!
    //b1.m2(); // B의 m2() 메서드에서 B의 v2 변수를 사용할 수 있기 때문에.
    B b2 = new B(); // OK
    B b3 = new C(); // OK

    //C c1 = new A(); // 컴파일 오류!
    //C c2 = new B(); // 컴파일 오류!
    C c3 = new C(); // OK
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

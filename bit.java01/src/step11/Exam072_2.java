/* 주제: 상속 - 오버라이딩 하기 전의 메서드 호출하는 방법 II */
package step11;

public class Exam072_2 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m2() {System.out.printf("B.m2()\n");}
    void m3() {System.out.printf("B.m3()\n");}
  }
  static class C extends B {
    void m1() {System.out.printf("C.m1()\n");}
    void m2() {System.out.printf("C.m2()\n");}
    void m4() {System.out.printf("C.m3()\n");}

    void test1() {
      //super.m4(); // 컴파일 오류! 조상 클래스들 중에 m4() 메서드가 없다.
      super.m1(); // OK! A.m1()
      super.m2(); // OK! B.m2()
      super.m3(); // OK! B.m3()
      super.super.m2(); // 컴파일 오류! 이런 문법은 없다.
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.test1();


  }
}

/*
# super 키워드
- super의 의미는 바로 위의 클래스를 가리키는 것이 아니다.
  바로 위 클래스부터 꼭대기 클래스까지 찾으라는 뜻이다.


# this vs super
- this는 메서드를 찾을 때 현재 클래스(레퍼런스 변수의 클래스)부터 찾는다.
- super는 현재 클래스의(레퍼런스 변수의 클래스의) 수퍼 클래스부터 찾는다. 







*/

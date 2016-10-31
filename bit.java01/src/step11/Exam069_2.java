/* 주제: 상속 - 상속과 .class 파일*/
package step11;

public class Exam069_2 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.m1();
  }
}

/*
# 상속과 .class 파일
- 서브 클래스는 수퍼 클래스의 정보를 갖고 있다.
- 주의!
  상속의 의미는 서브 클래스가 수퍼 클래스의 코드를 사용할 수 있다는 뜻이다.
  그래서 서브 클래스는 수퍼 클래스의 코드를 포함하지 않는다.
  다만 수퍼 클래스에 대한 연결 정보만 갖고 있다.
- 결론
  서브 클래스를 컴파일하거나 실행하려면 반드시 수퍼 클래스가 있어야 한다.

# 증명
- 컴파일 한 후 실행하기 전에 A.class, B.class 파일을 제거하라!
  그런 후 실행하라!
  실행 중에 A.class와 B.class를 찾지 못했다고 예외가 발생할 것이다.









*/

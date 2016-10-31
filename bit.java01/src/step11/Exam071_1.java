/* 주제: 상속 - 인스턴스 변수 오버라이딩 */
package step11;

public class Exam071_1 {
  static class A {
    int v1 = 10;
    int v3 = 10;
    void m1() {
      System.out.printf("A.m1(): v1=%d\n", this.v1);
      System.out.printf("A.m1(): v3=%d\n", this.v3);
    }
  }
  static class B extends A {
    int v1 = 100;
    int v2 = 100;
    void m2() {
      System.out.printf("B.m2(): v1=%d\n", this.v1);
      System.out.printf("B.m2(): v2=%d\n", this.v2);
      System.out.printf("B.m2(): v3=%d\n", this.v3);
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.m1();
    System.out.println("-------------------");

    B obj2 = new B();
    obj2.m2();
    obj2.m1();
  }
}

/*
# 인스턴스 변수 오버라이딩(overriding)
- 수퍼 클래스의 변수를 자식 클래스에서 재정의 하는 것.
- 즉 수퍼 클래스의 변수 이름과 같은 인스턴스 변수를 만들 수 있다는 것이다.
- 따라서 인스턴스를 생성할 때
  이전과 동일하게 모든 직계 조상의 인스턴스 변수를 만든다.
  이름이 같더라도 상관없이 개별적으로 만든다.

# 인스턴스 변수 찾는 순서
1) 자신이 속한 클래스의 설계도로 만든 인스턴스 변수를 먼저 사용한다.
2) 자신이 속한 클래스 설계도에 없는 변수라면 수퍼 클래스의 변수를 사용한다.









*/

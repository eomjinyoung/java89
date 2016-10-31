/* 주제: 상속 - 수퍼 클래스의 메서드 호출 */
package step11;

public class Exam071_0 {
  static class A {
    int v1;
    void m1() {
      System.out.printf("A.m1(): %d\n", this.v1);
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.printf("B.m2(): %d\n", this.v1);
      System.out.printf("B.m2(): %d\n", this.v2);
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.v1 = 100;
    obj.m1();

    B obj2 = new B();
    obj2.v2 = 100;
    obj2.m2();

    obj2.v1 = 200;
    obj2.m1(); // <-- 수퍼 클래스의 메서드를 호출할 수 있다.
  }
}

/*
# 상속 관계에 있는 클래스의 메서드 호출
- 제일 먼저 레퍼런스의 타입(클래스)에서 메서드를 찾는다.
  => 있으면, 호출한다.
  => 없으면, 수퍼 클래스로 가서 메서드를 찾는다.
     => 있으면 호출한다.
     => 없으면, 다시 더 위의 수퍼 클래스로 가서 메서드를 찾는다.
        => 있으면 호출한다.
        ... 계속 최고 꼭대기 클래스에 도착할 때까지 반복한다.











*/

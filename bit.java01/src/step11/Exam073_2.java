/* 주제: 상속과 다형성 - 오버라이딩(overriding) 메서드와 다형적 변수*/
package step11;

public class Exam073_2 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      System.out.println("A.m1()");
    }
    void m2() {
      System.out.println("A.m2()");
    }
  }
  static class B extends A {
    int v2;
    void m1(String v, int v2) { // 수퍼 클래스의 메서드를 오버라이딩 하였다.
      System.out.println("B.m1()");
    }
    void m3() {
      System.out.println("B.m3()");
    }
  }
  public static void main(String[] args) {
    A obj2 = new A();
    obj2.m1("2000", 2000); // A의 m1() 메서드가 호출된다.
    obj2.m2(); // A의 m2() 메서드가 호출된다.
    System.out.println("--------------------------");

    B obj = new B();
    obj.m1("2000", 2000); // B의 메서드가 호출된다.
    obj.m2(); // 수퍼클래스 A의 m2() 메서드가 호출된다.
    obj.m3(); // B의 메서드가 호출된다.
    System.out.println("--------------------------");


    // 이 예제의 핵심!
    A obj3 = new B();
    obj3.m1("2000", 2000); // ? B의 m1() 메서드가 호출된다.
    obj3.m2(); // A의 m2() 메서드가 호출된다.
    //obj3.m3(); // 컴파일 오류! m3()는 A의 메서드가 아니다.
    System.out.println("--------------------------");

  }
}

/*
# 다형적 변수에서 메서드를 호출할 때 특이점
- 만약 레퍼런스가 하위 클래스의 인스턴스를 가리키고 있다면,
        A obj3 = new B();
  메서드를 호출할 때 마다 하위 클래스에서 오버라이딩 한 메서드인지 조사하여
  오버라이딩 한 메서드라면 그 하위 클래스의 메서드를 호출한다.
        obj3.m1("2000", 2000); // B의 m1() 메서드가 호출된다.










*/

/* 주제: 상속과 다형성 - 다형적 변수와 메서드 호출 */
package step11;

public class Exam072_2 {
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
    C obj1 = new C();
    obj1.m1(); // 수퍼 클래스의 메서드 호출할 수 있다.
    obj1.m2(); // 수퍼 클래스의 메서드 호출할 수 있다.
    obj1.m3();
    System.out.println("-------------------");

    B obj2 = new B();
    obj2.m1(); // 수퍼 클래스의 메서드 호출할 수 있다.
    obj2.m2();
    System.out.println("-------------------");

    A obj3 = new A();
    obj3.m1(); // 자기꺼 호출한다.
    System.out.println("-------------------");

    // 만약 레퍼런스가 하위 클래스의 인스턴스를 가리킬 때 어디까지 메서드를 호출할 수 있나?
    A obj4 = new C();
    obj4.m1();
    //메서드를 호출할 때는 레퍼런스의 타입(클래스)에 해당하는 것만 사용할 수 있다.
    //=> 자바 컴파일러는 단순하다. 레퍼런스가 무엇을 가리키고 있는지를 따지지 않고
    //   그냥 그 레퍼런스가 어떤 클래스의 변수인지만 고려해서 검사한다.
    //obj4.m2(); // 컴파일 오류! m2()는 A클래스에 있는 메서드가 아니라서 오류 발생!
    //obj4.m3(); // 컴파일 오류!

  }
}

/*
#






*/

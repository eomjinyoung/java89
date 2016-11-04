/* 상속 - super() : 수퍼 클래스의 생성자 호출
=> 인스턴스를 생성할 때,
   - 현재 클래스의 설계도에 따라 인스턴스 변수를 준비한다.
   - 또한 수퍼 클래스의 설계도도 참조하여 인스턴스 변수를 준비한다.
=> 생성자를 호출할 때,
   - 현재 클래스의 설계도에 따라 만든 변수는 현재 클래스의 생성자를 호출하여
     초기화시키는 것은 당연하다.
   - 그러면 수퍼 클래스의 설계도에 따라 만든 변수는 누가 초기화시키는 것이 타당할까?
     당연히 수퍼 클래스의 생성자를 호출하는 것이 당연하다.
=> 결론
   그래서 자바에서는 생성자를 호출할 때,
   그 클래스 생성자에서 최상위 클래스의 생성자까지 자동으로 호출한다.

*/ 
package step15;

public class Exam083_0 {
  static class A {
    int v1;
    public A() {
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    // 수퍼 클래스의 생성자가 호출되는 것을 확인해보자!
    A obj1 = new A();
    System.out.println("-------------------------");

    B obj2 = new B();
    System.out.println("-------------------------");

    C obj3 = new C();
    System.out.println("-------------------------");
  }
}
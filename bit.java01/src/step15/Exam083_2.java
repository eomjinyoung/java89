/* 상속 - super() : 수퍼 클래스의 생성자 호출 III
=> 만약 개발자가 이 명령어를 작성하지 않으면,
   컴파일러가 자동으로 수퍼 클래스의 기본 생성자를 호출하는 명령어를 추가한다.

=> 다시 주석으로 확인하자! 코드는 Exam083_0과 같다.
*/ 
package step15;

public class Exam083_1 {
  static class A {
    int v1;
    public A() {
      // super() 명령어가 없으면, 다음 코드를 자동으로 삽입한다. 
      // 그래서 다음 코드를 생략해도 된다.
      //super();
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      // super() 명령어가 없으면, 다음 코드를 자동으로 삽입한다. 
      // 그래서 다음 코드를 생략해도 된다.
      //super();
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      // super() 명령어가 없으면, 다음 코드를 자동으로 삽입한다. 
      // 그래서 다음 코드를 생략해도 된다.
      //super();
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println("-------------------------");

    B obj2 = new B();
    System.out.println("-------------------------");

    C obj3 = new C();
    System.out.println("-------------------------");
  }
}
/* 상속 - super()의 잘못된 사용 : 일반 메서드에서 수퍼 클래스의 생성자를 호출할 수 없다.
*/ 
package step15;

public class Exam085_0 {
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

    public void m1() {
      super(); // 컴파일 오류! 일반 메서드에서 생성자를 호출할 수 없다.
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    System.out.println("-------------------------");
  }
}
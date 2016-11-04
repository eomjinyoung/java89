/* 상속 - super()와 this()
*/ 
package step15;

public class Exam085_1 {
  static class A {
    int v1;
    public A() {
      //super();
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      // super();
      System.out.println("B()...");
      v2 = 200;
    }

    public B(int a) {
      this(); // B(int) --> B() --> A()
      System.out.println("B(int)...");
      v2 = a;
    }
  }

  public static void main(String[] args) {
    B obj = new B(100);
    System.out.println("-------------------------");
  }
}
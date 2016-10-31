/* 주제: 상속과 다형성 - 자바 최상위 수퍼 클래스 Object II*/
package step11;

public class Exam075_1 /*extends Object*/ {
  static class A /*extends Object*/ {}
  static class B extends A {}

  public static void main(String[] args) {
    A obj1 = new A();
    String str = obj1.toString(); // 수퍼 클래스 Object의 toString() 메서드.
    System.out.println(str);
  }
}

/*
#




*/

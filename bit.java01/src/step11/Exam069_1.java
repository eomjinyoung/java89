/* 주제: 상속 - 문법: 다중 상속 불가!*/
package step11;

public class Exam069_1 {
  static class A {}
  static class B extends A {}
  static class C extends A {}
  static class D extends B, C {} // 컴파일 오류!

  public static void main(String[] args) {

  }
}

/*
# 클래스 다중 상속
- 자바는 클래스의 다중 상속을 지원하지 않는다.









*/

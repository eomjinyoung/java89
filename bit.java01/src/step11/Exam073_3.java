/* 주제: 상속과 다형성 - 오버라이딩(overriding) 검사하기*/
package step11;

public class Exam073_3 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    // 다음과 같이 개발자가 잘못된 오버라이딩을 할 경우가 있다.
    // 즉 오버라이딩(재정의)이 아니라 오버로딩(추가등록)이 된 경우다.
    // 그러나 개발자는 올바르게 오버라이딩 했다고 착각하고 사용할 수 있다.
    // 그래서 이것을 막는 문법이 등장하였다.
    // 컴파일러에게 오버라이딩이 맞는지 검사하는 방법이다.
    // 애노테이션이라는 특별한 주석을 사용하여 컴파일러에게 명령을 내려보자!
    @Override
    void m1(int value2, String value) {
      System.out.println("B.m1()");
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.m1("haha", 20);
  }
}

/*
# 애노테이션(annotation)
- 컴파일러나 JVM에게 전달하는 특별한 주석이다.
- 컴파일러나 JVM은 이 주석을 참조하여 지정된 작업을 수행한다.
- 문법
  @애노테이션이름(속성=값,속성=값,속성=값...)

# @Override
- 컴파일러에게 전달하는 애노테이션이다.
- 메서드가 오버라이딩 하는 지 검사하라는 명령어다.
- 메서드가 수퍼 클래스의 메서드를 오버라이딩 하지 않는다면,
  컴파일러는 오류를 발생시킨다.




*/

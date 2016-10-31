/* 주제: 상속과 다형성 - 오버로딩(overloading) */
package step11;

public class Exam074_0 {
  static class A {
    int result;
    void plus(int value) {
      result += value;
    }
  }
  static class B extends A {
    void minus(int value) {
      result -= value;
    }
    // 수퍼 클래스의 메서드와 기능이 같은
    // 그래서 이름도 같은 메서드를 추가한다.
    // => 오버로딩이다.
    void plus(int value1, int value2) {
      this.result += value1 + value2;
    }

    // 자신이 갖고 있는 메서드와 이름이 같은 메서드를 선언할 때도
    // => 오버로딩이라 한다.
    void minus(int value1, int value2) {
      result -= value1 - value2;
    }
  }
  public static void main(String[] args) {
    B obj = new B();
    // 호출할 때 어떻게 이름이 같은 메서드를 구분하는가?
    // => 파라미터 값의 개수와 타입과 순서로 구분한다.
    obj.plus(10); // A.plus(int)
    obj.plus(10, 20); // B.plus(int, int)
    obj.minus(10); // B.minus(int)
    obj.minus(10, 20); // B.minus(int, int)
    //obj.minus(10, 20, 30); // 컴파일 오류! minus(int, int, int)를
                          // B 클래스에서도 찾지 못하고
                          // 수퍼 클래스 A에서도 못 찾는다.
  }
}

/*
# 오버로딩(overloading)
- 현재 클래스에 있는 메서드이거나 또는 상속 받은 메서드와
  이름은 같지만 파라미터의 타입과 개수, 순서가 다른 메서드를 추가하는 것.
- 목적
  파라미터의 개수나, 순서, 타입이 다르더라도
  같은 기능을 하는 메서드에 대해 같은 이름을 부여하여
  일관된 프로그래밍을 지원하는 문법





*/

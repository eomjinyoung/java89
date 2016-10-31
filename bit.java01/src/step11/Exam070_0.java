/* 주제: 상속 - 상속과 인스턴스 변수*/
package step11;

public class Exam070_0 {
  static class A {
    int v1;
  }
  static class B extends A {
    int v2;
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.v2 = 100;
    System.out.println(obj.v2);

    obj.v1 = 200;
    System.out.println(obj.v1);
  }
}

/*
# 수퍼 클래스가 있는 경우 인스턴스 생성
- 인스턴스를 생성할 때는 그 클래스의 수퍼 클래스 설계도까지 참조하여
  인스턴스 변수를 준비한다.
  만약 수퍼 클래스의 수퍼 클래스가 있다면 그 꼭대기까지 올라가서
  모든 직계 조상 클래스들의 설계도를 참조하여 인스턴스 변수를 만든다.









*/

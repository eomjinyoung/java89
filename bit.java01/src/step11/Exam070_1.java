/* 주제: 상속 - 상속과 인스턴스 변수 II*/
package step11;

public class Exam070_1 {
  static class A {
    int v1;
  }
  static class B extends A {
    int v2;
  }
  static class X extends A {
    int vx;
  }
  static class C extends B {
    int v3;
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.v3 = 300;
    System.out.println(obj.v3);

    obj.v2 = 100; //<-- 수퍼 클래스 B 설계도에 따라 만든 변수
    System.out.println(obj.v2);

    obj.v1 = 200; //<-- 수퍼 클래스 A 설계도에 따라 만든 변수
    System.out.println(obj.v1);

    //obj.vx = 500; //컴파일 오류! 설계도는 반드시 직계 조상만 참조한다.
                  //X 클래스는 C의 직계 조상이 아니다.
  }
}

/*
# 인스턴스 생성과 수퍼 클래스
- 인스턴스 생성할 때 수퍼 클래스의 설계도를 참조하는데,
  반드시 직접 extends로 연결된 수퍼 클래스만 참조한다.
  => 쉽게 얘기하면 직계 조상만 참조한다.








*/

/* 주제: 클래스 로딩
*/

package step10;

import java.util.Scanner;

public class Exam064_0 {
  static {
    System.out.println("Exam064_0: 스태틱 초기화 블록 실행");
  }

  static class MyType {
    static int a;
    int b;
    static {
      System.out.println("MyType: 스태틱 초기화 블록 실행");
    }

    static void m1() {
      System.out.println("MyType: m1()");
    }
  }

  public static void main(String[] args) {
    System.out.println("main()....");

    //1) MyType 클래스 로딩시키기 : 스태틱 변수를 사용한다.
    //MyType.a = 100; // (MyType 클래스 로딩 --> 스태틱 변수 생성) --> 스태틱 초기화 블록 실행

    //2) MyType 클래스 로딩시키기 : 스태틱 메서드를 사용한다.
    //MyType.m1(); // 스태틱 메서드를 호출하려면 클래스가 메모리에 있어야 할 것 아닌가?

    //3) MyType 클래스 로딩시키기 : new 명령을 사용한다.
    //new MyType();
    //new MyType(); // 한 번 클래스가 로딩되면 중복해서 로딩되지 않는다.

    //4) 레퍼런스 변수 선언은 클래스를 로딩하지 않는다.
    MyType obj = null;

  }
}

/*
# 클래스 로딩
- 그 클래스의 스태틱 변수나 스태틱 메서드를 최초로 사용하는 시점에서 로딩된다.
- 또는 new 명령을 최초로 실행하는 시점에서 로딩된다.
- 주의!
  레퍼런스 변수를 만들 때는 스태틱 블록을 실행하지(클래스를 로딩하지) 않는다.

# main()이 스태틱인 이유?
- JVM이 클래스를 실행할 때 해당 클래스를 로딩하고 바로 main() 호출할 수 있도록 하기 위함.




*/

/* 주제: 변수 선언의 의미
*/

package step10;

import java.util.Scanner;

public class Exam063_5 {
  static class MyType {
    static int a; // 스태틱 변수
    int b; // 인스턴스 변수
  }

  public static void main(String[] args) {
    int c; // 로컬 변수
    c = 100;

    MyType.a = 200;

    MyType obj = new MyType();
    obj.b = 300;
  }
}

/*
# 변수 선언
- 값을 저장할 메모리를 확보하라는 명령이다.
- 예)
static int a;
  => 정수 값을 저장할 4바이트 크기의 메모리를 Method Area 영역에 확보하라!

int b;
  => 정수 값을 저장할 4바이트 크기의 메모리를 Heap 영역에 확보하라!

int c;
  => 정수 값을 저장할 4바이트 크기의 메모리를 JVM 스택 영역에 확보하라!

# 로컬 변수 명령어 실행 시점
- 로컬 변수 선언이 있는 메서드가 호출될 때 그 명령어가 실행된다.
- 예를 들면, "int c;" 라는 명령은 main() 메서드가 호출될 때 실행된다.

# 인스턴스 변수 명령어 실행 시점
- new 명령이 실행될 때 그와 관련된 클래스의 인스턴스 변수 선언 명령어가 실행된다.
- 예를 들면, "int b;" 라는 명령은
  main() 메서드를 실행하면서 new MyType()을 실행할 때
  MyType의 인스턴스 변수 b를 Heap 영역에 생성한다.

# 스태틱 변수 명령어 실행 시점
- 클래스를 로딩 한 후 스태틱 변수 선언 명령을 실행한다.






*/

// 주제: 명령어 흐름 제어 - 블록

package step05;

public class Exam045_0 { // 클래스 블록
  public static void main(String[] args) { // 메서드 블록
    System.out.println("1111");
    { // 일반 블록
      System.out.println("2222");
    }

    int a = 10;
    if (a > 10) { // 조건 블록
      if (a < 15) { // 조건 블록

      } else { // 조건 블록

      }
    }

  }
}

/*
# 블록의 종류
1) 클래스 블록
   => 메서드, 변수선언, 인스턴스 블록, 스태틱 블록
2) 메서드 블록
   => 명령어들, 명령어 블록, 일반 블록
3) 명령어 블록
   => 조건에 따라 실행할 명령어를 묶어 놓은 것
4) 일반 블록
   => 조건 없이 실행할 명령을 묶어 놓은 것









*/

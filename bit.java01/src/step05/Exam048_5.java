// 주제: 명령어 흐름 제어 - 반복문 while 중첩과 break II

package step05;

public class Exam048_5 {
  public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    ohora:
    while (count++ < 5) {
      while (count2++ < 3) {
        System.out.println("*****");
        if (count > 2)
          break ohora;
      }
      count2 = 0;
      System.out.println("--------------------");
    }

  }
}

/*
# 현재 while 블록을 나가는 것이 아니라 바깥쪽 while 블록을 나가고 싶을 때?
- 바깥 쪽 while 블록에 라벨을 붙여라.
- break 라벨명;




*/

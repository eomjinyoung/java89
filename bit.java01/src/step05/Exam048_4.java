// 주제: 명령어 흐름 제어 - 반복문 while 중첩과 break

package step05;

public class Exam048_4 {
  public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    while (count++ < 5) {
      while (count2++ < 3) {
        System.out.println("*****");
        if (count > 2)
          break;
      }
      count2 = 0;
      System.out.println("--------------------");
    }

  }
}

/*
# break 명령은 현재 실행하는 while 블록을 나간다.




*/

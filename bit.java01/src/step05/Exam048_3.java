// 주제: 명령어 흐름 제어 - 반복문 while 중첩 사용

package step05;

public class Exam048_3 {
  public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    while (count++ < 5) {
      while (count2++ < 3) {
        System.out.println("*****");
      }
      count2 = 0;
      System.out.println("--------------------");
    }

  }
}

/*





*/

// 주제: 명령어 묶기 - 메서드 의미 (메서드 사용 후)

package step06;

public class Exam052_1 {
  // 1) 메서드 정의 : 명령어들을 분리하여 놓고 이름을 부여한 것.
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int count = 6;
    while (--count > 0) {
      printStarsLine(count); // 2) 정의된 메서드 호출
    }
    System.out.println("-------------------------");
    count = 0;
    while (count++ < 5) {
      printStarsLine(count); // 2) 언제든 이렇게 메서드를 재사용 할 수 있다.
    }
  }
}


/*













*/

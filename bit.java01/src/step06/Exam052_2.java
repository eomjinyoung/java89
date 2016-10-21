// 주제: 명령어 묶기 - 메서드 활용 예 (메서드 사용 후) II

package step06;

public class Exam052_2 {
  // 1) 메서드 정의 : 명령어들을 분리하여 놓고 이름을 부여한 것.
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  static void printCenterStarsLine(int lineSize, int starLength) {
    if (lineSize % 2 == 0) {
      lineSize += 1;
    }
    if (starLength > lineSize) {
      starLength = lineSize;
    }
    int blankLength = (lineSize - starLength) / 2;

    for (int i = 0; i < blankLength; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < starLength; i++) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int count = 6;
    while (--count > 0) {
      printStarsLine(count);
    }
    System.out.println("-------------------------");
    for (int i = 1; i <= 9; i += 2) {
      printCenterStarsLine(9, i);
    }
  }
}


/*













*/

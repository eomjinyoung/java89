// 주제: 명령어 흐름 제어 - 반복문 for 응용 III
//=> 다음과 같이 구구단을 출력하라.
/*
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
2 * 9 = 18

3 * 1 = 3
3 * 2 = 6
..

9 * 9 = 81;
*/
package step05;

public class Exam050_6 {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
      System.out.println();
    }
  }
}


/*
#




*/

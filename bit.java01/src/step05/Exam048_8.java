// 주제: 명령어 흐름 제어 - 반복문 while 응용 III
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

public class Exam048_8 {
  public static void main(String[] args) {
    int a = 2;
    int b = 1;

    while (a < 10) {
      while (b < 10) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        b++;
      }
      a++;
      b = 1;
      System.out.println();
    }


  }
}

/*



*/

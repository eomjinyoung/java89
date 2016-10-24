// 주제: 인스턴스와 레퍼런스 - 배열

package step07;

public class Exam057_1 {
  public static void main(String[] args) {
    int[] arr1 = {10, 20, 30}; // 배열은 상수가 없다. new int[] {}의 단축 문법.
    int[] arr2 = {10, 20, 30}; // 힙에 배열을 생성한다.

    if (arr2 == arr1) { // 같지 않다.
      System.out.println("arr2 == arr1");
    }
  }
}

/*










*/

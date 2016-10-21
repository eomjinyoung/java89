// 주제: 명령어 묶기 - 임의 개수의 값을 받는 변수 응용 I
// => 배열을 사용할 때와 varargs를 사용할 때 비교

package step06;

public class Exam054_2 {
  static int sum(int[] values) {
    int result = 0;
    for (int value : values) {
      result += value;
    }
    return result;
  }

  static int sum2(int... values) {
    int result = 0;
    for (int value : values) {
      result += value;
    }
    return result;
  }

  public static void main(String[] args) {
    int result = sum(new int[]{100,100,100});
    System.out.println(result);
    System.out.println(sum(new int[]{90,90,90,90,90}));
    System.out.println("------------------------------");

    System.out.println(sum2(100,100,100));
    System.out.println(sum2(90,90,90,90,90));
    System.out.println("------------------------------");

    // 가변 개수 아규먼트인 경우 배열을 넘겨도 된다.
    System.out.println(sum2(new int[]{90,90,90,90,90}));

  }
}


/*











*/

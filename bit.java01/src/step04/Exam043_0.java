// 주제: 연산자 - 비트 이동 연산자
// => 오른쪽 이동(>>), 오른쪽 이동(>>>), 왼쪽 이동(<<)

package step04;

public class Exam043_0 {
  public static void main(String[] args) {
    int a = 0b1100; // 12
    //왼쪽 이동                  //     1100|   => 12
    System.out.println(a << 1); //     11000|   => 24
    System.out.println(a << 2); //    110000|   => 48
    System.out.println(a << 3); //   1100000|   => 96
    System.out.println(a << 4); //  11000000|   => 192

  }
}

/*
# 왼쪽 이동
- 2를 곱한 결과와 같다.
- 2를 곱하는 연산보다 속도가 빠르다.




*/

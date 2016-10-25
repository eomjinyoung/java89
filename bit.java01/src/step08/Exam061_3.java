/* 주제: 객체지향 핵심 문법 - 클래스 정리 : 정리2 예 (3단계)
=> 중간 계산 결과를 바깥에 두지 말고 그 계산과 관련된 클래스 안에 두면
   유지보수에 편리하다.
   => 스태틱 변수의 활용
*/

package step08;

public class Exam061_3 {
  static class Calculator {
    // 스태틱 변수:
    // => 클래스를 실행할 때(로딩할 때) Method Area 영역에 자동으로 준비된다.
    // => new 라는 명령에서는 제외된다.
    // => 클래스에 한 개만 존재한다.
    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    // 계산 수행(연산자 우선수위 고려하지 않는다)
    // => 3 + 2 * 3 - 1 = 14
    //int sum = 0; // 더이상 계산 결과를 담을 변수를 준비할 필요가 없다.
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);
  }


}

/*
# 스태틱 변수
- 클래스를 Method Area 영역에 로딩할 때 자동으로 생성되는 메모리다.
- 따라서 클래스에 한 번만 생성된다.
- JVM이 종료될 때까지 유지된다.








*/

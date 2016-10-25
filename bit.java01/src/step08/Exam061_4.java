/* 주제: 객체지향 핵심 문법 - 클래스 정리 : 정리2 예 (4단계)
=> 계산 결과를 개별적으로 관리하려면?
   => 안타깝게도 스태틱 변수는 클래스가 로딩될 때 한 번만 생성되므로
      개별적으로 값을 유지할 방법이 없다.
   => 그냥 계산식을 순차적으로 실행하는 수 밖에 없다.
*/

package step08;

public class Exam061_4 {
  static class Calculator {
    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    // 계산 수행(연산자 우선수위 고려하지 않는다)
    // 만약에 두 개의 계산을 동시에 실행한다면?
    // => 3 + 2 * 3 - 1 = 14
    // => 4 * 5 - 7 / 2 = 6

    // Calculator 클래스에 sum이라는 변수가 오직 한 개만 있기 때문에
    // 동시에 여러 계산을 진행할 수 없다.
    // 무조건 계산식을 차례대로 실행해야 한다.
    // 따라서 다음과 같이 한 계산식을 끝내고 다른 계산식을 실행해야 한다.
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

    Calculator.sum = 0;
    Calculator.plus(4);
    Calculator.multiple(5);
    Calculator.minus(7);
    Calculator.divide(2);
    System.out.println(Calculator.sum);

  }


}

/*
# 스태틱 변수
- 클래스를 Method Area 영역에 로딩할 때 자동으로 생성되는 메모리다.
- 따라서 클래스에 한 번만 생성된다.
- JVM이 종료될 때까지 유지된다.








*/

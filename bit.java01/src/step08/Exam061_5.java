/* 주제: 객체지향 핵심 문법 - 클래스 정리 : 정리2 예 (5단계)
=> 값을 개별적으로 관리하고 싶다면,
   스태틱 변수로 만들지 말고, 인스턴스 변수로 만들라!
=> 인스턴스 변수?
   - static 이 붙지 않은 변수
   - 인스턴스 변수는 스태틱 변수와 달리 클래스가 로딩될 때 생성되지 않는다.
   - new 명령을 사용하여 별도로 생성해야 한다.
*/

package step08;

public class Exam061_5 {
  static class Calculator {
    int sum = 0; // 인스턴스 변수로 선언한다.

    // 인스턴스 변수는 스태틱 메서드에서 직접 접근할 수 없다.
    // => 반드시 인스턴스 주소가 있어야 한다.
    static void plus(Calculator that, int a) {that.sum += a;}
    static void minus(Calculator that, int a) {that.sum -= a;}
    static void multiple(Calculator that, int a) {that.sum *= a;}
    static void divide(Calculator that, int a) {that.sum /= a;}
  }

  public static void main(String[] args) {
    // 계산 수행(연산자 우선수위 고려하지 않는다)
    // 만약에 두 개의 계산을 동시에 실행한다면?
    // => 3 + 2 * 3 - 1 = 14
    // => 4 * 5 - 7 / 2 = 6

    // 두 개의 계산식 결과를 저장할 메모리를 따로 따로 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 3);
    Calculator.plus(c2, 4);

    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 5);

    Calculator.multiple(c1, 3);
    Calculator.minus(c2, 7);

    Calculator.minus(c1, 1);
    Calculator.divide(c2, 2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);

  }


}

/*








*/

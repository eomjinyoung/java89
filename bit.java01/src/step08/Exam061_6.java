/* 주제: 객체지향 핵심 문법 - 클래스 정리 : 정리2 예 (6단계)
=> 인스턴스 변수를 메서드에서 쉽게 다루고 싶다.
   => 인스턴스 메서드로 만들라!
   => static 을 붙이지 말아라.
   => 단 호출할 때 인스턴스 주소를 메서드 앞에 둔다.
   => 그리고 메서드는 내장 변수 this에 그 주소를 저장한다.
*/

package step08;

public class Exam061_5 {
  static class Calculator {
    int sum = 0; // 인스턴스 변수로 선언한다.

    // 인스턴스 메서드
    // => 메서드 내장 변수 this에 인스턴스 주소가 전달되기 때문에
    //    파라미터로 인스턴스 주소를 굳이 받을 필요가 없다.
    void plus(int a) {this.sum += a;}
    void minus(int a) {this.sum -= a;}
    void multiple(int a) {this.sum *= a;}
    void divide(int a) {this.sum /= a;}
  }

  public static void main(String[] args) {
    // 계산 수행(연산자 우선수위 고려하지 않는다)
    // 만약에 두 개의 계산을 동시에 실행한다면?
    // => 3 + 2 * 3 - 1 = 14
    // => 4 * 5 - 7 / 2 = 6

    // 두 개의 계산식 결과를 저장할 메모리를 따로 따로 준비한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(3);
    c2.plus(4);

    c1.plus(2);
    c2.multiple(5);

    c1.multiple(3);
    c2.minus(7);

    c1.minus(1);
    c2.divide(2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);

  }


}

/*








*/

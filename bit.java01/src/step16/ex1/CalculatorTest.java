/* 주제: 인스턴스 변수에 직접 접근했을 때 발생되는 문제
*/
package step16.ex1;

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    //3 + 5 - 1
    calc.plus(3);
    calc.plus(5);
    calc.result = 5; // 직접 계산기 객체의 result 변수에 접근하여 값을 넣는 것을 막을 수 없다.
    calc.minus(1);

    System.out.println(calc.result);
  }

}
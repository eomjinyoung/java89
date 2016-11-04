/* 주제: 접근 제한된 변수의 값을 꺼내는 방법 => 공개된 메서드 호출
*/
package step16.ex2;

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    //3 + 5 - 1
    calc.plus(3);
    calc.plus(5);
    //calc.result = 5; // 접근 불가! 컴파일 오류.
                      // 함부로 result 변수에 접근하지 못하게 막는다.
                      // result의 값은 오직 그 멤버들만이 다룰 수 있다.
                      // 따라서 계산 결과의 신뢰성을 확보할 수 있다.
    calc.minus(1);

    System.out.println(calc.getResult());
  }

}
/* 주제: 여러 방법으로 동시에 로그 출력
 * 1) 로그 출력명 지정
 *    - log4j.rootLogger=DEBUG, log1, log2, log3...
 */
package step31.ex5;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

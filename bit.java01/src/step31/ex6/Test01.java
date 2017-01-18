/* 주제: 로그 파일 자동 백업 확인!
 * => Test01을 여러 번 실행 시켜서 로그 파일이 꽉 찼을 때
 *    자동으로 백업되는 것을 확인하라!
 */
package step31.ex6;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

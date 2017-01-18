/* 주제: 로그를 분류에 따라 출력 레벨을 조정하기
 * => myLog: FATAL 레벨만 출력
 *    myLog2: DEBUG 레벨까지 출력
 * => 분류에 대해 로그 레벨을 지정하지 않으면
 *    log4j.rootLogger=DEBUG, stdout
 *    즉, rootLogger 출력 레벨이 그대로 적용된다.
 * => 분류 별로 로그 레벨을 지정하려면 다음과 같이 한다.
 *    log4j.logger.로그출력명=레벨
 *    예) log4j.logger.myLog=FATAL
 */
package step31.ex7;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Calculator2 calc2 = new Calculator2();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc2.plus(10, 20));
  }

}

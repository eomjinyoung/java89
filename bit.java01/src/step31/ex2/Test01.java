/* 주제: log4j.properties 작성 규칙
 * 1) 출력 레벨을 지정하기
 *    - log4j.rootLogger=출력레벨, A1
 * - 출력 레벨
 *   FATAL  : 애플리케이션을 중지시키야 하는 심각한 오류일 때, 이 레벨로 로그를 남겨라! 
 *   ERROR  : 오류가 발생했지만 애플리케이션은 계속 실행할 수 있을 때, 이 레벨로 로그를 남겨라!
 *   WARN   : 잠재적인 위험을 갖고 있을 때, 이 레벨로 로그를 남겨라!
 *   INFO   : 애플리케이션의 주요 실행 정보를 남기고 싶을 때, 이 레벨로 로그를 남겨라!
 *   DEBUG  : 애플리케이션의 내부 실행 상태를 남기로 싶을 때, 이 레벨로 로그를 남겨라!
 *   TRACE  : 아주 상세한 실행 내부 실행 상태를 남기고 싶을 때, 이 레벨로 로그를 남겨라!
 * - 출력 레벨을 설정하면 다음 규칙에 따라 하위 레벨의 로그도 함께 출력한다.
 *   TRACE > DEBUG > INFO > WARN > ERROR > FATAL
 *   예) 로그 레벨을 DEBUG로 설정하면 그 하위 레벨인 INFO, WARN, ERROR, FATAL 로그까지 출력된다.
 */
package step31.ex2;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

/* 주제: Log4J를 이용하여 실행 상태의 로그를 남기기
 * 1) Log4J 라이브러리 추가한다.
 *   - build.gradle에 추가 
 * 2) Log4J 설정 프로퍼티 파일 추가한다.
 *   - classpath에 log4j.properties 라는 이름을 파일을 생성한다.
 *   - 파일은 반드시 root 패키지에 있어야 한다.
 *   - 파일명은 반드시 "log4j.properties" 여야 한다.
 * 3) Log4J에서 제공하는 클래스를 사용하여 로그를 남긴다.
 */
package step31.ex1;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

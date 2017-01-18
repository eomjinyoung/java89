/* 주제: 파일로 로그 출력
 * 1) 로그 출력명 지정
 *    - log4j.rootLogger=DEBUG, logfile
 * 2) 로그 출력 방법을 설정
 *    - log4j.appender.logfile.File=org.apache.log4j.FileAppender
 * 3) 로그 파일명 지정
 *    - log4j.appender.logfile.File=파일명
 * 4) 로그 파일의 최대 크기
 *    - log4j.appender.logfile.MaxFileSize=크기KB
 * 5) 로그 파일의 최대 백업 인덱스
 *    - log4j.appender.logfile.MaxBackupIndex=인덱스
 * 6) 출력 형식 지정
 *    - log4j.appender.logfile.layout=출력형식클래스명
 * 7) PatternLayout의 출력 형식 지정하는 방법
 *    - %p : 로그 레벨 이름을 출력한다. 예)DEBUG, FATAL, INFO
 *    - %n : 줄바꿈 코드 넣기   
 *    - %m : 로그 메시지를 출력한다.  
 *    - %숫자p : 중간 숫자는 자릿수를 의미한다. 오른쪽 정렬.
 *    - %-숫자p : 숫자 앞에 '-'는 왼쪽 정렬을 의미한다.
 *    - %t : 스레드 이름을 출력한다.
 *    - %c : 로그 분류명 출력한다.
 *           로그 분류명? 
 *           static Logger logger = Logger.getLogger("myLog");
 *           => 로그 객체를 생성할 때 파라미터로 넘긴 이름. 즉 "myLog"!
 */
package step31.ex4;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

/* 주제: log4j.properties 작성 규칙 - 로그 방법 설정
 * 1) 로그 출력에 대해 별명을 선언
 *    - log4j.rootLogger=DEBUG, 로그출력명
 * 2) 로그 출력 방법을 설정
 *    - log4j.appender.로그출력명=출력 방법을 클래스 이름으로 지정
 *    - 출력 방법
 *      > 콘솔 출력 => org.apache.log4j.ConsoleAppender 
 *        내부적으로 System.out 또는 System.err 로 출력
 *      > 파일 출력 => org.apache.log4j.FileAppender 
 *        지정된 파일로 출력
 *      > 네트웍 출력 => org.apache.log4j.net.SocketAppender 
 *        원격 컴퓨터로 출력
 *      > DB 출력 => org.apache.log4j.jdbc.JDBCAppender 
 *        지정된 DBMS로 출력
 *           
 * 4) 출력 형식 지정
 *    - log4j.appender.로그출력명.layout=출력형식을 다루는 클래스명
 *    - 출력 형식
 *      > 단순 출력 => org.apache.log4j.SimpleLayout 
 *         예) "출력 등급 - 메시지"
 *      > HTML 테이블 형식으로 출력 => org.apache.log4j.HTMLLayout
 *      > 특정 패턴으로 출력 => org.apache.log4j.PatternLayout
 *        예) DEBUG [main]: 메시지 1
 *      > XML 형식으로 출력 => org.apache.log4j.xml.XMLLayout
 *        예) 
 *        <?xml version="1.0"?>
 *        <!DOCTYPE....>
 *        <log4j:eventset version="1.2"...>
 *          메시지..
 *        </log4j:eventset>
 * 4) PatternLayout의 출력 형식 지정하는 방법
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
 *    - %F : 로그를 출력하는 파일명.
 *    - %L : 로그를 출력하는 라인 번호.
 *    - %d : 날짜 및 시간 정보 출력.
 */
package step31.ex3;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
  }

}

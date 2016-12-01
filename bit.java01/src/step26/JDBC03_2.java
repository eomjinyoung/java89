/* 주제: PreparedStatement를 이용하여 Statement의 문제점 해결 
 * => SQL문을 만들 때 값이 들어갈 자리를 비워둔채로 만든다.
 *    SQL문을 만든후 값을 따로 넣는다.
 * => java.sql.PreparedStatement 구현체를 이용한다.
 *    - 이 객체를 만들 때 Connection의 prepareStatement()를 호출한다.    
 *    
 * => Statement vs PreparedStatement 
 * SQL 삽입 가능                         : SQL 삽입 불가!
 * 보안에 좋지 않은 구조                   보안에 좋은 구조
 * 
 * 실행할 때 마다 SQL을                  : 미리 SQL을 컴파일 해 두었다가
 * 매번 컴파일하여 서버에 전달             값을 첨부하여 서버에 전달   
 * 반복문을 이용하여                       반복문을 통해 SQL을 여러 번 실행하더라도 속도 빠름
 * SQL 실행한다면 속도 느림    
 * 
 * 문자열 연결 방식이기 때문에           : SQL 작성과 값 첨부가 분리되었기 때문에
 * 바이너리 데이터 전달 불가!              바이너리 데이터 첨부 가능! 
 * 
 * 문자열을 연결하여 SQL문을             : SQL문을 간결하게 표현할 수 있다. 
 * 만들다 보니 SQL문이 복잡하면            코드를 읽기 쉽다.
 * 코드를 읽기가 힘들어진다.
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC03_2 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      PreparedStatement stmt = con.prepareStatement(
          "update ex_contacts set tel=?, posi=? where email=?");
      Scanner keyScan = new Scanner(System.in); ){
      
      System.out.print("변경할 연락처의 이메일?");
      String email = keyScan.nextLine();
      
      System.out.print("새 전화번호?");
      String tel = keyScan.nextLine();
      
      System.out.print("새 직위?");
      String position = keyScan.nextLine();
      
      // 준비된 SQL문에 값을 넣는다.
      // 값을 넣을 때 컬럼의 타입에 따라 적절한 setXxx() 메서드를 호출한다.
      // 입력 위치를 숫자로 지정할 것이기 때문에 값을 넣는 순서는 상관없다.
      // 그래도 일부러 꺼꾸로 넣을 필요는 없지 않는가?
      stmt.setString(1, tel);
      stmt.setString(2, position);
      stmt.setString(3, email);
      
      // 실행할 때는 SQL 문을 파라미터로 넘기는 안된다.
      // 준비된 SQL문과 값을 그냥 실행하면 된다.
      int count = stmt.executeUpdate();
      
      System.out.printf("%d개 변경되었습니다.", count);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







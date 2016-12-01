/* 주제: 데이터 변경하기 
 * => executeUpdate() 메서드를 이용하여 SQL문을 전달한다.
 *    리턴 값: 변경된 레코드의 개수이다.
 * => SQL 문법
 *    update 테이블명 set 컬럼명=값, 컬럼명=값, ... where 조건...
 *     
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC02_4 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      Statement stmt = con.createStatement();){
      
      int count = stmt.executeUpdate(
          "update ex_contacts set"
          + " tel='222-2222', posi='과장'"
          + " where email='ahnjg@test.com'");
      
      System.out.printf("%d개 변경되었습니다.", count);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







/* 주제: 데이터 삭제하기 
 * => executeUpdate() 메서드를 이용하여 SQL문을 전달한다.
 *    리턴 값: 삭제된 레코드의 개수이다.
 * => SQL 문법
 *    delete from 테이블명 where 조건...
 *     
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC02_5 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      Statement stmt = con.createStatement();){
      
      int count = stmt.executeUpdate("delete from ex_contacts where email='ahnjg@test.com'");
      
      System.out.printf("%d개 삭제되었습니다.", count);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







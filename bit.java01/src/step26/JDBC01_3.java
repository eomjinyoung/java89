/* 주제: DBMS 에 연결하기 III 
 * => 예외 처리 추가
 *    
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_3 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
        "java89", "1111");
    
      System.out.println("연결 성공!");
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {con.close();} catch (Exception e) {}
    }
  }

}







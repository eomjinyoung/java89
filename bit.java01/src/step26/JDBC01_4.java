/* 주제: DBMS 에 연결하기 IV 
 * => 예외 처리 추가
 *    
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_4 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
            "java89", "1111");
        ){
    
      System.out.println("연결 성공!");
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







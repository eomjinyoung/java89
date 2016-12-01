/* 주제: Statement의 문제점 
 * => 값을 포함하는 SQL을 만들기 때문에 보안이 뚫릴 수 있다.
 *     
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC03_1 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      Statement stmt = con.createStatement();
      Scanner keyScan = new Scanner(System.in); ){
      
      System.out.print("변경할 연락처의 이메일?");
      String email = keyScan.nextLine();
      
      System.out.print("새 전화번호?");
      String tel = keyScan.nextLine();
      
      System.out.print("새 직위?");
      String position = keyScan.nextLine();
      
      int count = stmt.executeUpdate(
          "update ex_contacts set"
          + " tel='" + tel
          + "', posi='" + position
          + "' where email='" + email
          + "'");
      
      System.out.printf("%d개 변경되었습니다.", count);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







/* 주제: Statement의 문제점 
 * => SQL을 만들 때 문자열을 연결하는 방식으로 값을 포함시키기 때문에
 *    의도하지 않은 임의의 SQL이 추가될 수 있다.
 *    즉 보안이 뚫릴 수 있기 때문에 문자열을 연결하는 방식으로 SQL문을 만들지 말아야 한다.
 * => 아래의 예제를 다음과 같이 실행해보라!
변경할 연락처의 이메일?aaa@test.com' or '1'='1
새 전화번호?1212-1313
새 직위?대리', name='홍홍홍
 *
 *    모든 연락처의 전화번호아 직위 이름이 변경되었을 것이다.
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







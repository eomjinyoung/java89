/* 주제: 데이터 입력하기 
 * => executeUpdate() 메서드를 이용하여 SQL문을 전달한다.
 *    리턴 값: 입력된 레코드의 개수이다.
 * => SQL 문법
 *    insert into 테이블명 values(값, 값, 값, ...) 
 *      => 입력 컬럼을 지정하지 않으면 테이블을 생성할 때 선언한 순서대로 
 *         모든 컬럼의 값을 입력해야 한다.
 *    insert into 테이블명(컬럼명, 컬럼명, ...) values(값, 값, ...)
 *      => 입력 컬럼을 지정할 때 순서는 테이블을 생성할 때 선언한 순서와 달라도 된다. 
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC02_3 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      Statement stmt = con.createStatement();){
      
      int count = stmt.executeUpdate("insert into ex_contacts(email,name,tel,posi)"
          + " values('ahnjg@test.com','안중근', '111-1111', '대리')");
      
      System.out.printf("%d개 입력되었습니다.", count);
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
  }

}







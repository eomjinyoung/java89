/* 주제: 데이터 목록 가져오기 
 * => select 문 실행
 * => SQL 문법 
 * select 컬럼명, 컬럼명, 
 * from 테이블명
 * where 조건... 
 * => java.sql.Statement (인터페이스)
 *    - DBMS 서버에 SQL문을 전달하고 결과를 받는 일을 한다.
 *    - executeQuery() : select 문 전달
 *    - executeUpdate() : insert, update, delete 문 전달
 *    - execute() : 모든 sql 문 전달. select 문을 실행할 때 결과를 받기가 번거롭다.
 *                  그래서 가능한 executeQuery() 또는 executeUpdate()를 사용한다.
 *                  언제 사용하는가? 실행할 sql문이 select인지 아닌지 구분할 수 없을 때.
 * => java.sql.ResultSet (인터페이스)
 *    - select문의 실행 결과를 가져오는 객체
 *    - 한 번에 한 개의 레코드(record 또는 row)만 가져온다.
 *    - next(): 서버에서 한 레코드를 가져오는 기능을 한다.
 *    - getXxx(컬럼번호) 또는 getXxx(컬럼명) : 컬럼 값을 꺼낸다.
 *           이때 컬럼의 타입에 따라 호출하는 메서드를 달리한다.
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC02_1 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      // java.sql.Connection 구현체로부터 SQL을 서버에 전달할 객체를 얻는다.
      // => 리턴 값: java.sql.Statement 구현체
      Statement stmt = con.createStatement();
      // SQL을 서버에 전달한다.
      // => 리턴 값: java.sql.ResultSet 구현체
      // => 주의! 리턴하는 객체에 모든 결과를 들어 있는 것이 아니다.
      //          서버에 생성된 결과를 가져오는 역할을 한다.
      //          결과를 가져온 것이 아니다!!!
      ResultSet rs = stmt.executeQuery("select posi, name, tel, email from ex_contacts"); ){
      
      // 서버에서 레코드 한 개를 가져온다.
      // => 서버에서 가져온 데이터는 ResultSet 객체 안에 보관되어 있다.
      rs.next();
      
      // 가져온 레코드의 컬럼 값을 꺼낸다.
      System.out.println(rs.getString(1));
      System.out.println(rs.getString("posi")); // 가능한 컬럼명을 사용하라!
      System.out.println(rs.getString(2));
      System.out.println(rs.getString("name")); // 가능한 컬럼명을 사용하라!
      System.out.println(rs.getString(3));
      System.out.println(rs.getString("tel")); // 가능한 컬럼명을 사용하라!
      System.out.println(rs.getString(4));
      System.out.println(rs.getString("email")); // 가능한 컬럼명을 사용하라!

    } catch (Exception e) {
      e.printStackTrace();
      
    } /*finally {   // try-with-resource 문법을 사용하면 finally 블록에서 닫을 필요가 없다.
      // 자원을 닫을 때는 생성된 역순으로 닫는다.
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }*/
  }

}







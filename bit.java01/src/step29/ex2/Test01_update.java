/* 주제: Mybatis를 사용하여 update 실행
 */
package step29.ex2;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_update {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // DB에 입력할 데이터를 준비한다.
    HashMap data = new HashMap();
    data.put("name", "임꺽정2");
    data.put("position", "부장2");
    data.put("tel", "1212-55552");
    data.put("email", "lee2@test.com");
    
    int count = sqlSession.update("updateContacts", data);
    sqlSession.commit(); // 기본이 수동 커밋이다. 따라서 데이터베이스에 적용하라고 명령해야 한다.

    if (count == 1) {
      System.out.println("변경 성공!");
    } else {
      System.out.println("변경 실패!");
    }
    
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}








/* 주제: Mybatis로 한 개 데이터를 select 하기
 * 
 */
package step29;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectOne {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();

    Map record = sqlSession.selectOne("selectOneContacts", "aaa@test.com");
    
    if (record != null) {
      System.out.printf("%s, %s, %s, %s\n", 
          record.get("name"),
          record.get("posi"),
          record.get("tel"),
          record.get("email"));
    }
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}








/* 주제: 결과 타입으로 도메인 객체 사용
 * => 주의사항!
 *    컬럼 이름과 도메인 객체의 프로퍼티 이름이 다를 경우,
 *    컬럼의 별명으로 프로퍼티 이름을 부여하라! 
 */
package step29.ex2;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectList {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Contact> list = sqlSession.selectList("selectContacts");
    
    for (Contact contact : list) {
      System.out.printf("%s, %s, %s, %s\n", 
          contact.getName(),
          contact.getPosition(),
          contact.getTel(),
          contact.getEmail());
    }
    
    sqlSession.close();
  }

}








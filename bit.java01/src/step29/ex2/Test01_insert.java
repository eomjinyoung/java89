/* 주제: 도메인 객체를 사용하여 insert 실행
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

public class Test01_insert {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // DB에 입력할 데이터를 준비한다.
    Contact contact = new Contact();
    contact.setName("임꺽정");
    contact.setPosition("부장");
    contact.setTel("1212-5555");
    contact.setEmail("lee2@test.com");
    
    try {
      sqlSession.insert("insertContacts", contact);
      sqlSession.commit(); 
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      System.out.println("입력 실패!");
    }
        
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}








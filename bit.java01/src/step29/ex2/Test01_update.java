/* 주제: 도메인 객체를 사용하여 update 실행
 */
package step29.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_update {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // DB에 입력할 데이터를 준비한다.
    Contact contact = new Contact();
    contact.setName("임꺽정x");
    contact.setPosition("부장x");
    contact.setTel("1212-5555x");
    contact.setEmail("lee2@test.com");
    
    int count = sqlSession.update("updateContacts", contact);
    sqlSession.commit(); 

    if (count == 1) {
      System.out.println("변경 성공!");
    } else {
      System.out.println("변경 실패!");
    }
    
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}








/* 주제: 정렬 지정하기 
 */
package step29.ex3;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectListWithOrder {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("정렬?");
    String order = keyScan.nextLine();
    /* 정렬 예)
     * name_desc/name_asc, tel_desc/tel_asc, posi_desc/posi_asc, email_desc/email_asc
     * 
     */
    
    InputStream in = Resources.getResourceAsStream("step29/ex3/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    HashMap<String,Object> map = new HashMap<>();
    map.put("order", order);
    
    List<Contact> list = sqlSession.selectList("selectContacts", map);
    
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








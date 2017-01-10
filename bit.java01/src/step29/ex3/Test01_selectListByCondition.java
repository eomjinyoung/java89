/* 주제: 특정 컬럼이 값이 일치하는 것만 select 하기  
 */
package step29.ex3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectListByCondition {

  public static void main(String[] args) throws Exception {
    HashMap<String,Object> map = new HashMap<>();
    
    Scanner keyScan = new Scanner(System.in);
    System.out.print("이름?");
    String inputStr = keyScan.nextLine();
    if (inputStr.length() > 0) {
      map.put("name", inputStr);
    }
    
    System.out.print("전화?");
    inputStr = keyScan.nextLine();
    if (inputStr.length() > 0) {
      map.put("tel", inputStr);
    }
    
    System.out.print("직위?");
    inputStr = keyScan.nextLine();
    if (inputStr.length() > 0) {
      map.put("position", inputStr);
    }
    
    InputStream in = Resources.getResourceAsStream("step29/ex3/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Contact> list = sqlSession.selectList("selectContacts3", map);
    
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








/* 주제: 지정된 키워드와 일치하는 것만 select하기 
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

public class Test01_selectListByKeyword {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("이름?");
    String inputStr = keyScan.nextLine();
    /* 입력 예)
     * 이름?aaa,bbb,ccc
     * 
     */
    ArrayList<String> nameList = new ArrayList<>();
    String[] names = inputStr.split(",");
    for (String name : names) {
      nameList.add(name);
    }
    
    InputStream in = Resources.getResourceAsStream("step29/ex3/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Contact> list = sqlSession.selectList("selectContacts2", nameList);
    
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








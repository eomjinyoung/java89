/* 주제: 조인 결과 가져오기
 */
package step29.ex4;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectList {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex4/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Student> list = sqlSession.selectList("select");
    
    for (Student student : list) {
      System.out.printf("%s, %s, %s, %s, %b, %s, %s, %s\n", 
          student.getMemberNo(),
          student.getName(),
          student.getEmail(),
          student.getTel(),
          student.isWorking(),
          student.getGrade(),
          student.getSchoolName(),
          student.getPhotoPath());
    }
    
    sqlSession.close();
  }

}








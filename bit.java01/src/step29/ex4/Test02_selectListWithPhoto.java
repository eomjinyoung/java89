/* 주제: 사진 정보를 포함한 강사 데이터 조인 결과 가져오기
 */
package step29.ex4;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test02_selectListWithPhoto {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex4/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Teacher> list = sqlSession.selectList("teacher.selectWithPhoto");
    
    for (Teacher teacher : list) {
      System.out.printf("%s, %s, %s, %s, %s, %s, %s\n", 
          teacher.getMemberNo(),
          teacher.getName(),
          teacher.getEmail(),
          teacher.getTel(),
          teacher.getHomepage(),
          teacher.getFacebook(),
          teacher.getTwitter());
      List<Photo> photoList = teacher.getPhotoList();
      if (photoList != null) {
        for (Photo photo : photoList) {
          System.out.printf("--> %d, %s\n", photo.getNo(), photo.getFilePath());
        }
      }
      System.out.println("----------------------------------");
    }
    
    sqlSession.close();
  }

}








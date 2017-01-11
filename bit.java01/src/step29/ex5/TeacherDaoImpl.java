package step29.ex5;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherDao {
  @Autowired SqlSessionFactory sqlSessionFactory;
  
  @Override
  public List<Teacher> selectList() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    List<Teacher> list = sqlSession.selectList("teacher.select");
    sqlSession.close();
    return list;
  }

}

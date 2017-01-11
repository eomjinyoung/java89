/* 주제: Mybatis를 Spring 프레임워크와 연동하기
 * 1) SqlSessionFactory 객체를 만들어 줄 공장 객체를 스프링 설정 파일에 등록해야 한다.
 *    - 
 */
package step29.ex7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01_selectList {
  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step29/ex7/application-context.xml");
    
    TeacherDao teacherDao = iocContainer.getBean(TeacherDao.class);
    
    List<Teacher> teachers = teacherDao.selectList();
    
    for (Teacher teacher : teachers) {
      System.out.printf("%s, %s, %s, %s, %s, %s, %s\n", 
          teacher.getMemberNo(),
          teacher.getName(),
          teacher.getEmail(),
          teacher.getTel(),
          teacher.getHomepage(),
          teacher.getFacebook(),
          teacher.getTwitter());
    }
  }
}








/* 주제: 부모 테이블에 데이터를 입력한 후 그 PK를 가지고 자식 테이블에 데이터를 저장하기
 * => 부모 테이블에 데이터를 입려한 후 자동으로 생성된 PK 값을 가져와야 한다.
 *    어떻게? MembMapper.xml 파일을 참조하라! 
 */
package step29.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01_insert {

  public static void main(String[] args) throws Exception {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step29/ex7/application-context.xml");
    
    MemberDao memberDao = iocContainer.getBean(MemberDao.class);
    TeacherDao teacherDao = iocContainer.getBean(TeacherDao.class);
    
    // DB에 입력할 데이터를 준비한다.
    Teacher teacher = new Teacher();
    teacher.setName("설현2강사");
    teacher.setEmail("sulhyun2@test.com");
    teacher.setTel("1111-1255");
    teacher.setPassword("1111");
    teacher.setHomepage("ohora.test.com");
    teacher.setFacebook("facebook.com/ohora");
    teacher.setTwitter("twitter.com/ohora");
    
    memberDao.insert(teacher);
    /* Mybatis가 만들어준 DAO 구현체는
     * 메서드를 호출할 때 SqlSessionFactory로부터 SqlSession을 얻어서 SQL문을 실행한다.
     * 실행이 끝나면 자동으로 commit한다.
     * 따라서 아래에 있는 insert()호출이 실패하더라도 위에서 한 insert() 작업은 그대로 유지된다.  
     */
    System.out.println("memb 입력 성공!");
    
    teacher.setMemberNo(0);
    teacherDao.insert(teacher);
    System.out.println("tcher 입력 성공!");
    
  }

}








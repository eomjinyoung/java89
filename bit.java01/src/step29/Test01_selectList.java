/* 주제: Mybatis 설정과 실행
 * 1) Mybatis 라이브러리 및 JDBC 드라이버 추가
 *   - build.gradle 파일에 의존 라이브러리 정보 추가
 *   - "gradle eclipse" 명령 실행
 *   - 프로젝트 "refresh" 실행
 *   - 프로젝트에 라이브러리가 등록되었는지 확인 
 *   
 * 2) Mybatis 설정 파일 준비
 *   - mybatis-config.xml 파일 생성
 *   - 설정 정보 작성
 *   
 * 3) DBMS 연결 정보를 담은 프로퍼티 파일 준비
 *   - jdbc.properties 파일 생성
 *   
 * 4) SQL 맵퍼 파일 준비 
 *   - SQL을 저장한 파일
 *   - 보통 테이블 당 한 개의 맵퍼 파일 생성
 *   - ContactsMapper.xml
 *   
 * 5) SQL 세션 팩토리 객체 생성
 * 
 */
package step29;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectList {

  public static void main(String[] args) throws Exception {
    //1. SqlSessionFactory 객체 생성
    // => 클래스 경로에서 mybatis-config.xml을 찾으려면 Resource 객체의 도움을 받아야 한다.
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 

    //2. SQL을 실행할 SqlSession 객체를 생성한다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    //3. SELECT 문 실행
    // => selectList(SQL 맵퍼에 선언된 SQL문의 아이디)
    // => 리턴 값은 resultType 객체의 목록
    List<Map> list = sqlSession.selectList("selectContacts");
    
    for (Map record : list) {
      System.out.printf("%s, %s, %s, %s\n", 
          record.get("name"),
          record.get("posi"),
          record.get("tel"),
          record.get("email"));
    }
    
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}








/* 주제: 필터 만들기
 * => javax.servlet.Filter 규칙에 따라 클래스를 정의한다.
 * => init() : 필터 객체가 생성될 때 자동으로 호출된다.
 *    - 필터가 사용할 자원을 준비하는 코드를 이 메서드에 둔다.
 * => doFilter() : 요청이 들어올 때 마다 호출된다.
 *    - 필터가 수행하는 작업 코드를 이 메서드에 둔다.
 * => destroy(): 필터 객체가 소멸될 때 자동으로 호출된다.
 *    - init()에서 준비한 자원을 해제시키는 코드를 이 메서드에 둔다.
 * => 필터에 URL을 연결한다.
 *    - 지정된 URL로 요청이 들어 올 때 마다 필터가 호출된다.
 * => 필터 구동 절차
 *    요청 ---> 필터1 ---> 필터2 ---> 필터3 ---> ... ---> 서블릿 실행
 *    응답 <--- 리턴  <--- 리턴  <--- 리턴  <--- 리턴<--- 리턴
 * => 필터 생명 주기
 *    웹 애플리케이션을 시작시킬 때 톰캣 서버가 필터 객체를 생성한다.
 *    웹 애플리케이션을 종료시킬 때 톰캣 서버가 필터 객체를 소멸한다.
 *    단, web.xml에 등록(애노테이션 설정 포함)된 필터만 톰캣 서버가 관리한다.
 *    web.xml에 등록(애노테이션 설정 포함)되지 않은 필터는 자동 생성되지 않는다. 
 * => 필터 꼽기
 *    1) web.xml (Deployment Descriptor File)에 등록하기
<!-- 필터 클래스 등록 -->
  <filter>
    <filter-name>Filter1</filter-name>
    <filter-class>bitcamp.servlet7.Filter1</filter-class>
  </filter>

<!-- 필터를 적용할 URL 지정 -->
  <filter-mapping>
    <filter-name>Filter1</filter-name>
    <url-pattern>/servlet/servlet34</url-pattern>
  </filter-mapping>
  
      2) 애노테이션으로 등록하기
@WebFilter("/servlet/servlet34")
 */
package bitcamp.servlet7;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/servlet/*")
public class Filter2 implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("Filter2.init()");
  }
  
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    System.out.println("Filter2.doFilter() - before");
    chain.doFilter(request, response); // <--- 다음 필터 호출
    System.out.println("Filter2.doFilter() - after");
  }
  
  @Override
  public void destroy() {
    System.out.println("Filter2.destroy()");
  }
}

package bitcamp.servlet11;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // web.xml에 설정된 컨텍스트 파라미터 가져오기
    ServletContext context = sce.getServletContext();
    System.out.println("MyServletContextListener");
    System.out.printf("name=%s\n", context.getInitParameter("name"));
    System.out.printf("age=%s\n", context.getInitParameter("age"));
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    // TODO Auto-generated method stub
    
  }

}

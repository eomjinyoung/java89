package bitcamp.servlet11;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
  FilterConfig config;
  
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    this.config = filterConfig;
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    // web.xml에 설정된 초기화 파라미터 값을 꺼내기
    System.out.println("MyFilter");
    System.out.printf("name=%s\n", config.getInitParameter("name"));
    System.out.printf("age=%s\n", config.getInitParameter("age"));
    
    ServletContext context = request.getServletContext();
    System.out.printf("name=%s\n", context.getInitParameter("name"));
    System.out.printf("age=%s\n", context.getInitParameter("age"));
    
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    
  }
  
}

/* 역할: 서브 클래스를 위해 HTTP 프로토콜의 메서드를 미리 구분하는 메서드 제공.
 */
package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractHttpServlet extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) 
      throws ServletException, IOException {
    
    this.service((HttpServletRequest)req, (HttpServletResponse)resp);
    
  }
  
  // 서브 클래스를 위해 만든 메서드
  // 혹시 서브 클래스가 GET 또는 POST 등에 상관없이 요청을 처리하고 싶다면,
  // 이 메서드를 오버라이딩 하면 된다.
  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    if (request.getMethod().equals("GET")) {
      doGet(request, response);
    } else if (request.getMethod().equals("POST")) {
      doPost(request, response);
    }
  }

  private void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("이 서블릿은 GET 요청을 처리하지 않습니다.");
    
  }
  
  private void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("이 서블릿은 POST 요청을 처리하지 않습니다.");
  }
  
  
}



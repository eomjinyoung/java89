@javax.servlet.annotation.WebServlet("/hello")
public class HelloWeb extends javax.servlet.GenericServlet {
  public void service(javax.servlet.ServletRequest req,
      javax.servlet.ServletResponse resp)
      throws javax.servlet.ServletException, java.io.IOException {
    java.io.PrintWriter out = resp.getWriter();
    out.println("Hello, world!");
    out.println("Bernard Jinyoung Eom");

  }
}

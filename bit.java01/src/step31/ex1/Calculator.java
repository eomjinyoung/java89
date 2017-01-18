package step31.ex1;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
  static Logger logger = Logger.getLogger("myLog");
  
  public int plus(int a, int b) {
    logger.info("plus()"); // 로그 레벨을 info로 설정한다.
    logger.debug("a=" + a);// 로그 레벨을 debug로 설정한다.
    logger.debug("b=" + b);
    return a + b;
  }
  
  public int minus(int a, int b) {
    logger.info("minus()");
    logger.debug("a=" + a);
    logger.debug("b=" + b);
    return a - b;
  }
}







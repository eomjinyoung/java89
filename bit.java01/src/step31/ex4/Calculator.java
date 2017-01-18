package step31.ex4;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
  static Logger logger = Logger.getLogger("myLog");
  
  public int plus(int a, int b) {
    logger.fatal("fatal..."); 
    logger.error("error...");
    logger.warn("warn..."); 
    logger.info("info...");
    logger.debug("debug...");
    logger.trace("trace..."); 
    return a + b;
  }
  
  public int minus(int a, int b) {
    logger.fatal("fatal..."); 
    logger.error("error...");
    logger.warn("warn..."); 
    logger.info("info...");
    logger.debug("debug...");
    logger.trace("trace..."); 
    return a - b;
  }
}







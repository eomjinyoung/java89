package step31.ex7;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Calculator2 {
  static Logger logger = Logger.getLogger("myLog2");
  
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







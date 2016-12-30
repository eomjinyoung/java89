/* 주제: @Resource 를 사용하면 @Autowired와 @Qualifier를 대체할 수 있다.
 *       이 애노테이션은 자바에서 제공하는 애노테이션이다. 
 * 
 */
package step28.ex12;

import javax.annotation.Resource;

public class Car {
  String model; 
  String maker; 
  int cc;       
  
  //@Autowired 
  //@Qualifier("e2") 
  @Resource(name="e1")
  Engine engine;
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", cc=" + cc + ", engine=" + engine + "]";
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  
}

package step28.ex14;

import org.springframework.stereotype.Component;

@Component
public class Engine {
  int valve;
  int ventil;
  
  public Engine() {
    System.out.println("Engine()");
  }
  
  @Override
  public String toString() {
    return "Engine [valve=" + valve + ", ventil=" + ventil + "]";
  }
  
  public int getValve() {
    return valve;
  }
  public void setValve(int valve) {
    System.out.println("setValve()");
    this.valve = valve;
  }
  public int getVentil() {
    return ventil;
  }
  public void setVentil(int ventil) {
    System.out.println("setVentil()");
    this.ventil = ventil;
  }
  
  
}

package step28.ex5;

public class Engine {
  int valve;
  int ventil;
  
  @Override
  public String toString() {
    return "Engine [valve=" + valve + ", ventil=" + ventil + "]";
  }
  
  public int getValve() {
    return valve;
  }
  public void setValve(int valve) {
    this.valve = valve;
  }
  public int getVentil() {
    return ventil;
  }
  public void setVentil(int ventil) {
    this.ventil = ventil;
  }
  
  
}

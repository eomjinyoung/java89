package step25.ex2;

public class Engine {
  String model;
  int cc;
  boolean on;
  
  public Engine(String model, int cc) {
    this.model = model;
    this.cc = cc;
    this.on = false;
  }

  public void setOn(boolean state) {
    this.on = state;
  }
}

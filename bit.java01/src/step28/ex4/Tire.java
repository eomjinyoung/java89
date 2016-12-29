package step28.ex4;

public class Tire {
  String maker;
  int diameter;
  
  @Override
  public String toString() {
    return "Tire [maker=" + maker + ", diameter=" + diameter + "]";
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public int getDiameter() {
    return diameter;
  }
  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }
  
  
}

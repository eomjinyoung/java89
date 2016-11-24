package step22.ex5;

public class Tico extends Car {
  public void speedUp() {
    if (speed < 150)
      speed += 10;
  }

  public void speedDown() {
    if (speed > 10)
      speed -= 10;
  }
  
  public void run() {
    System.out.println("달린다");
    energy -= 5;
  }
  
  public void attack() {
    System.out.println("차체로 들이박는다");
  }
}

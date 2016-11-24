package step22.ex4;

public class TriBike {
  String modelName;
  int cc;
  String color;
  int energy = 100;
  int speed;
  int numOfBullet;
  
  public void speedUp() {
    if (speed < 200)
      speed += 20;
  }
  
  public void speedDown() {
    if (speed > 20)
      speed -= 20;
  }
  
  public void fillEnergy() {
    energy = 100;
  }
  
  public void run() {
    System.out.println("달린다");
    energy -= 8;
  }
  
  public void attack() {
    System.out.println("총 쏜다...");
    numOfBullet -= 5;
  }
  
  public void fillBullet() {
    numOfBullet = 500;
    System.out.println("총알을 다 채웠습니다.");
  }
  
  public void jump() {
    System.out.println("점프~~~~");
  }
}







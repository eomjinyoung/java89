package step16.ex2;

public class Calculator {
  // 외부에서 직접 접근하지 못하도록 막는다.
  private int result;

  // result 값을 꺼내주는 공개 메서드 
  public int getResult() {
    return result;
  }

  public void plus(int value) {
    result += value;
  }

  public void minus(int value) {
    result -= value;
  }
}
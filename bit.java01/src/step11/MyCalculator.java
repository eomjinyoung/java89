/* 다른 사람이 만든 클래스를 확장한다.*/
package step11;

public class MyCalculator extends ES_Calculator {
  // ES_Calculator 클래스에 다음의 기능을 덧붙이겠다.
  public void remainder(int value) {
    this.result %= value;
  }

  public void power(int value) {
    int temp = this.result;
    for (int i = 0; i < value-1; i++) {
      this.result *= temp;
    }
  }
}

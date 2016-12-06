package step27.client;

import step27.server.CalculatorStub;

public class TestClient {

  public static void main(String[] args) {
    // 클라이언트 쪽에서는 서버에 있는 Calculator 객체를 직접 호출하는 대신,
    // 그 객체의 대행자인 CalculatorStub을 마치 서버 객체를 호출하는 것처럼 사용한다.
    CalculatorStub calc = new CalculatorStub();
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));

  }

}

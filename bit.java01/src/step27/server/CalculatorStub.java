// 역할: 원격 객체의 메서드 호출을 요청하는 클라이언트
// => 일종의 서버에 존재하는 원객 객체의 대행자로서 역할을 수행한다.
// => 자신이 직접 일을 하는 것이 아니라, 서버에 일을 요청하고
//    서버가 보내준 결과를 리턴하는 중계자 역할을 한다.
package step27.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class CalculatorStub {
  public int plus(int a, int b) {
    return compute(a, b, "plus");
  }
  
  public int minus(int a, int b) {
    return compute(a, b, "minus");
  }
  
  private int compute(int a, int b, String op) {
    try {
      Socket s = new Socket("192.168.2.23", 8888);
      DataInputStream in = new DataInputStream(s.getInputStream());
      DataOutputStream out = new DataOutputStream(s.getOutputStream());
      
      out.writeInt(a);
      out.writeInt(b);
      out.writeUTF(op);
      int result = in.readInt();
      
      in.close();
      out.close();
      s.close();
      return result;
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -88888;
  }

}








// 역할: 클라이언트로부터 메서드 호출을 요청 받는 서버.
package step27.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorSkeleton {

  public static void main(String[] args) throws Exception {
    Calculator calc = new Calculator();
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행!");
    
    while(true) {
      Socket s = ss.accept();
      DataInputStream in = new DataInputStream(s.getInputStream());
      DataOutputStream out = new DataOutputStream(s.getOutputStream());
      
      int a = in.readInt();
      int b = in.readInt();
      String op = in.readUTF();
      int result = 0;
      
      switch(op) {
      case "plus": result = calc.plus(a, b); break;
      case "minus": result = calc.minus(a, b); break;
      default: result = -99999;
      }
      
      out.writeInt(result);
      
      in.close();
      out.close();
      s.close();
    }

  }

}








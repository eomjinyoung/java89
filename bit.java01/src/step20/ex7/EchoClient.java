/* 주제: 네트워킹 프로그래밍 - echo client 만들기(스레드 적용)
 * - 클라이언트는 스레드를 위해 따라 변경할 것이 없다.
 * - 서버에 스레드를 적용한다.  
 */
package step20.ex7;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("서버 주소? ");
    String serverAddr = keyScan.nextLine();
    
    Socket socket = new Socket(serverAddr, 8888); 
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String message = null;
    do {
      System.out.print("입력>");
      message = keyScan.nextLine();
      out.println(message); // 서버에 한 줄 메시지를 보냄.
      System.out.println(in.nextLine()); // 서버로부터 받은 한 줄 메시지를 읽음.
    } while (!message.toLowerCase().equals("quit"));
    
    out.close();
    in.close();
    socket.close();
    keyScan.close();
  }
}






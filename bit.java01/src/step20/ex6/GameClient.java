package step20.ex6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class GameClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("서버주소? ");
    String serverAddress = keyScan.nextLine();
    
    Socket socket = new Socket(serverAddress, 8888);
    Scanner socketIn = new Scanner(
                          new BufferedInputStream(
                              socket.getInputStream()));
    PrintStream socketOut = new PrintStream(
      new BufferedOutputStream(socket.getOutputStream()), /* OutputStream */ 
      true, /* autoflush */
      "UTF-8"); /* charset */
    
    // 이름 전송 및 환영인사 수신
    socketOut.println("엄진영");
    System.out.printf("%s\n", socketIn.nextLine());
    
    while (true) {
      System.out.printf("%s\n", socketIn.nextLine());
      if (socketIn.nextLine().equals("stop")) {
        break;
      }
      System.out.print("답변> ");
      String response = keyScan.nextLine();
      socketOut.println(response);
    }
    
    socketIn.close();
    socketOut.close();
    socket.close();
    keyScan.close();
  }

}

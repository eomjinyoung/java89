/* ver 5: 클라이언트가 보낸 파일을 읽어라!
 - 실행 결과
 * 전송받은 파일명: jls8.pdf
 * 전송받은 파일크기: 3,980,659
 * 파일을 모두 읽었습니다.
 */
package step20.ex3.v5;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    while (true) {
      Socket socket = serverSocket.accept();
      DataInputStream socketIn = new DataInputStream(socket.getInputStream());
      PrintStream socketOut = new PrintStream(socket.getOutputStream());
      
      String filename = socketIn.readUTF();
      long filesize = socketIn.readLong();
      
      System.out.printf("파일명: %s\n", filename);
      System.out.printf("파일 크기: %d\n", filesize);
      
      for (long i = 0; i < filesize; i++) {
        socketIn.read();
      }
      System.out.println("파일을 모두 읽었습니다");
      
      socketOut.println("OK");
      
      socketIn.close();
      socketOut.close();
      socket.close();
    }
  }
}

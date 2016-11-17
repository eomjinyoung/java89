/* ver 4: 클라이언트가 보낸 파일명과 파일 크기를 출력하라!
 - 실행 결과
 * 파일명: jls8.pdf
 * 파일크기: 3,980,659
 */
package step20.ex3.v4;

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
      
      System.out.printf("파일명: %s\n", socketIn.readUTF());
      System.out.printf("파일 크기: %d\n", socketIn.readLong());
      socketOut.println("OK");
      
      socketIn.close();
      socketOut.close();
      socket.close();
    
    }
  }
}

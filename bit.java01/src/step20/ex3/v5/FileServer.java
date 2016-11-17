/* ver 5: 클라이언트가 보낸 파일을 저장하라!
 - 실행 결과
 * 전송받은 파일명: jls8.pdf
 * 전송받은 파일크기: 3,980,659
 * 파일을 저장하였습니다. <= java01/upload 폴더에 저장한다.
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
      
      System.out.printf("파일명: %s\n", socketIn.readUTF());
      System.out.printf("파일 크기: %d\n", socketIn.readLong());
      socketOut.println("OK");
      
      socketIn.close();
      socketOut.close();
      socket.close();
    }
  }
}

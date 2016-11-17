/* ver 5: 서버에 파일 데이터를 전송하라!
 - 실행 결과
 * 파일? jls8.pdf (입력)
 * 전송할 파일명: jls8.pdf
 * 전송할 파일크기: 3,980,659
 * 파일을 전송하였습니다.
 */
package step20.ex3.v5;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("파일? ");
    String filename = keyScan.nextLine();
    
    File file = new File(filename);
    System.out.printf("전송할 파일명: %s\n", file.getName());
    System.out.printf("전송할 파일크기: %s\n", file.length());
    
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
    Socket socket = new Socket("localhost", 8888);
    Scanner socketIn = new Scanner(socket.getInputStream());
    DataOutputStream socketOut = new DataOutputStream(socket.getOutputStream());
    
    socketOut.writeUTF(file.getName());
    socketOut.writeLong(file.length());
    int b = 0;
    while ((b = in.read()) != -1) {
      socketOut.write(b);
    }
    System.out.println(socketIn.nextLine());
    
    System.out.println("파일을 전송하였습니다.");
    
    socketIn.close();
    socketOut.close();
    socket.close();
    in.close();
    keyScan.close();
  }
}








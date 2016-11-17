/* 주제: 네트워킹 프로그래밍 - 클라이언트 소켓 
 * => 서버와 연결할 때 사용하는 도구
 */
package step20;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_1 {
  public static void main(String[] args) throws Exception {
    try (
        //소켓 만들기
        //1) 서버와의 연결을 수행하는 객체 준비
        // new Socket(서버주소, 포트번호)
        // 서버주소: 도메인명, IP 주소. 로컬 도메인명 "localhost", 로컬 기본 IP "127.0.0.1"이다.
        Socket socket = new Socket("127.0.0.1", 8888); 
        
        //2) 데이터를 주고 받기 위한 입출력 스트림 객체 준비
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        //사용자로부터 입력 받기 위한 객체 준비
        Scanner keyScan = new Scanner(System.in);) {
      
      System.out.println("서버와 연결되었음");
      
      while (true) {
        //3) 서버로 보낼 데이터를 사용자로부터 입력 받는다.
        System.out.print("보낼 메시지? ");
        String message = keyScan.nextLine();
        
        //4) 서버에 데이터를 보낸다.
        out.println(message);
        if (message.toLowerCase().equals("quit")) {
          break;
        }
        
        //5) 서버가 보낸 데이터를 읽고 출력한다.
        String recvMsg = in.nextLine();
        System.out.println(recvMsg);
        if (recvMsg.toLowerCase().equals("quit")) {
          break;
        }
      }
     
    } catch (Exception e) {
      //e.printStackTrace();
    }
  }
}






/* 주제: 네트워킹 프로그래밍 - 서버 연결 타임아웃 지정하기 
 */
package step20;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_5 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("서버주소? ");
    String serverAddr = keyScan.nextLine();
    
    Socket socket = new Socket();
    System.out.println("소켓 생성");
    
    InetSocketAddress socketAddress = new InetSocketAddress(serverAddr, 8888);
    System.out.println("서버에 연결하는 중....");
    
    socket.connect(socketAddress, 30000);
    
    System.out.println("서버에 연결하였음!");
    
    // 실행 종료를 막기 위해 사용자 입력 받기
    keyScan.nextLine(); // 사용자가 한 줄 입력할 때까지 리턴하지 않는다. blocking
    keyScan.close();
    
    socket.close();
  }
}






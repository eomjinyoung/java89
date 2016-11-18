/* 주제: 네트워킹 프로그래밍 - 서버 대기열 테스트 
 * 서버에 최대 몇 개의 클라이언트가 연결될 수 있는지 알아본다.
 */
package step20;

import java.net.Socket;
import java.util.Scanner;

public class Exam105_3 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("서버주소? ");
    String serverAddr = keyScan.nextLine();
    
    Socket socket = new Socket(serverAddr, 8888); 
    System.out.println("서버와 연결되었음");
    
    // 실행 종료를 막기 위해 사용자 입력 받기
    keyScan.nextLine(); // 사용자가 한 줄 입력할 때까지 리턴하지 않는다. blocking
    keyScan.close();
    
    socket.close();
  }
}






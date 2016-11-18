/* 주제: 네트워킹 프로그래밍 - 대기열에 있는 클라이언트 연결을 순서대로 처리하기 
 * => 대기열에서 클라이언트 연결 꺼내기
 *    accept() 메서드 사용  
 * => 테스트는 Exam105_3.java를 사용한다.
 */
package step20;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_4 {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888, 1); 
    System.out.println("서버 실행중...");
    
    // 대기열에 있는 클라이언트 연결을 꺼내기 
    Scanner keyScan = new Scanner(System.in);
    while (true) {
      try {
        Socket socket = ss.accept();
        System.out.println("대기열에서 클라이언트 접속을 한 개 꺼낸다.");
        
        keyScan.nextLine(); // 사용자가 한 줄 입력할 때까지 리턴하지 않는다. blocking
        
        socket.close();
      } catch (Exception e) {}
    }
    //ss.close();
  }
}






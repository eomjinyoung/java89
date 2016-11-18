/* 주제: 네트워킹 프로그래밍 - 대기열 개수 설정하기 
 * => 대기열(backlog)
 *    - 서버에 연결할 수 있는 클라이언트의 최대 개수 
 */
package step20;

import java.net.ServerSocket;
import java.util.Scanner;

public class Exam105_2 {
  public static void main(String[] args) throws Exception {
    // new ServerSocket(포트번호, 대기열개수)
    ServerSocket ss = new ServerSocket(8888, 3); 
    System.out.println("서버 실행중...");
    
    // 서버 실행 종료를 막기 위해 사용자 입력 받기
    Scanner keyScan = new Scanner(System.in);
    keyScan.nextLine(); // 사용자가 한 줄 입력할 때까지 리턴하지 않는다. blocking
    keyScan.close();
    
    ss.close();
  }
}






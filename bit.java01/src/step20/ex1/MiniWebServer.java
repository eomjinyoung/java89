/* 주제: 네트워킹 프로그래밍 소개 - 미니 웹서버 만들기 
 */
package step20.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MiniWebServer {
  public static void main(String[] args) throws Exception {
    // 클라이언트 요청을 기다리는 랜카드 접속 객체 준비
    ServerSocket ss = new ServerSocket(8888); 
    System.out.println("자바89 미니 웹서버 시작!");
    
    while (true) {
      try {
        // 대기열에서 기다리고 있는 클라이언트들 중에서 한 개의 클라이언트 접속을 승인한다.
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다.-------------------");
        
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        Scanner in2 = new Scanner(in);
        PrintStream out2 = new PrintStream(out);

        // 1) 먼저 클라이언트가 보낸 메시지를 읽는다.
        String line = null;
        do {
          line = in2.nextLine();
          System.out.println(line);
        } while (line.length() != 0);
        
        // 2) 클라이언트에게 응답한다.
        // - HTTP 응답 규칙에 따라 클라이언트에게 데이터를 보낸다.
        // - HTTP 응답 규칙?
        // 프로토콜/버전 상태코드 간단한메시지 CRLF
        // 헤더명: 값 CRLF
        // ...
        // 빈 줄
        // 응답데이터 
        out2.println("HTTP/1.1 200 OK");
        out2.println("Server: Java89 Mini Web Server");
        out2.println("Content-Length: 23");
        out2.println("Context-Type: text/plain;charset=UTF-8");
        out2.println();
        out2.print("Hello, World!-엄진영");

        out2.close();
        in2.close();
        out.close();
        in.close();
        socket.close(); 
      } catch (Exception e) {
        // 예외 무시? 일단 네트워킹 프로그래밍 테스트
      } // try
    } // while
  } // main()
} // class






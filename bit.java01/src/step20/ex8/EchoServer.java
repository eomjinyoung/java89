/* 주제: 스레드 프로그래밍 - Runnable 적용  
 */
package step20.ex8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888); 
    System.out.println("에코 서버 시작!");
    
    while (true) {
      /*
      Socket socket = ss.accept();
      EchoWorker worker = new EchoWorker(socket);
      Thread thread = new Thread(worker);
      thread.start();
      */
      new Thread(new EchoWorker(ss.accept())).start();
    } // while
  } // main()
  
  static class EchoWorker implements Runnable {
    Socket socket;
    
    public EchoWorker(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      try (
        Scanner in = new Scanner(
          new BufferedInputStream(socket.getInputStream()));
        PrintStream out = new PrintStream(
          new BufferedOutputStream(socket.getOutputStream()), true, "UTF-8"); ) {
      
        String message = null;
        do {
          message = in.nextLine(); // 클라이언트가 보낸 메시지를 읽는다.
          out.println("엄진영: " + message); // 메시지를 클라이언트에게 그대로 돌려준다.
        } while (!message.toLowerCase().equals("quit"));
      } catch (Exception e) {}
      
      try {socket.close();} catch (Exception e) {}
      
    } // run()
  }
} // class






/* 주제: 네트워킹 프로그래밍 - 서버 소켓 
 * => 용어 정리
 * 서버:        클라이언트의 요청을 받아서 작업을 처리하고 응답하는 역할.
 * 클라이언트:  서버에 작업을 의뢰하는 역할.
 *              대부분 서버에 먼저 데이터를 보낸다.
 * 포트번호:    연결을 구분하기 위한 번호로서 서버, 클라이언트 모두 필요하다.
 *              서버는 스스로 포트 번호를 지정한다.
 *              클라이언트는 OS로부터 자동으로 배정 받는다.
 *              포트번호는 중복되어서는 안된다.
 * well-known port : 0 ~ 1023 까지의 포트번호를 말한다.
 *                   기존에 유명 서비스가 주로 사용하는 번호로 일반 프로그램에서 사용하지 말도록
 *                   권고하고 있다.
 *                   20 - FTP 데이터 전송 포트
 *                   21 - FTP 제어 포트 
 *                   22 - SSH(Secure Shell) 서버 = Secure 텔렛 버전
 *                   23 - 텔렛 서버
 *                   25 - SMTP 서버. 메일 발송 서버
 *                   53 - DNS 서버
 *                   80 - 웹 서버가 사용
 *                   109 - POP2 서버. 메일 받는 서버. 
 *                   110 - POP3 서버. 메일 받는 서버.
 *                   119 - 뉴스 서버
 *                   143 - IMAP4 서버. 메일 받는 서버.
 *                   443 - SSL 방식의 HTTP = HTTPS
 *                   8080 - 프록시 서버 
 *                   1521 - 오라클 DBMS 서버
 *                   3306 - MySQL DBMS 서버
 *                   
 *                   
 *                   
 * IP 주소:     각 컴퓨터에 부여된 인터넷 주소이다.
 *              IPv4에서는 0~255.0~255.0~255.0~255 이렇게 표시한다.
 *              4바이트 값을 이용하여 IP 주소를 표현한다.
 *              현재 IP 주소 고갈로 인해 IPv6로 전환하고 있다.
 * 도메인명:    IP 주소에 대해 별명을 부여한 것.
 *              IP 주소는 숫자로 이루어져서 기억하기가 쉽지 않다.
 *              기억을 쉽게 하도록 알파벳과 숫자로 이루어진 이름을 사용한다.
 *              "컴퓨터명.도메인명.그룹명" 형식으로 이름을 부여한다.
 *              예) www.naver.com
 *              www       - host name
 *              naver.com - domain name
 *              "컴퓨터명.파트명.도메인명.그룹명" 4개의 이름으로 구성할 수 있다.
 *              도메인의 그룹명은 두 개 이상의 이름으로 구성될 수 있다.
 *              예) .com, .co.kr, pe.kr, .org 등
 *              com - 회사
 *              org - 비영리 조직
 *              net - 커뮤니티
 *              co.kr - 한국 회사 일반 도메인
 *              go.kr - 한국 정부에서 관리하는 그룹. 일반인이 소속될 수 없다.
 *              주의!
 *              네트워크 통신할 때는 IP 주소를 알아야만 한다.
 *              도메인 이름은 IP 주소를 알아낼 때 key로 사용한다.
 *              "도메인이름(key)<--->IP주소(value)" 는 DNS 서버(네임서버)에 등록되어 있다.
 * DNS 서버:    도메인 이름에 대한 IP 주소를 관리하는 서버
 *              
 * 도메인 등록: 도메인을 관리하는 국제 공인 기관(ICANN)에서 위탁받아 운영하는 회사를 통해 등록할 수 있다.
 *              예) gabia.com, godday.com, whois.co.kr 등
 * 
 * DNS의 사용 예)
 * 1) 웹브라우저에 "www.daum.net"을 입력한다.
 * 2) 웹브라우저는 OS에 설정되어 있는 DNS 서버에 연결하여 해당 이름에 대한 IP 주소를 알아낸다.
 *    만약 DNS 서버에 연결되지 않는다면, 두 번째 DNS 서버에 연결한다.
 *    OS에 등록된 모든 DNS 서버와 연결되지 않는다면, IP 주소를 알 수 없기 때문에
 *    웹 서버에 연결할 수 없다.
 * 127.0.0.1:   모든 컴퓨터의 기본 로컬 IP이다.
 * localhost:   모든 컴퓨터의 기본으로 등록된 도메인 이름이다.   
 * => 클라이언트의 연결을 기다리는 역할을 수행 
 */
package step20;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_0 {
  public static void main(String[] args) throws Exception {
    //서버 만들기
    //1) 클라이언트와의 연결을 수행하는 객체 준비
    // new ServerSocket(포트번호)
    ServerSocket ss = new ServerSocket(8888); 
    System.out.println("서버 실행중...");
    
    try (
        //2) 대기열에서 기다리고 있는 클라이언트 중 한 개의 접속을 승인한다.
        Socket socket = ss.accept();
        
        //3) 데이터를 주고 받기 위한 입출력 스트림 객체 준비
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        //사용자로부터 입력 받기 위한 객체 준비
        Scanner keyScan = new Scanner(System.in);) {
      
      System.out.println("클라이언트와 연결되었음");
      
      //4) 클라이언트가 보낸 데이터를 읽는다.
      System.out.println(in.nextLine());
      
      //5) 클라이언트로 데이터를 보내기 전에 사용자의 입력을 기다린다.
      
      System.out.print("대답? ");
      String message = keyScan.nextLine();
      
      //6) 사용자가 입력한 메시지를 클라이언트로 보낸다.
      out.println(message);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    //7) 서버 소켓을 닫는다. => 더 이상 클라이언트와 연결할 수 없다.
    ss.close();
    
  }
}






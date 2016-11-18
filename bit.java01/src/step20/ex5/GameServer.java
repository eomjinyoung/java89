package step20.ex5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class GameServer {
  static String[] questions = {
      "정장보다는 캐주얼 차림을 좋아한다.,1,5",
      "학교나 직장에서 선배들에게 귀여움을 받는 편이다.,2,6",
      "자기자신이 정신적으로 약하다고 느낄 때가 많다.,3,7", 
      "서예나 바둑 등 차분한 것을 좋아하거나 배우고 있다.,4,8",
      "친구나 친지의 생일을 메모하고 있거나 기억하고 있는 편이다.,9,5",
      
      "경어 사용에는 자신이 있다.,10,6", 
      "결혼식은 될 수 있으면 화려하게 하고 싶다.,7,11",
      "친구에게 10만원 이상 돈을 빌려준 적이 있다.,12,8", 
      "운동하는 것을 싫어하고 심지어는 괴로워한다.,9,13", 
      "판매원/서비스업 등의 아르바이트를 해본 경험이 있다.,14,10", 
      
      "동호회/클럽 등의 활동을 좋아한다.,11,15", 
      "자기가 잘못을 하지 않았어도 분위기를 위하여 먼저 사과하는 적이 많다.,12,16", 
      "웃는 모습에 대하여 칭찬받은 적이 있다.,13,17",  
      "드라마/영화/만화 등에서 미스테리 장르를 즐긴다.,18,19", 
      "해외 어학연수를 생각해본 적이 있다.18,15", 
      
      "춤을 배운다면 어떤 춤을? 재즈댄스(y)/사교댄스(n),16,20",  
      "자기 방에 있을때 늘 TV나 MP3 등 뭔가를 틀어놓고 있다.,17,21", 
      "신문은 거의 읽지 않는다.,18,22", 
      "겨울 스포츠로 하고 싶은 것? 농구(y)/스키(n),19,23", 
      "자기와 같은 옷을 친구가 세일에서 샀다고 하면 다시는 그 옷을 입지 않는다.,24,20",
      
      "남의 말을 잘 들어주는 편이다.,25,21",
      "술자리에서 옆 사람의 잔이 비어있으면 곧바로 채워준다.,22,26",
      "죽이고 싶다고 생각할 정도로 미워하는 사람이 있다.,27,23",
      "모임에서 주로 리더가 되는 편이다.,28,24", 
      "외로움을 잘 타고 사람을 그리워하는 편이다.,29,30",
      
      "[결과]밝고 건강함이 당신의 매력!",  
      "[결과]순진함이 당신의 매력!",       
      "[결과]상냥함이 당신의 매력!",       
      "[결과]여성스러움이 당신의 매력!",   
      "[결과]신비스러움이 당신의 매력!",   
      "[결과]지적인 분위기가 당신의 매력!" 
  };
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행 중입니다.");
    
    Socket socket = ss.accept();
    Scanner socketIn = new Scanner(
      new BufferedInputStream(socket.getInputStream()));
    PrintStream socketOut = new PrintStream(
      new BufferedOutputStream(socket.getOutputStream()), /* OutputStream */ 
      true, /* autoflush */
      "UTF-8"); /* charset */
    
    // 클라이언트로부터 이름을 읽고 환영인사를 보낸다.
    String name = socketIn.nextLine();
    socketOut.println(name + "님 환영합니다. 즐겁게 게임하세요.");
    
    int questionIndex = 0;
    while (true) {
      String[] values = questions[questionIndex].split(",");
      socketOut.println(values[0]);
      if (questionIndex >= 25) {
        socketOut.println("stop");
        break;
      } else {
        socketOut.println("continue");
      }
      
      String response = socketIn.nextLine();
      if (response.toLowerCase().equals("y")) {
        questionIndex = Integer.parseInt(values[1]);
      } else {
        questionIndex = Integer.parseInt(values[2]);
      }
    }
    
    socketIn.close();
    socketOut.close();
    socket.close();
    ss.close();
  }

}

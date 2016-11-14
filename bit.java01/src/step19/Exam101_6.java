/* 주제: character stream 클래스 사용법 - PrintStream로 문자열 출력하기
=> 
*/
package step19;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class Exam101_6 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam101_6.data");
    PrintStream out2 = new PrintStream(out);
    
    out2.print("홍길동,");
    out2.print(20);
    out2.println();

    out2.print("임꺽정,");
    out2.println(30);

    out2.println("유관순,18");

    out2.printf("%s,%d\n", "안중근", 30);
    

    out2.close();
    out.close();
  }
}
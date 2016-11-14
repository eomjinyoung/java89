/* 주제: character stream 클래스 사용법 - FileWriter로 문자열 출력하기
*/
package step19;

import java.io.FileWriter;
import java.io.IOException;

public class Exam101_3 {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/Exam101_3.data");
    
    out.write("홍길동", 0, 3);
    out.write(",20\n", 0, 4);
    out.write("임꺽정", 0, 3);
    out.write(",30\n", 0, 4);
    out.write("유관순,18\n", 0, 7);
    out.write("안중근,30\n윤봉길,20\n", 0, 14);
    out.close();
  }
}
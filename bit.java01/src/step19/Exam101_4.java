/* 주제: character stream 클래스 사용법 - LineNumberReader 사용법
=> LineNumberReader = BufferedReader + 줄 번호 카운트 기능
*/
package step19;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.IOException;

public class Exam101_4 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/Exam101_3.data");
    LineNumberReader in2 = new LineNumberReader(in);

    String line;
    while ((line = in2.readLine()) != null) {
      String[] values = line.split(",");
      System.out.printf("%03d: %s(%d)\n", 
        in2.getLineNumber(), values[0], Integer.parseInt(values[1]));
    }

    in2.close();
    in.close();
  }
}
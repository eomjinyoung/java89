/* 주제: character stream 클래스 사용법 - LineNumberReader 사용법
=> LineNumberReader = BufferedReader + 줄 번호 카운트 기능
*/
package step19;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.IOException;

public class Exam101_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("src/Exam001.java");
    InputStreamReader adapter = new InputStreamReader(in, "UTF-8");
    LineNumberReader in2 = new LineNumberReader(adapter);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.printf("%03d: %s\n", in2.getLineNumber(), line);
    }

    in2.close();
    adapter.close();
    in.close();
  }
}
/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 바이트 배열로 데이터를 읽어오기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_4 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_4.data");

    //1) 읽어온 데이터를 저장할 배열을 준비
    byte[] buf = new byte[1024];

    //2) 배열로 바이트를 읽는다.
    int len = in.read(buf); // 리턴 값은 읽은 바이트 수

    //3) 읽은 바이트를 출력하기
    for (int i = 0; i < len; i++) {
      System.out.printf("%x,", buf[i]);
    }
    System.out.println();

    in.close();
  }
}
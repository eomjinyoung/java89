/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 바이트 배열로 데이터를 읽어와서 문자열을 만들기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_6 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_6.data");

    byte[] buf = new byte[1024];
    int len = in.read(buf);

    //바이트 배열을 String 인스턴스로 만들기 
    //=> buf 배열에 들어있는 데이터는 "UTF-8" 문자코드표에 따라 만들어 진 것이다.
    //   따라서 buf 배열에 들어있는 UTF-8 바이트를 자바의 UTF-16 문자로 변환하라!
    String str = new String(buf, 0, len, "UTF-8");

    System.out.println(str);

    in.close();
  }
}
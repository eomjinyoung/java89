/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 1바이트 읽기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_2.data");

    //read()의 리턴 타입은 int 이지만 무조건 1바이트 읽는다.
    int b = in.read(); 

    System.out.printf("%x\n", b);

    in.close();
  }
}
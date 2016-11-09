/* 주제: FileInputStream 클래스 사용법 - 읽기 객체 준비 II

*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_1 {
  public static void main(String[] args) throws Exception {
    //1) 지정된 파일로부터 읽을 객체를 준비한다.
    FileInputStream in = new FileInputStream("temp/Exam095_1.data");

    //2) 읽기
    int b = in.read(); // 1바이트 읽기
    int b2 = in.read(); // 1바이트 읽기
    int b3 = in.read(); // 1바이트 읽기

    System.out.printf("%x, %x, %x\n", b, b2, b3);

    //3) 읽기 객체를 사용한 후 읽기를 종료한다는 의미로 객체를 닫아야 한다.
    in.close();
  }
}
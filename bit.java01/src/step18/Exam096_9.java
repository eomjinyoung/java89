/* 주제: FileInputStream 클래스 사용법 - byte 값의 유효범위를 넘어가는 값 읽기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_9 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_9.data");

    //read()의 리턴 타입은 int 이지만 무조건 1바이트 읽는다.
    /*
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    */
    byte[] buf = new byte[5];
    in.read(buf);

    System.out.printf("%1$d(%1$x)\n", buf[0]);
    System.out.printf("%1$d(%1$x)\n", buf[1]);
    System.out.printf("%1$d(%1$x)\n", buf[2]);
    System.out.printf("%1$d(%1$x)\n", buf[3]);
    System.out.printf("%1$d(%1$x)\n", buf[4]);

    in.close();
  }
}
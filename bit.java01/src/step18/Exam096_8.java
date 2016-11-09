/* 주제: FileInputStream 클래스 사용법 - 다양한 타입의 데이터 읽기
=> FileInputStream을 기능 확장한다.
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_8 {
  public static void main(String[] args) throws Exception {
    DataInputStream in = new DataInputStream("temp/Exam095_8.data");

    String name = null;
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    boolean working = false;
    
    name = in.readUTF();
    kor = in.readInt();
    eng = in.readInt();
    math = in.readInt();
    sum = in.readInt();
    working = in.readBoolean();

    System.out.printf("%s,%d,%d,%d,%d,%b\n", 
      name, kor, eng, math, sum, working);

    in.close();
  }
}
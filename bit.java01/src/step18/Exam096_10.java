/* 주제: FileInputStream 클래스의 기능 확장
=> 상속이 아닌 방법으로 기능 확장하기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam096_10 {

  static class DataInputStream {
    FileInputStream in;

    public DataInputStream(FileInputStream in) {
      this.in = in;
    }

    public String readUTF() throws IOException {
      int leng = in.read() << 8;
      leng += in.read();
      byte[] buf = new byte[1024];
      in.read(buf, 0, leng);
      String value = new String(buf, 0, leng, "UTF-8");
      return value;
    }

    public int readInt() throws IOException {
      int value = in.read() << 24;
      value += in.read() << 16;
      value += in.read() << 8;
      value += in.read();
      return value;
    }

    public boolean readBoolean() throws IOException {
      return in.read() == 1 ? true : false;
    }

    public void close() throws IOException {
      in.close();
    }
  }

  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("temp/Exam095_10.data");
    DataInputStream in = new DataInputStream(in0);

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
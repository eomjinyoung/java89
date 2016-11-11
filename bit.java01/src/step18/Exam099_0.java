/* 주제: 데코레이터 패턴을 이용한 기능 확장 방법
=> Decorator 역할을 하는 클래스는 단독적으로 생성되어 사용될 수 없다.
   => 반드시 다른 객체에 의존하여 작업을 수행한다.
=> 즉, 기본 생성자가 없거나 private으로 접근을 제한한다.
   => 기본 생성자를 사용하여 인스턴스를 만들 수 없음을 의미한다. 
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exam099_0 {

  // 데코레이터 역할을 할 클래스
  static class BufferedInputStream extends InputStream {
    InputStream in;
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException {
      System.out.println("BufferedInputStream.read()....");
      if (cursor == length) { 
        length = in.read(buf);
        cursor = 0; 
        if (length == -1) 
          return -1;     
      }
      
      return buf[cursor++] & 0x000000FF; 
    }

    public void close() throws IOException {
      in.close();
    }
  }

  // 데코레이터 역할을 할 클래스
  static class DataInputStream extends InputStream {
    InputStream in;

    public DataInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException {
      return -1;
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
    BufferedInputStream in1 = new BufferedInputStream(in0);
    DataInputStream in = new DataInputStream(in1);

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
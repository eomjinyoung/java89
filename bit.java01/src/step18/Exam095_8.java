/* 주제: FileOutputStream 클래스 사용법 - 다양한 타입의 데이터 출력
=> FileOutputStream을 기능 확장한다.
*/
package step18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam095_8 {

  static class DataOutputStream extends FileOutputStream {

    public DataOutputStream(String path) throws FileNotFoundException {
      super(path);
    }

    public void writeUTF(String str) throws IOException {
      byte[] bytes = str.getBytes("UTF-8");
      this.write(bytes.length >> 8);
      this.write(bytes.length);
      this.write(bytes);
    }

    public void writeInt(int value) throws IOException {
      this.write(value >> 24);
      this.write(value >> 16);
      this.write(value >> 8);
      this.write(value);
    }

    public void writeBoolean(boolean value) throws IOException {
      this.write(value ? 1 : 0);
    }
  }

  public static void main(String[] args) throws Exception {
    DataOutputStream out = new DataOutputStream("temp/Exam095_8.data");

    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 100;
    int sum = kor + eng + math;
    boolean working = false;

    // 위의 데이터를 출력하라!
    out.writeUTF(name);
    out.writeInt(kor);
    out.writeInt(eng);
    out.writeInt(math);
    out.writeInt(sum);
    out.writeBoolean(working);
    
    out.close();
    
  }
}
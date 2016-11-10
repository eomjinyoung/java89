/* 주제: FileOutputStream 클래스를 상속이 아닌 방법으로 확장하기
*/
package step18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam095_10 {

  static class DataOutputStream {
    FileOutputStream out;

    public DataOutputStream(FileOutputStream out) {
      this.out = out;
    }

    public void writeUTF(String str) throws IOException {
      byte[] bytes = str.getBytes("UTF-8");
      out.write(bytes.length >> 8);
      out.write(bytes.length);
      out.write(bytes);
    }

    public void writeInt(int value) throws IOException {
      out.write(value >> 24);
      out.write(value >> 16);
      out.write(value >> 8);
      out.write(value);
    }

    public void writeBoolean(boolean value) throws IOException {
      out.write(value ? 1 : 0);
    }

    public void close() throws IOException {
      out.close();
    }
  }

  public static void main(String[] args) throws Exception {
    FileOutputStream out0 = new FileOutputStream("temp/Exam095_10.data");
    DataOutputStream out = new DataOutputStream(out0);

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
/* 주제: 추상클래스
=> 서브 클래스에게 공통 변수나 공통 메서드를 상속해주는 용도로 사용하는 클래스.
=> 그 자신은 인스턴스로 직접 사용할 수 없다. 

=> Generalization(일반화)
   - 서브 클래스의 공통 분모를 뽑아서 수퍼 클래스로 정의하는 것
   - 예) BufferedInputStream과 DataInputStream의 공통 분모인
         in 이라는 변수와 read() 메서드를 뽑아서
         FilterInputStream 클래스를 정의하였다.
   - 일반화 기법은 상속의 기법 중의 하나다.
     서브 클래스의 공통 점을 뽑아서 수퍼 클래스로 만든 다음 상속 관계를 맺는 것.
   - 보통 일반화를 통해서 만든 수퍼 클래스는 단지 서브 클래스에게
     공통 변수나 메서드를 물려주는 용도로 사용한다.
     그러다 보니, 일반화를 통해 만든 수퍼 클래스는 abstract로 선언하는 경우가 많다.

=> Specialization(특수화)
   - 수퍼 클래스의 일반 기능을 상속 받고 여기에 특별한 기능을 추가하는 것.
   - 예) InputStream 클래스를 상속받아서 FileInputStream을 만드는 것!
   - 보통 개발자들은 상속에 대해 얘기할 때 특수화만 고려하는 경우가 있다.
     위의 일반화도 있다는 것을 잊지 말자!
   - 즉 상속 받기 위해 수퍼 클래스를 잘 만들어야 한다는 강박에서 벗어나라!
     우리에게는 '일반화'도 있다. 그냥 클래스 막 만들어 놓고 
     공통점이 보이면 그 때 가서 수퍼 클래스를 정의해도 늦지 않다.            
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exam099_1 {

  // BufferedInputStream과 DataInputStream의 공통 분모를 
  // 별도의 클래스로 분리하여 선언하고, 부모-자식 관계를 맺는다.
  // 이 클래스의 인스턴스를 만들지 못하도록 abstract를 붙인다.
  static abstract class FilterInputStream extends InputStream {
    protected InputStream in;

    // 다음과 같이 기본 생성자를 수퍼 클래스에서 없애버리면,
    // 서브 클래스는 반드시 InputStream을 받는 생성자를 만들 수 밖에 없다.
    // 즉 서브 클래스를 만드는 개발자에게 InputStream을 받는
    // 생성자를 만들도록 강제하는 효과가 있다.
    //public FilterInputStream() {}

    public FilterInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException {
      return -1;
    }
  }

  // 데코레이터 역할을 할 클래스
  static class BufferedInputStream extends FilterInputStream {
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(InputStream in) {
      super(in);
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
  static class DataInputStream extends FilterInputStream {
    public DataInputStream(InputStream in) {
      super(in);
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

    // FilterInputStream은 추상 클래스이기 때문에 인스턴스를 만들 수 없다.
    // 즉 직접 사용하지 못한다.
    // FilterInputStream inx = new FilterInputStream(in0);
    // System.out.println(inx.read());

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
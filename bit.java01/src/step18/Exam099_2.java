/* 주제: 자바의 I/O 클래스 사용
1) Data Sink Stream 클래스
   - 직접 데이터를 읽고 쓰는 클래스
   - 예) 
     파일     => FileInputStream/FileOutputStream
              => FileReader/FileWriter
     메모리   => ByteArrayInputStream/ByteArrayOutputStream
                 CharArrayReader/CharArrayWriter
                 StringReader/StringWriter
     다른 프로그램 => PipedInputStream/PipedOutputStream
                      PipedReader/PipedWriter

2) Data Processing Stream 클래스 = 데코레이터(Decorator)
   - 다른 스트림 객체를 이용하여 중간에서 데이터를 처리하는 작업을 수행.
   - 예) 
     DataInputStream/DataOutputStream
     BufferedInputStream/BufferedOutputStream
     ObjectInputStream/ObjectOutputStream
     등 
   - java.io 패키지에서 이런 종류의 클래스를 어떻게 구분하나요?
     클래스 생성자에 다른 스트림을 파라미터 값으로 받는 생성자가 있다면,
     거의 이런 종류의 클래스라 볼 수 있다.
     즉 다른 스트림 없이 단독적으로 생성할 수 없는 클래스인 경우.
     만약 기본 생성자도 있고, 다른 스트림을 파라미터로 받는 생성자도 있다면,
     그런 경우는 어떻게 되나요? 그런 클래스는 두 가지 역할을 다 할 수 있다는 의미.

*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Exam099_2 {
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
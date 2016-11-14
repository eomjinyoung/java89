/* 주제: 형식이 있는 데이터 입출력 - DataOutputStream 사용하기
=> 다양한 타입의 데이터를 형식에 맞추어 출력할 수 있다.
*/
package step19;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Exam102_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam102_0.data");
    DataOutputStream out2 = new DataOutputStream(out);
    
    // 바이트 배열로 변환하여 출력하기 때문에,
    // 이런 형식의 파일을 바이너리 파일이라 부른다.
    // 바이너리 형식의 파일은 각 데이터를 구분할 때 
    // 콤마(,)와 같은 특정 코드로 구분하지 않는다.
    // 각 데이터의 크기로 구분한다.
    // 따라서 데이터를 읽을 때 각 데이터의 크기 만큼 정확하게 읽어야 한다. 
    out2.writeUTF("홍길동");
    out2.writeInt(20);
    out2.writeBoolean(true);

    out2.writeUTF("임꺽정");
    out2.writeInt(30);
    out2.writeBoolean(false);

    out2.writeUTF("을지문덕");
    out2.writeInt(50);
    out2.writeBoolean(false);

    out2.close();
    out.close();
  }
}
/* 주제: 객체 입출력 - ObjectOutputStream을 사용하여 인스턴스의 값을 출력하기 II
*/
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Exam103_1 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_1.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
    
    Student2 s1 = new Student2("홍길동", 20, true); // 알바
    Student2 s2 = new Student2("임꺽정", 30, false); // 취준생
    Student2 s3 = new Student2("유관순", 40, true); // 비정규직
    Student2 s4 = new Student2("안중근", 50, true); // 성과급제

    // Student2 클래스는 java.io.Serializable 규약을 준수한다고 했기 때문에
    // JVM은 이 인스턴스의 값을 바이트 배열로 자동으로 바꾼 다음 출력한다.
    // 이때 출력 내용에는 클래스의 정보(클래스명 등 그 클래스에 대한 간단한 정보들)를 포함한다.
    // 클래스 코드 자체가 출력되는 것은 아니다!
    out2.writeObject(s1);
    out2.writeObject(s2);
    out2.writeObject(s3);
    out2.writeObject(s4);

    out2.close();
    out.close();
  }
}
/* 주제: 객체 입출력 - ObjectOutputStream을 사용하여 인스턴스의 값을 출력하기 
- 어떻게?
  인스턴스의 값을 바이트 배열로 만들어 출력한다. 
  "직렬화(Serialization)"라 부른다.
- 주의!
  직렬화를 허락하지 않는 클래스에 대해서는 자동으로 직렬화를 수행할 수 없다.
  강제로 직렬화시켜 출력하려 할 때는 예외가 발생한다.
- 직렬화를 허용하는 방법?
  클래스 선언부에 java.io.Serializable 규약을 따른다고 명시하라!
  즉 직렬화를 허락한다는 의미다.
- 왜 기본적으로 허락하지 않는가?
  인스턴스의 값이 외부로 무조건 방출되는 것을 방지하기 위해 => 보안 때문이다.

용어 정리
- 직렬화(Serialization = marshaling)
  인스턴스의 값을 바이트 배열로 만들어 출력하는 것.
- 역직렬화(Deserialization = unmarshaling)
  바이트 배열을 인스턴스로 복원하는 것.
*/
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Exam103_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_0.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
    
    Student s1 = new Student("홍길동", 20, true); // 알바
    Student s2 = new Student("임꺽정", 30, false); // 취준생
    Student s3 = new Student("유관순", 40, true); // 비정규직
    Student s4 = new Student("안중근", 50, true); // 성과급제

    // Student 클래스는 직렬화를 허락하지 않는다.
    // 따라서 다음 문장은 실행 시에 오류가 발생한다.
    out2.writeObject(s1);
    out2.writeObject(s2);
    out2.writeObject(s3);
    out2.writeObject(s4);

    out2.close();
    out.close();
  }
}
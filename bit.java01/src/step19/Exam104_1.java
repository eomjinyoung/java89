/* 주제: 입출력과 예외 처리 II - "try-with-resource" 문장 
- 자원을 사용한 후 매번 자원을 해제시키는 close()를 호출하는 것이 번거로웠다.
  이런 번거로움을 해결하기 위해 등장한 문법이다.
- try 블록을 벗어날 때 자동으로 close()를 호출한다.
- 단 그 자원은 java.lang.AutoCloseable 인터페이스 구현체(인터페이스 규칙에 따라 만든 클래스)여야 한다.
- 문법
  try (java.lang.AutoCloseable 구현체) { ... } catch (Exception e) {...}
 */
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam104_1 {
  public static void main(String[] args) {
    try (
      // 여기에는 java.lang.AutoCloseable 인터페이스를 구현한 객체만이 올 수 있다.
      //String str = "okok"; // 컴파일 오류! String은 java.lang.AutoCloseable의 구현체가 아니다.
      FileOutputStream out = new FileOutputStream("temp/Exam104_0.data");
      ObjectOutputStream out2 = new ObjectOutputStream(out);) {
      
      out2.writeObject(new Score2("홍길동", 100, 100, 100));
      out2.writeObject(new Score2("임꺽정", 90, 90, 90));
      out2.writeObject(new Score2("유관순", 80, 80, 97));
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } /*finally { // try 블록을 벗어날 때 자동으로 close()를 호출한다. 따라서 finally 블록이 필요 없다.
      try {out2.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }*/
    
    System.out.println("출력 완료!");
  }
}






/* 주제: character stream 클래스 사용법 - 문자 인코딩 지정하기 
=> InputStreamReader
   - 바이너리 스트림을 캐릭터 스트림으로 변환시키는 역할을 한다.
   - 바이너리 스트림 객체와 캐릭터 스트림 객체를 연결할 때
     이 객체를 중간에 끼워서 연결할 수 있다.
   - 바이너리 스트림의 데이터를 캐릭터 스트림으로 바꿀 때
     데이터의 문자 코드를 지정할 수 있다.
     만약 지정하지 않는다면, InputStreamReader로 들어오는 데이터가
     플랫폼의 기본 문자 코드라고 간주하고 UTF-16으로 바꿀 것이다.
*/
package step19;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exam101_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("src/Exam001.java");
    //binary stream을 character stream으로 변경해주는 객체 준비
    InputStreamReader adapter = new InputStreamReader(in, "UTF-8");
    BufferedReader in2 = new BufferedReader(adapter);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.println(line);
    }

    in2.close();
    adapter.close();
    in.close();
  }
}
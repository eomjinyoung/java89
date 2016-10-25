/* 주제: 자바 기본 도구 사용법 - 입력 도구 Scanner
=> 입력 받은 데이터를 특정 타입의 데이터로 잘라주는 도구
*/

package step09;

import java.util.Scanner;

public class Exam062_0 {
  public static void main(String[] args) {
    //1) 키보드로부터 입력된 데이터를 우리가 원하는 형식으로 잘라주는 도구 준비
    Scanner keyScan = new Scanner(System.in);

    //2) 사용자가 입력한 값을 줄 단위로 자른다.
    String str = keyScan.nextLine(); // 리턴 값은 한 줄 문자열(이 저장된 인스턴스의 주소)이다.

    //3) 사용자가 입력한 값을 출력한다.
    System.out.printf("=>%s\n", str);
  }


}

/*
# System.in
- 시스템 기본 입력 장치(키보드)의 정보를 갖고 있는 변수

# System.out
- 시스템의 기본 출력 장치(모니터)의 정보를 갖고 있는 변수




*/

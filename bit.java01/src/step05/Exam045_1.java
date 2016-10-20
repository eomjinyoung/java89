// 주제: 명령어 흐름 제어 - 블록과 변수 선언

package step05;

public class Exam045_1 {
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
      {
        int c = 30;
        System.out.printf("{{%d,%d,%d}}\n", a, b, c);
      }
      //System.out.printf("{{%d,%d,%d}}\n", a, b, c); // 컴파일 오류!
    }
    //System.out.printf("{{%d,%d,%d}}\n", a, b, c); // 컴파일 오류!
  }
}

/*
# 블록 안에 선언된 변수
=> 블록 실행을 마치고 나가면 제거된다.
=> 바깥 블록에서 안쪽 블록의 변수를 사용할 수 없다.
=> 바깥에 선언된 변수는 안쪽 블록에서 사용할 수 있다.








*/

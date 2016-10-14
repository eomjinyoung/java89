// 주제: method(=function) 문법을 사용하여 명령어 묶기
public class Exam006 {
  public static void main(String[] args) {
    System.out.print("main\n");
  }

  static void m1() {
    System.out.print("m1\n");
    System.out.print("안녕하세요.\n");
  }
}

/*
=> 메서드 만드는 최소 형식
  static [return_type] method_name(parameter, ...) {
    명령어들....
  }
1) return_type
  - 명령어를 모두 수행한 후, 되돌려 줄 결과 값이 있다면, 그 결과 값의 데이터 유형
  - 되돌려 줄 결과 값이 없다면, void 로 선언하라!
2) method_name
  - 명령어를 묶은 블록의 이름
  - 나중에 이 이름으로 명령어를 찾아 실행할 수 있다.
3) parameter
  - 명령어를 실행할 때 넘겨주는 값을 담을 변수.





*/

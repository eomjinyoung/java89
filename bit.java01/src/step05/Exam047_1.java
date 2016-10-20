// 주제: 명령어 흐름 제어 - switch 문과 case

package step05;

public class Exam047_1 {
  public static void main(String[] args) {
    switch (args[0]) {
    case "손님":
      System.out.println("조회만 가능합니다.");
    case "회원":
      System.out.println("조회,변경,삭제 가능합니다.");
    case "관리자":
      System.out.println("회원 등록 가능합니다.");
    default:
      System.out.println("유효하지 않은 권한입니다.");
    }
  }
}

/*
# case
- switch()에 주어진 값과 일치하는 경우 해당 case의 명령을 실행한다.
- break 명령을 만날 때까지 실행한다.
- break 명령을 내리지 않으면 switch 블록 끝까지 간다.






*/

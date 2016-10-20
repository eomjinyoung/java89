// 주제: 명령어 흐름 제어 - case와 break

package step05;

public class Exam047_2 {
  public static void main(String[] args) {
    switch (args[0]) {
    case "손님":
      System.out.println("조회만 가능합니다.");
      break;
    case "회원":
      System.out.println("조회,변경,삭제 가능합니다.");
      break;
    case "관리자":
      System.out.println("회원 등록 가능합니다.");
      break;
    default:
      System.out.println("유효하지 않은 권한입니다.");
    }
  }
}

/*
# switch 블록 안에서 break 사용
- 즉시 switch 블록을 나간다.






*/

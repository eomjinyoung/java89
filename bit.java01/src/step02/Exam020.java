// 주제: Literal - 문자열과 이스케이프 문자(Escape Character)
package step02;

public class Exam020 {
  public static void main(String[] args) {
    System.out.println("문자열");
    // 문자열 속에 넣을 수 있는 특별한 명령어들
    System.out.println("\uAC00나다");
    System.out.println("Hello, \nworld!");
    System.out.println("Hello, \tworld!");
    System.out.println("Hello, \bworld!");
    System.out.println("나는 \"홍길동\"입니다.");
    System.out.println("나는 \'홍길동\'입니다.");
    System.out.println("나는 '홍길동'입니다."); // 큰 따옴표 안에서는 작은 따옴표를 그냥 써도 된다.
    System.out.println("c:\\server\\apache...\\bin");
  }
}

/*
=> 이스케이프 문자 : 문자열 속에 넣을 수 있는 특수 명령어
(역슬래시)u[16진수유니코드값] : \uAC00, \uac00
\n : 줄 바꿈.(new line)
\t : 탭 삽입. 즉 자바에서 정한 공백을 삽입.(tab)
\b : 커서를 뒤로 이동.(backspace)
\" : 큰 따옴표(")를 그냥 일반 문자로 취급하라고 명령.
\' : 작은 따옴표(')를 그냥 일반 문자로 취급하라고 명령.
\\ : 역슬래쉬(\)를 그냥 일반 문자로 취급하라는 명령.



*/

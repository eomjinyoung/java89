// 주제: 변수 선언 - 프로그램 아규먼트 받기
package step03;

public class Exam033_4 {
  public static void main(String[] args) {
    System.out.println(args.length);
    for (String value : args) {
      System.out.print(value + ",");
    }
    System.out.println();
  }
}

/*
# main() 메서드에 선언된 String 배열의 용도
=> 자바 프로그램을 실행할 때 넘겨준 값을 받는 배열이다.
예)
> java -cp bin Exam033_4 aaa bbb cccc 1234

=> 자바 클래스 이름 뒤에 작업한 값을 공백을 기준으로 잘라서 배열에 남아 준다.
args[0] = "aaa"
args[1] = "bbb"
args[2] = "cccc"
args[3] = "1234"

=> 이렇게 main() 메서드의 파라미터 변수로 넘어오는 값을
   "프로그램 아규먼트" 라 부른다.
=> 참고!
   java 명령 다음에 오는 -cp bin 과 같은 것을
   "JVM 아규먼트"라 부른다.





*/

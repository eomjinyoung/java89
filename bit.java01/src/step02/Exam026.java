// 주제: Literal - 정수가 메모리에 저장되는 방법과 음수의 표현
package step02;

public class Exam026 {
  public static void main(String[] args) {
    System.out.println(-2147483648);
    System.out.println(2147483647);
    //System.out.println(2147483648); // 4바이트 크기를 벗어 났기 때문에 컴파일 오류!
    System.out.println(2147483648L);
  }
}

/*
=> 4바이트 정수 값의 범위
-21_4748_3648 ~ +21_4748_3647

=> 8바이트 정수 값의 범위
-900경 ~ +900경




*/

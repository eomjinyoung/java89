// 주제: Literal - 부동 소수점 값과 메모리 크기
package step02;

public class Exam027 {
  public static void main(String[] args) {
    System.out.println(3.14);  // 8바이트 크기의 메모리에 값 저장
    System.out.println(3.14F); // 4바이트 크기의 메모리에 값 저장
    System.out.println(3.14f); // 4바이트 크기의 메모리에 값 저장 (이 표기법을 많이 사용)
  }
}

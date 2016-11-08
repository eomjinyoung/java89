/* 주제: 재귀 호출 사용 전*/
package step18.ex4;

public class Test1 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("숫자를 프로그램 아규먼트로 붙이세요.");
      return;
    }
    
    try {
      int num = Integer.parseInt(args[0]);
      int sum = 0;
      for (int i = 1; i <= num; i++) {
        sum += i;
      }
      System.out.println(sum);
    } catch (Exception e) {
      System.out.println("프로그램 아규먼트는 숫자여야 합니다.");
    }
  }
}
/* 주제: 재귀 호출 사용 후*/
package step18.ex4;

public class Test2 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("숫자를 프로그램 아규먼트로 붙이세요.");
      return;
    }
    
    try {
      int num = Integer.parseInt(args[0]);
      int result = sum(num);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("프로그램 아규먼트는 숫자여야 합니다.");
    }
  }

  static int sum(int n) {
    System.out.println(n);
    if (n == 1) 
      return 1;
    return n + sum(n - 1);
  }
}
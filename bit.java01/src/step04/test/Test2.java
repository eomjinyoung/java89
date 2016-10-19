/* Quiz
프로그램 아규먼트로 두 개의 수를 입력 받아 둘 중에 더 큰 수를 출력하시오.
=> 조건 연산자를 활용하라.
*/
package step04.test;

public class Test2 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int result = (a > b) ? a : b; // OK!
    System.out.println(result);
  }
}

/*











*/

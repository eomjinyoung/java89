/* Quiz
프로그램 아규먼트로 나이를 입력 받아 성년, 미성년 여부를 출력하시오!
=> 조건 연산자를 사용하여 구현하라.
*/
package step04.test;

public class Test1 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    String result = (age < 19) ? "미성년" : "성년"; // OK!
    System.out.println(result);
  }
}

/*











*/

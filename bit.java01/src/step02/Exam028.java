// 주제: Literal - 부동 소수점 다양한 표기법
package step02;

public class Exam028 {
  public static void main(String[] args) {
    System.out.println(3.14);
    System.out.println(31.4E-1);  // = 31.4 * 10**-1
    System.out.println(31.4e-1);  // = 31.4 * 10**-1
    System.out.println(0.0314E2); // = 0.0314 * 10**2
    System.out.println(0.0314E2); // = 314 * 10**-2
  }
}

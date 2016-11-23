/* 연산을 수행하는 클래스는 Operator 규칙에 따라 만들어야 한다.
 * 그래야 Test2 클래스에서 사용할 수 있다.
 */
package patterns.command.v2;

public class MinusOp implements Operator {
  public int execute(int a, int b) {
    return a - b;
  }
}

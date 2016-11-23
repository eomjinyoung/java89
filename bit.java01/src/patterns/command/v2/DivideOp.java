package patterns.command.v2;

public class DivideOp implements Operator {

  @Override
  public int execute(int a, int b) {
    return a / b;
  }
}

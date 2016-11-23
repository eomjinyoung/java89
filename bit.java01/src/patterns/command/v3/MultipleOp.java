package patterns.command.v3;

public class MultipleOp implements Operator {
  public int execute(int a, int b) {
    return a * b;
  }
}

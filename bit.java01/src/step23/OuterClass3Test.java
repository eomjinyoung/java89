package step23;

public class OuterClass3Test {

  public static void main(String[] args) {
    int a = 2;
    
    if (a == OuterClass3.level.MEMBER) {
      System.out.println("회원입니다.");
    }

  }

}

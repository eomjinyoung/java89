package step24.ex1;

public class RegEx {

  public static void main(String[] args) {
    String str = "Aa";
    if (str.matches("(?i)AA"))
      System.out.println("있다");

  }

}

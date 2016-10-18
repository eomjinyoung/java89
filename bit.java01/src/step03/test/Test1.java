/* Quiz
자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라!
*/
package step03.test;

public class Test1 {
  public static void main(String[] args) {
    String title = "자바프로그래밍";
    String publisher = "비트출판사";
    int pageSize = 783;
    String language = "korean";
    String isbn = "11-123-11";
    String[] authors = {"홍길동", "임꺽정"};
    float width = 7.4f;
    float height = 9.1f;
    float thick = 1.6f;
    double price = 83.33;
    boolean dvd = false;

    System.out.println(title);
    System.out.println(publisher);
    System.out.println(pageSize);
    System.out.println(language);
    System.out.println(isbn);
    for (String name : authors) {
      System.out.print(name + ",");
    }
    System.out.println();
    System.out.println(width);
    System.out.println(height);
    System.out.println(thick);
    System.out.println(price);
    System.out.println(dvd);

  }
}

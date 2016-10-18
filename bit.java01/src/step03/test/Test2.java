/* Quiz
클래스 문법을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라!
*/
package step03.test;

public class Test2 {
  //1) 새 데이터 타입을 정의한다.
  static class Book {
    String title;
    String publisher;
    int pageSize;
    String language;
    String isbn;
    String[] authors;
    float width;
    float height;
    float thick;
    double price;
    boolean dvd;
  }

  public static void main(String[] args) {
    //2) Book 데이터 타입에 따라 메모리(인스턴스)를 준비한다.
    Book book = new Book();

    //3) 준비한 메모리(인스턴스) 안에 있는 변수에 값 저장
    book.title = "자바프로그래밍";
    book.publisher = "비트출판사";
    book.pageSize = 783;
    book.language = "korean";
    book.isbn = "11-123-11";
    book.authors = new String[] {"홍길동", "임꺽정"};
    book.width = 7.4f;
    book.height = 9.1f;
    book.thick = 1.6f;
    book.price = 83.33;
    book.dvd = false;

    System.out.println(book.title);
    System.out.println(book.publisher);
    System.out.println(book.pageSize);
    System.out.println(book.language);
    System.out.println(book.isbn);
    for (String name : book.authors) {
      System.out.print(name + ",");
    }
    System.out.println();
    System.out.println(book.width);
    System.out.println(book.height);
    System.out.println(book.thick);
    System.out.println(book.price);
    System.out.println(book.dvd);

  }
}

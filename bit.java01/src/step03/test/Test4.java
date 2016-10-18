/* Quiz
클래스 문법을 이용하여 교육센터의 한 명의 수강생 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test4 {
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
    Book.isbn = 100;

  }
}

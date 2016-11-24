package step22.ex1;

public class Test1 {

  public static void main(String[] args) {
    // 추상 클래스는 인스턴스를 생성할 수 없다.
    MyAbstract obj; // 레퍼런스 변수는 인터페이스나 추상 클래스나 모두 가능하다.
    
    // 그러나 인스턴스는 생성 불가!
    obj = new MyAbstract(); // 컴파일 오류!
    

  }

}

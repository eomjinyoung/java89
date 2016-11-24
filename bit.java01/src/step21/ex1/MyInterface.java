// 인터페이스 작성 규칙
package step21.ex1;

public interface MyInterface {
  // 인터페이스는 인스턴스를 직접 생성할 수 없기 때문에
  // 인스턴스 변수를 가질 수 없다.
  // 스태틱 변수를 가질 수 있는데 무조건 final 이어야 한다.
  // 또한 인터페이스는 규칙이기 때문에 무조건 공개해야 한다.
  public static final int v1 = 100;
  
  //물론 public을 생략해도 컴파일할 때 자동으로 public이 붙는다.
  static final int v2 = 100;
  
  //static을 생략해도 컴파일할 때 자동으로 붙는다.
  public final int v3 = 100;
  
  //final을 생략해도 컴파일할 때 자동으로 붙는다.
  public static int v4 = 100;
  
  //따라서 모두 생략해도 된다. 
  //=> 즉 인터페이스에 선언하는 변수는 무조건 public static final 이다. 
  /* public static final */int v5 = 100;
  
}








/* final 사용
 * - 클래스 앞에 붙으면 상속 불가!
 * - 메서드 앞에 붙으면 오버라이딩 불가!
 * - 변수 앞에 붙으면 값을 한 번만 할당!
 */
package step16.ex6;

public class MyClass2 {
  // 메서드 앞에 final을 붙이면 오버라이딩 불가!
  // => 임의의 기능 변경을 막기 위해 
  public final void m1() {}
  public void m2() {}
}

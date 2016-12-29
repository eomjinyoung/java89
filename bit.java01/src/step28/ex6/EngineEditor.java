/* 역할: 문자열을 Engine 객체로 변환시켜주는 에디터.
 * => 에디터를 만드는 자바 기본 규칙에 따라 클래스를 작성해야 한다.
 * => java.beans.PropertyEditor 인터페이스를 구현해야 한다.
 * => 그러나 인터페이스를 직접 구현하게 되면 너무 많은 메서드를 작성해야 한다.
 * => 그래서 인터페이스를 직접 구현하는 대신에 미리 구현해놓고
 *    개발자에게 쓰라고 제공해주는 도우미 클래스를 상속 받아라!
 */
package step28.ex6;

import java.beans.PropertyEditorSupport;

public class EngineEditor extends PropertyEditorSupport {
  
  // 문자열을 Engine 객체로 변환해야할 때 마다 호출되는 메서드를 재정의 하라!
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    // 문자열을 콤마(,)로 분리한다.
    String[] values = text.split(",");
    
    // 각각의 문자열 값을 int로 변환하여 Engine 객체에 담는다.
    Engine obj = new Engine();
    obj.setValve(Integer.parseInt(values[0]));
    obj.setVentil(Integer.parseInt(values[1]));
    
    // Engine 객체를 값을 저장한다. 스프링 IoC 컨테이너는 이 객체를 사용할 것이다.
    this.setValue(obj);
  }

}









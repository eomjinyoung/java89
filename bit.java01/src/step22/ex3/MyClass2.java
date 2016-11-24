package step22.ex3;

import java.util.HashMap;

// 이미 다른 클래스를 상속 받고 있다면,
// 해당 추상 클래스를 구현할 수 없다.
// 왜? 다중 상속을 허용하지 않기 때문이다.
public class MyClass2 extends HashMap, MyAbstract1 {
  
}

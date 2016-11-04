/* 주제: 셋터와 겟터 */
package step16.ex5;

public class Customer {
  private String name;
  private int age;
  private boolean gender;

  // 1) 셋터(setter)
  // => 접근이 제한된 변수에 값을 넣을 수 있도록 중재해주는 공개 메서드
  // => 메서드 명은 "set"으로 시작한다.
  // => "set" 다음은 이름은 단어 별로 첫 알파벳을 대문자로 한다.
  //   예) setName, setFirstName, setLastName, setScoreSum
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0 || age > 130) {
      throw new RuntimeException("나이가 유효하지 않습니다.");
    }
    this.age = age;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  // 2) 겟터(getter)
  // => 접근이 제한된 변수의 값을 꺼낼 수 있도록 중재해주는 공개 메서드
  // => 메서드 명은 "get"으로 시작한다. 
  //    단, 리턴 타입이 boolean인 경우 "get"도 사용할 수 있지만,
  //    주로 "is"를 사용한다.  
  // => "get" 다음은 이름은 단어 별로 첫 알파벳을 대문자로 한다.
  //   예) getName, getFirstName, getLastName, getScoreSum
  //
  public String getName() {return this.name;}
  public int getAge() {return this.age;}
  public boolean isGender() {return this.gender;}
}
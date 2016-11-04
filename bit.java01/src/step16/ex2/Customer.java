package step16.ex2;

public class Customer {
  private String name;
  private int age;
  private boolean gender;

  // 변수의 값을 설정하는 메서드 : setter 
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

  // 값을 꺼내는 메서드 : getter
  public String getName() {return this.name;}
  public int getAge() {return this.age;}
  public boolean getGender() {return this.gender;}
}
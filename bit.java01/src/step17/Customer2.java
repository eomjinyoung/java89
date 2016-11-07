package step17;

public class Customer2 {
  private String name;
  private int age;
  private boolean gender;

  public Customer2() {}

  public Customer2(String name, int age, boolean gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

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

  public String getName() {return this.name;}
  public int getAge() {return this.age;}
  public boolean isGender() {return this.gender;}

  @Override
  public String toString() {
    return this.name + "," + this.age + "," + this.gender;
  }

  @Override
  public int hashCode() {
    String value = String.format("%s,%d,%b", this.name, this.age, this.gender);
    return value.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;

    if (!(obj instanceof Customer2)) return false;

    Customer2 other = (Customer2)obj;

    if (!this.name.equals(other.name)) return false;
    if (this.age != other.age) return false;
    if (this.gender != other.gender) return false;

    return true; 
  }
}
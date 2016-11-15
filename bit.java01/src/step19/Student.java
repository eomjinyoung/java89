package step19;

public class Student {
  String name;
  int age;
  boolean working;

  public Student() {}

  public Student(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override
  public String toString() {
    return String.format("%s,%d,%b", this.name, this.age, this.working);
  }
}
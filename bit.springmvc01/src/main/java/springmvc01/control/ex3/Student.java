package springmvc01.control.ex3;

public class Student {
  protected String name;
  protected int age;
  protected boolean work;
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", work=" + work + "]";
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public boolean isWork() {
    return work;
  }
  public void setWork(boolean work) {
    this.work = work;
  }
  
  
}

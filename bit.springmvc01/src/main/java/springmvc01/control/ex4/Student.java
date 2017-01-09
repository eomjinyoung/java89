package springmvc01.control.ex4;

public class Student {
  protected String name;
  protected int age;
  protected boolean work;
  protected String photoPath1;
  protected String photoPath2;
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", work=" + work + ", photoPath1=" + photoPath1 + ", photoPath2="
        + photoPath2 + "]";
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

  public String getPhotoPath1() {
    return photoPath1;
  }

  public void setPhotoPath1(String photoPath1) {
    this.photoPath1 = photoPath1;
  }

  public String getPhotoPath2() {
    return photoPath2;
  }

  public void setPhotoPath2(String photoPath2) {
    this.photoPath2 = photoPath2;
  }
  
  
}

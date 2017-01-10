package step29.ex2;

public class Contact {
  protected String email;
  protected String name;
  protected String tel;
  protected String position;
  
  @Override
  public String toString() {
    return "Contact [email=" + email + ", name=" + name + ", tel=" + tel + ", position=" + position + "]";
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }
  
  
}

package step29.ex4;

public class Student extends Member {
  private static final long serialVersionUID = 1L;
  
  protected boolean working;
  protected String grade;
  protected String schoolName;
  protected String postNo;
  protected String basicAddress;
  protected String detailAddress;
  protected String photoPath;
  
  public boolean isWorking() {
    return working;
  }
  public void setWorking(boolean working) {
    this.working = working;
  }
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
  public String getSchoolName() {
    return schoolName;
  }
  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }
  public String getPostNo() {
    return postNo;
  }
  public void setPostNo(String postNo) {
    this.postNo = postNo;
  }
  public String getBasicAddress() {
    return basicAddress;
  }
  public void setBasicAddress(String basicAddress) {
    this.basicAddress = basicAddress;
  }
  public String getDetailAddress() {
    return detailAddress;
  }
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }
  public String getPhotoPath() {
    return photoPath;
  }
  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }
  
  
}

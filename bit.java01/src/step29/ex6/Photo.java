package step29.ex6;

import java.io.Serializable;

public class Photo implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected int no;
  protected String filePath;
  protected int ownerNo;
  
  public Photo() {}
  
  public Photo(String filePath) {
    this.filePath = filePath;
  }
  
  public int getNo() {
    return no;
  }
  public Photo setNo(int no) {
    this.no = no;
    return this;
  }
  public String getFilePath() {
    return filePath;
  }
  public Photo setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }
  public int getOwnerNo() {
    return ownerNo;
  }
  public Photo setOwnerNo(int ownerNo) {
    this.ownerNo = ownerNo;
    return this;
  }
  
  
  
}

package step29.ex6;

import java.util.List;

public class Teacher extends Member {
  private static final long serialVersionUID = 1L;
  
  protected String homepage;
  protected String facebook;
  protected String twitter;
  protected List<Photo> photoList;
  
  public String getHomepage() {
    return homepage;
  }
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }
  public String getFacebook() {
    return facebook;
  }
  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }
  public String getTwitter() {
    return twitter;
  }
  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }
  public List<Photo> getPhotoList() {
    return photoList;
  }
  public void setPhotoList(List<Photo> photoList) {
    this.photoList = photoList;
  }
  
  
  
  
}

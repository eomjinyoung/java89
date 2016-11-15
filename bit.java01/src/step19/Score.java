package step19;

import java.io.Serializable;

public class Score implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float average;
  
  public Score() {
  }
  
  public Score(String name, int kor, int eng, int math) {
    super();
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    
    this.compute();
  }

  @Override
  public String toString() {
    return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", average="
        + average + "]";
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3f;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }
  public int getEng() {
    return eng;
  }
  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }
  public int getMath() {
    return math;
  }
  public void setMath(int math) {
    this.math = math;
    this.compute();
  }
  public int getSum() {
    return sum;
  }
  public float getAverage() {
    return average;
  }
}

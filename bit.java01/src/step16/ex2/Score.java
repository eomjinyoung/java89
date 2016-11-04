package step16.ex2;

public class Score {
  String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float average;

  public Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = kor + eng + math;
    this.average = this.sum / 3.0f;
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3f;
  }

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getSum() {
    return this.sum;
  }

  public float getAverage() {
    return this.average;
  }

}
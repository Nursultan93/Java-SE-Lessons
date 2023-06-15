package inheritance.extendes;

public class BMW extends Car{

  private boolean isSport;

  public BMW() {
  }

  public BMW(boolean isSport) {
    this.isSport = isSport;
  }

  public boolean isSport() {
    return isSport;
  }

  public void setSport(boolean sport) {
    isSport = sport;
  }
}

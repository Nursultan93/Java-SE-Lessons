package inheritance.extendes;

public class Opel extends Car{

  private boolean isVan;

  public Opel() {
  }

  public Opel(boolean isVan) {
    this.isVan = isVan;
  }

  public boolean isVan() {
    return isVan;
  }

  public void setVan(boolean van) {
    isVan = van;
  }
}

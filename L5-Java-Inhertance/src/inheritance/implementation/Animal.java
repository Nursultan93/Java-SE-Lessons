package inheritance.implementation;

public class Animal {

  private String novu;
  private boolean etYenen;

  public Animal() {
  }

  public Animal(String novu, boolean etYenen) {
    this.novu = novu;
    this.etYenen = etYenen;
  }

  public String getNovu() {
    return novu;
  }

  public void setNovu(String novu) {
    this.novu = novu;
  }

  public boolean isEtYenen() {
    return etYenen;
  }

  public void setEtYenen(boolean etYenen) {
    this.etYenen = etYenen;
  }


}

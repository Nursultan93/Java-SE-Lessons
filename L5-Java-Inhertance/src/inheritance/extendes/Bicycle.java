package inheritance.extendes;

public class Bicycle extends Vehicle{

  private String model;

  public Bicycle() {
  }

  public Bicycle(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}

package inheritance.extendes;

public class Car extends Vehicle{

  private String model;
  private String createdYear;

  public Car() {
  }

  public Car(String model, String createdYear) {
    this.model = model;
    this.createdYear = createdYear;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getCreatedYear() {
    return createdYear;
  }

  public void setCreatedYear(String createdYear) {
    this.createdYear = createdYear;
  }
}

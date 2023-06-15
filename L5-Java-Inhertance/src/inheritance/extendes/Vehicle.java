package inheritance.extendes;

public class Vehicle {

  private int maxSpeed;
  private int wheelCount;

  public Vehicle() {
  }

  public Vehicle(int speed, int wheelCount) {
    this.maxSpeed = speed;
    this.wheelCount = wheelCount;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int speed) {
    this.maxSpeed = speed;
  }

  public int getWheelCount() {
    return wheelCount;
  }

  public void setWheelCount(int wheelCount) {
    this.wheelCount = wheelCount;
  }
}

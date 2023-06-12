public class Dog extends Pet {

  @Override
  public void run() {
    System.out.println("Dog is running");
  }

  @Override
  public void sleep() {
    System.out.println("Dog is sleeping");
  }

  @Override
  public void walk() {
    System.out.println("Dog is walking");
  }
}

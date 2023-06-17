package abstractclass;

public class Dog extends Animal{
  @Override
  public void yemek() {
    System.out.println("Dog et yeyir");
  }

  @Override
  public void gezmek() {
    System.out.println("Dog heyetde gezir");
  }

  @Override
  public void yasamaq() {
    System.out.println("Dog insanlarla yasaya bilir");
  }
}

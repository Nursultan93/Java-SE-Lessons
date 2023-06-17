package abstractclass;

public class Eagle extends Animal{
  @Override
  public void yemek() {
    System.out.println("Eagle et yeyir");
  }

  @Override
  public void gezmek() {
    System.out.println("Eagle qayaliqlarda gezir");
  }

  @Override
  public void yasamaq() {
    System.out.println("Eagle insanlarla yasaya bilmir");
  }
}

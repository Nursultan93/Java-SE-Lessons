package abstractclass;

public class Tiger extends Animal{
  @Override
  public void yemek() {
    System.out.println("Tiger et yeyir");
  }

  @Override
  public void gezmek() {
    System.out.println("Tiger savannada gezir");
  }

  @Override
  public void yasamaq() {
    System.out.println("Tiger insanlarla yasaya bilmir");
  }
}

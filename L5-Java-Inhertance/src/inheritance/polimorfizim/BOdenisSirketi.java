package inheritance.polimorfizim;

public class BOdenisSirketi implements OdemeSirketleri{
  @Override
  public void pay() {
    System.out.println("BOdenisSirketi odenis edir");
  }
}

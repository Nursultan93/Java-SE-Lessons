package inheritance.polimorfizim;

public class COdenisSirketi implements OdemeSirketleri{
  @Override
  public void pay() {
    System.out.println("COdenisSirketi odenis edir");
  }
}

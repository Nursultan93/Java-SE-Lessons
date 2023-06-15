package inheritance.polimorfizim;

public class AOdenisSirketi implements OdemeSirketleri{

  @Override
  public void pay() {
    System.out.println("AOdenisSirketi odenis edir");
  }
}

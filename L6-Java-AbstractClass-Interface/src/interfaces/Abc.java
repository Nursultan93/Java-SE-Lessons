package interfaces;

public class Abc implements C{

  @Override
  public void b() {

  }

  @Override
  public void c() {

  }

  static void s() {
    System.out.println("abc static");
  }

  public static void main(String[] args) {
    Abc.s();
    C.s();
  }
}
